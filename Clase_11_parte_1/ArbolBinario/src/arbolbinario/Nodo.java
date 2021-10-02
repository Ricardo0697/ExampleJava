/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author Ricardo
 */
class Nodo {
    private Object dato;
    private Nodo izquierda, derecha;

    public Nodo(Object dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }


    public Object getDato() {
        return dato;
    }
    
    public void setDato(Object dato) {
        this.dato=dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }
    
    
}
