/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import AccesoDatos.ClienteArchivo;
import Entidad.Cliente;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class ClienteLogica {
    
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
    private void setHayError(boolean hayError) {
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
    private void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
    
    public Boolean Agregar(Cliente Cliente) {
        
        ClienteArchivo oClienteArchivo=new ClienteArchivo();
        this.setHayError(oClienteArchivo.Agregar(Cliente));
        if(!this.isHayError())
        {
            this.setMensajeError("No se agrego el cliente");
        }
        return this.isHayError();
    }
    
    public Boolean Editar(Cliente Cliente) {
        
        ClienteArchivo oClienteArchivo=new ClienteArchivo();
        this.setHayError(oClienteArchivo.Editar(Cliente));
        if(!this.isHayError())
        {
            this.setMensajeError("No se edito el cliente");
        }
        return this.isHayError();
    }
    
    public Boolean Eliminar(Cliente Cliente) {
        
        ClienteArchivo oClienteArchivo=new ClienteArchivo();
        this.setHayError(oClienteArchivo.Eliminar(Cliente));
        if(!this.isHayError())
        {
            this.setMensajeError("No se elimino el cliente");
        }
        return this.isHayError();
    }

    public List<Cliente> Obtener() {
        ClienteArchivo oClienteArchivo=new ClienteArchivo();
        List<Cliente> clientes=oClienteArchivo.Obtener();
        return clientes;
    }
    
    
}
