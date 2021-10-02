/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimplenodo;

/**
 *
 * @author Ricardo
 */
public class Nodo {

    /**
     * @return the elemento
     */
    public Object getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    private Object elemento;
    private Nodo siguiente;
    //private Nodo anterior;
    
    
    public Nodo(Object valor,Nodo siguiente)
    {
        this.setElemento(valor);
        this.setSiguiente(siguiente);
    }
}
