/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import AccesoDatos.ClienteArchivo;
import AccesoDatos.EmpleadoArchivo;
import Entidad.Cliente;
import Entidad.Empleado;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class EmpleadoLogica {
    
    private boolean hayError;
    private String mensajeError;

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
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
    
    public Boolean Agregar(Empleado empleado) {
        
        EmpleadoArchivo oEmpleadoArchivo=new EmpleadoArchivo();
        this.setHayError(oEmpleadoArchivo.Agregar(empleado));
        if(!this.isHayError())
        {
            this.setMensajeError("No se agrego el empleado");
        }
        return this.isHayError();
    }
    
    public Boolean Editar(Empleado empleado) {
        
        EmpleadoArchivo oEmpleadoArchivo=new EmpleadoArchivo();
        this.setHayError(oEmpleadoArchivo.Editar(empleado));
        if(!this.isHayError())
        {
            this.setMensajeError("No se edito el empleado");
        }
        return this.isHayError();
    }
    
    public Boolean Eliminar(Empleado empleado) {
        
        EmpleadoArchivo oEmpleadoArchivo=new EmpleadoArchivo();
        this.setHayError(oEmpleadoArchivo.Eliminar(empleado));
        if(!this.isHayError())
        {
            this.setMensajeError("No se elimino el empleado");
        }
        return this.isHayError();
    }

    public List<Empleado> Obtener() {
        EmpleadoArchivo oEmpleadoArchivo=new EmpleadoArchivo();
        List<Empleado> empleados=oEmpleadoArchivo.Obtener();
        return empleados;
    }
    
    
    
}
