/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import AccesoDatos.Conexion;
import Entidad.Cliente;
import Entidad.Producto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class ClienteLogica {
    
    private boolean existeError=false;
    private String mensajeError="";
    
    public void Crear(Cliente cliente)
    {
        Conexion conexion=new Conexion();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="INSERT INTO cliente ("+
                    "cedula"+","+
                    "nombre"+","+
                    "direccion"+")"+
                    " VALUES "+
                    "("+
                    "'"+cliente.getCedula()+"'"+","+
                    "'"+cliente.getNombre()+"'"+","+
                    "'"+cliente.getDireccion()+"'"+")";
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
    
    public void Editar(Cliente cliente)
    {
        Conexion conexion=new Conexion();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="UPDATE cliente SET "+
                    "cedula"+"="+"'"+cliente.getCedula()+"'"+","+
                    "nombre"+"="+"'"+cliente.getNombre()+"'"+","+
                    "direccion"+"="+"'"+cliente.getDireccion()+"'"+
                    " WHERE id"+"="+cliente.getId();
                    
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
    
    public void Eliminar(Cliente cliente)
    {
        Conexion conexion=new Conexion();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="DELETE FROM cliente "+
                    " WHERE id"+"="+cliente.getId();
                    
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
    
    public List<Cliente> Obtener()
    {
        Conexion conexion=new Conexion();
        List<Cliente> clientes=new ArrayList<>();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="SELECT * FROM cliente ";                    
            ResultSet queryResult=ejecucion.executeQuery(sql);
            while (queryResult.next()) {
                Cliente ciente=new Cliente();
                
                String id=queryResult.getString("id");
                ciente.setId(Integer.parseInt(id));
                
                String cedula=queryResult.getString("cedula");
                ciente.setCedula(cedula);
                
                String nombre=queryResult.getString("nombre");
                ciente.setNombre(nombre);
                
                String direccion=queryResult.getString("direccion");
                ciente.setDireccion(direccion);                
                
                clientes.add(ciente);
                
            }
            ejecucion.close();            
            //Siempre desconectarse del servidor de base de datos o se quedan sin trabajo
            // gracias =)
            conexion.Desconectar();           
            
        } catch (Exception e) {
            this.setExisteError(true);
            this.setMensajeError(e.getMessage());
        }
        return clientes;
    }
    
    public List<Cliente> Buscar(Cliente cliente)
    {
        Conexion conexion=new Conexion();
        List<Cliente> clientes=new ArrayList<>();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="SELECT * FROM cliente "
                    + "WHERE nombre LIKE '%"+cliente.getNombre()+"%'";                    
            ResultSet queryResult=ejecucion.executeQuery(sql);
            while (queryResult.next()) {
                Cliente ciente=new Cliente();
                
                String id=queryResult.getString("id");
                ciente.setId(Integer.parseInt(id));
                
                String cedula=queryResult.getString("cedula");
                ciente.setCedula(cedula);
                
                String nombre=queryResult.getString("nombre");
                ciente.setNombre(nombre);
                
                String direccion=queryResult.getString("direccion");
                ciente.setDireccion(direccion);                
                
                clientes.add(ciente);
            }
            ejecucion.close();            
            //Siempre desconectarse del servidor de base de datos o se quedan sin trabajo
            // gracias =)
            conexion.Desconectar();           
            
        } catch (Exception e) {
            this.setExisteError(true);
            this.setMensajeError(e.getMessage());
        }
        return clientes;
    }
    
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
    
    
    
    
    
}
