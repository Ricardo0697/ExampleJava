/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad;

/**
 *
 * @author Ricardo
 */
public class Validacion {
    
    private String usuario;
    private String contrasena;
    
    public Validacion()
    {
    }
    
    public Validacion(String usuario,String contrasena)
    {
        this.setContrasena(contrasena);
        this.setUsuario(usuario);
    }
    
    public boolean ValidarEntrada()
    {
        if(this.getUsuario().length()>=8 && this.getContrasena().length()>=8)
            return true;
        return false;
    }
    
    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
