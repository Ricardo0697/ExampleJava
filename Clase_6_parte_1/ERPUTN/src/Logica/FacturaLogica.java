/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import AccesoDatos.Conexion;
import Entidad.Cliente;
import Entidad.DetalleFactura;
import Entidad.Factura;
import Entidad.Producto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class FacturaLogica {

    /**
     * @return the existeError
     */
    public boolean isExisteError() {
        return existeError;
    }

    /**
     * @param existeError the existeError to set
     */
    public void setExisteError(boolean existeError) {
        this.existeError = existeError;
    }

    /**
     * @return the mensajeError
     */
    public String getMensajeError() {
        return mensajeError;
    }

    /**
     * @param mensajeError the mensajeError to set
     */
    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    private boolean existeError = false;
    private String mensajeError = "";

    public void Crear(Factura factura, List<DetalleFactura> detalleFactura) {
        Conexion conexion = new Conexion();
        try {
            Statement ejecucion;
            ejecucion = conexion.getConnection().createStatement();
            String sql = "INSERT INTO factura ("
                    + "fecha, cliente, total, subtotal, gravado, exento)"
                    + " VALUES "
                    + "("
                    + "'" + factura.getFecha() + "'" + ","
                    + factura.getCliente().getId() + ","
                    + factura.getTotal() + ","
                    + factura.getSubtotal() + ","
                    + factura.getGravado() + ","
                    + factura.getExento() + ") RETURNING id;";

            ResultSet queryResult = ejecucion.executeQuery(sql);
            int idFactura = 0;
            while (queryResult.next()) {
                idFactura = Integer.parseInt(queryResult.getString("id"));
            }
            String sqlDetalle = "";
            for (int i = 0; i < detalleFactura.size(); i++) {

                sqlDetalle += "INSERT INTO detalle_factura ("
                        + "id_factura, linea, id_producto, cantidad, descuento,"
                        + " total, precio_unitario)"
                        + " VALUES "
                        + "("
                        + idFactura + ","
                        + detalleFactura.get(i).getLinea() + ","
                        + detalleFactura.get(i).getProducto().getId() + ","
                        + detalleFactura.get(i).getCantidad() + ","
                        + detalleFactura.get(i).getDescuento() + ","
                        + detalleFactura.get(i).getTotal() + ","
                        + detalleFactura.get(i).getPrecio_unitario() + "); ";
            }

            ejecucion.execute(sqlDetalle);

            //Siempre desconectarse del servidor de base de datos o se quedan sin trabajo
            // gracias =)
            conexion.Desconectar();

        } catch (Exception e) {
            this.setExisteError(true);
            this.setMensajeError(e.getMessage());
        }
    }
    
    public List<Factura> Obtener()
    {
        Conexion conexion=new Conexion();
        List<Factura> facturas=new ArrayList<Factura>();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="SELECT * FROM factura; ";                    
            ResultSet queryResult=ejecucion.executeQuery(sql);
            while (queryResult.next()) {
                Factura factura=new Factura();
                
                String id=queryResult.getString("id");
                factura.setId(Integer.parseInt(id));
                
                String fecha=queryResult.getString("fecha");
                factura.setFecha(fecha);
                
                String clienteNombre=queryResult.getString("cliente");
                //int id_cliente=Integer.parseInt(queryResult.getString("cliente"));
                Cliente cliente=new Cliente();
                //cliente.setId(id_cliente);
                cliente.setNombre(clienteNombre);
                factura.setCliente(cliente);
                
                float total=Float.parseFloat(queryResult.getString("total"));
                factura.setTotal(total);
                
                float subtotal=Float.parseFloat(queryResult.getString("subtotal"));
                factura.setSubtotal(subtotal);
                
                float gravado=Float.parseFloat(queryResult.getString("gravado"));
                factura.setGravado(gravado);
                
                float exento=Float.parseFloat(queryResult.getString("exento"));
                factura.setExento(exento);
                
                facturas.add(factura);
            }
            ejecucion.close();            
            //Siempre desconectarse del servidor de base de datos o se quedan sin trabajo
            // gracias =)
            conexion.Desconectar();           
            
        } catch (Exception e) {
            this.setExisteError(true);
            this.setMensajeError(e.getMessage());
        }
        return facturas;
    }
    
    
    

}
