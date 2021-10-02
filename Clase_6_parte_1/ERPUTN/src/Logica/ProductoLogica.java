/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import AccesoDatos.Conexion;
import Entidad.Producto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class ProductoLogica {

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
    
    private boolean existeError=false;
    private String mensajeError="";
    
    public void Crear(Producto producto)
    {
        Conexion conexion=new Conexion();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="INSERT INTO prodcuto ("+
                    "nombre,codigo,unidad,precio_unitario,impuesto,descuento)"+
                    " VALUES "+
                    "("+
                    "'"+producto.getNombre()+"'"+","+
                    "'"+producto.getCodigo()+"'"+","+
                    "'"+producto.getUnidad()+"'"+","+
                    producto.getPrecioUnitario()+","+
                    producto.getImpuesto()+","+
                    producto.getDescuento()+");";
            ejecucion.execute(sql);
            ejecucion.close();            
            //Siempre desconectarse del servidor de base de datos o se quedan sin trabajo
            // gracias =)
            conexion.Desconectar();           
            
        } catch (Exception e) {
            this.setExisteError(true);
            this.setMensajeError(e.getMessage());
        }        
    }
    
    public void Editar(Producto producto)
    {
        Conexion conexion=new Conexion();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="UPDATE usuario SET "+
                    "nombre"+"="+"'"+producto.getNombre()+"'"+","+
                    "codigo"+"="+"'"+producto.getCodigo()+"'"+","+
                    "precio_unitario"+"="+producto.getPrecioUnitario()+","+
                    "impuesto"+"="+producto.getImpuesto()+","+
                    "descuento"+"="+producto.getDescuento()+
                    " WHERE id"+"="+producto.getId();
                    
            ejecucion.execute(sql);
            ejecucion.close();            
            //Siempre desconectarse del servidor de base de datos o se quedan sin trabajo
            // gracias =)
            conexion.Desconectar();           
            
        } catch (Exception e) {
            this.setExisteError(true);
            this.setMensajeError(e.getMessage());
        }        
    }
    
    public void Eliminar(Producto producto)
    {
        Conexion conexion=new Conexion();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="DELETE FROM producto "+
                    " WHERE id"+"="+producto.getId();
                    
            ejecucion.execute(sql);
            ejecucion.close();            
            //Siempre desconectarse del servidor de base de datos o se quedan sin trabajo
            // gracias =)
            conexion.Desconectar();           
            
        } catch (Exception e) {
            this.setExisteError(true);
            this.setMensajeError(e.getMessage());
        }        
    }
    
    public List<Producto> Obtener()
    {
        Conexion conexion=new Conexion();
        List<Producto> productos=new ArrayList<>();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="SELECT * FROM producto ";                    
            ResultSet queryResult=ejecucion.executeQuery(sql);
            while (queryResult.next()) {
                Producto producto=new Producto();
                
                String id=queryResult.getString("id");
                producto.setId(Integer.parseInt(id));
                
                String nombre=queryResult.getString("nombre");
                producto.setNombre(nombre);
                
                String codigo=queryResult.getString("codigo");
                producto.setCodigo(codigo);
                
                String unidad=queryResult.getString("unidad");
                producto.setUnidad(unidad);
                
                float precioUnitario=Float.parseFloat(queryResult.getString("precio_unitario"));
                producto.setPrecioUnitario(precioUnitario);
                
                float impuesto=Float.parseFloat(queryResult.getString("impuesto"));
                producto.setImpuesto(impuesto);
                
                float descuento=Float.parseFloat(queryResult.getString("descuento"));
                producto.setDescuento(descuento);                
                
                productos.add(producto);
            }
            ejecucion.close();            
            //Siempre desconectarse del servidor de base de datos o se quedan sin trabajo
            // gracias =)
            conexion.Desconectar();           
            
        } catch (Exception e) {
            this.setExisteError(true);
            this.setMensajeError(e.getMessage());
        }
        return productos;
    }
    
    public List<Producto> Buscar(Producto producto)
    {
        Conexion conexion=new Conexion();
        List<Producto> productos=new ArrayList<>();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="SELECT * FROM producto "
                    + "WHERE nombre LIKE '%"+producto.getNombre()+"%'";                    
            ResultSet queryResult=ejecucion.executeQuery(sql);
            while (queryResult.next()) {
                Producto productoTemp=new Producto();
                
                String id=queryResult.getString("id");
                productoTemp.setId(Integer.parseInt(id));
                
                String nombre=queryResult.getString("nombre");
                productoTemp.setNombre(nombre);
                
                String codigo=queryResult.getString("codigo");
                productoTemp.setCodigo(codigo);
                
                String unidad=queryResult.getString("unidad");
                productoTemp.setUnidad(unidad);
                
                float precioUnitario=Float.parseFloat(queryResult.getString("precio_unitario"));
                productoTemp.setPrecioUnitario(precioUnitario);
                
                float impuesto=Float.parseFloat(queryResult.getString("impuesto"));
                productoTemp.setImpuesto(impuesto);
                
                float descuento=Float.parseFloat(queryResult.getString("descuento"));
                productoTemp.setDescuento(descuento);                
                
                productos.add(productoTemp);
            }
            ejecucion.close();            
            //Siempre desconectarse del servidor de base de datos o se quedan sin trabajo
            // gracias =)
            conexion.Desconectar();           
            
        } catch (Exception e) {
            this.setExisteError(true);
            this.setMensajeError(e.getMessage());
        }
        return productos;
    }
}
