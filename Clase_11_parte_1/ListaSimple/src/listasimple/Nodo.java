/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimple;

/**
 *
 * @author Ricardo
 */
/**
 * Nodo de una lista simple enlazada de cadenas .
 */
public class Nodo {

    private Object elemento; // Los elementos son cadenas de caracteres
    private Nodo sig;

    /**
     * Crea un nodo con el elemento dado y el nodo sig .
     */
    public Nodo(Object s, Nodo n) {
        elemento = s;
        sig = n;
    }

    /**
     * Regresa el elemento de este nodo .
     */
    public Object getElemento() {
        return elemento;
    }

    /**
     * Regresa el nodo siguiente de este nodo .
     */
    public Nodo getSig() {
        return sig;
    }

    // m´e todos modificadores
    /**
     * Poner el elemento de este nodo .
     */
    public void setElemento(Object nvoElem) {
        elemento = nvoElem;
    }

    /**
     * Poner el nodo sig de este nodo .
     */
    public void setSig(Nodo nvoSig) {
        sig = nvoSig;
    }
}
