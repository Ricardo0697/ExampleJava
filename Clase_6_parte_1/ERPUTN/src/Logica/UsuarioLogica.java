/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import AccesoDatos.Conexion;
import Entidad.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class UsuarioLogica {
    
    private boolean existeError=false;
    private String mensajeError="";
    
    public void Crear(Usuario usuario)
    {
        Conexion conexion=new Conexion();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="INSERT INTO usuario ("+
                    "nombre"+","+
                    "clave"+")"+
                    " VALUES "+
                    "("+
                    "'"+usuario.getNombre()+"'"+","+
                    "'"+usuario.getClave()+"'"+");";
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
    
    public void Editar(Usuario usuario)
    {
        Conexion conexion=new Conexion();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="UPDATE usuario SET "+
                    "nombre"+"="+"'"+usuario.getNombre()+"'"+","+
                    "clave"+"="+"'"+usuario.getClave()+"'"+
                    " WHERE id"+"="+usuario.getId();
                    
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
    
    public void Eliminar(Usuario usuario)
    {
        Conexion conexion=new Conexion();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="DELETE FROM usuario "+
                    " WHERE id"+"="+usuario.getId();
                    
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
    
    public List<Usuario> Obtener()
    {
        Conexion conexion=new Conexion();
        List<Usuario> usuarios=new ArrayList<>();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="SELECT * FROM usuario ";                    
            ResultSet queryResult=ejecucion.executeQuery(sql);
            while (queryResult.next()) {
                Usuario usuario=new Usuario();
                
                String id=queryResult.getString("id");
                usuario.setId(Integer.parseInt(id));
                
                String nombre=queryResult.getString("nombre");
                usuario.setNombre(nombre);
                
                String clave=queryResult.getString("clave");
                usuario.setClave(clave);                
                
                usuarios.add(usuario);
                
            }
            ejecucion.close();            
            //Siempre desconectarse del servidor de base de datos o se quedan sin trabajo
            // gracias =)
            conexion.Desconectar();           
            
        } catch (Exception e) {
            this.setExisteError(true);
            this.setMensajeError(e.getMessage());
        }
        return usuarios;
    }
    
    public Usuario ExisteUsuario(Usuario usuario)
    {
        Conexion conexion=new Conexion();
        List<Usuario> usuarios=new ArrayList<>();
        try {
            Statement ejecucion;
            ejecucion=conexion.getConnection().createStatement();
            String sql="SELECT * FROM usuario "+
                    " WHERE "+
                    "nombre"+"="+"'"+usuario.getNombre()+"'"+" AND "+
                    "clave"+"="+"'"+usuario.getClave()+"'";                    
            ResultSet queryResult=ejecucion.executeQuery(sql);
            while (queryResult.next()) {
                Usuario usuarioTemp=new Usuario();
                
                String id=queryResult.getString("id");
                usuarioTemp.setId(Integer.parseInt(id));
                
                String nombre=queryResult.getString("nombre");
                usuarioTemp.setNombre(nombre);
                
                String clave=queryResult.getString("clave");
                usuarioTemp.setClave(clave);                
                
                usuarios.add(usuarioTemp);
                
            }
            ejecucion.close();            
            //Siempre desconectarse del servidor de base de datos o se quedan sin trabajo
            // gracias =)
            conexion.Desconectar(); 
            
            if(usuarios.size()>=1)
            {
                return usuarios.get(0);
            }
            
        } catch (Exception e) {
            this.setExisteError(true);
            this.setMensajeError(e.getMessage());
        }
        return null;
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
