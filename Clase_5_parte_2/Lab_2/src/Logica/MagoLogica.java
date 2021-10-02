/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import AccesoDatos.MagoArchivo;
import Entidad.Mago;

/**
 *
 * @author Ricardo
 */
public class MagoLogica {
    
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
    
    public Boolean Agregar(Mago mago) {
        
        MagoArchivo oMagoArchivo=new MagoArchivo();
        this.setHayError(oMagoArchivo.Agregar(mago));
        if(!this.isHayError())
        {
            this.setMensajeError("No se agrego el mago");
        }
        return this.isHayError();
    }
    
    
    
}
