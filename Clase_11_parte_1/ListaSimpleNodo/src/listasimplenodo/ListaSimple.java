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
public class ListaSimple {

    /**
     * @return the tamanno
     */
    public long getTamanno() {
        return tamanno;
    }

    /**
     * @param tamanno the tamanno to set
     */
    public void setTamanno(long tamanno) {
        this.tamanno = tamanno;
    }

    /**
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public Nodo getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    private long tamanno;
    private Nodo inicio;
    private Nodo fin;

    public ListaSimple() {
        this.setInicio(null);
        this.setTamanno(0);
    }

    public boolean EstaVacia() {
        if ((this.getInicio() == null) && this.getFin() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Agregar(Object dato) {
        if (this.EstaVacia()) {
            this.inicio = this.fin = new Nodo(dato, null);
        } else {
            fin.setSiguiente(new Nodo(dato, null));
            fin = fin.getSiguiente();
        }
    }

    public void Imprimir() {
        if (this.EstaVacia()) {
            System.out.print("La lista está vacía");
        } else {
            for (Nodo pos = inicio; pos != null; pos = pos.getSiguiente()) {
                System.out.print(pos.getElemento() + " ");
            }
            System.out.println();
        }
    }

    public void Eliminar(Object dato) {
        Nodo pos = inicio, anterior = null;
        while (pos != null && !dato.equals(pos.getElemento())) {
            anterior = pos;
            pos = pos.getSiguiente();
        }
        if (pos == null) {
            return;   // No lo encontró
        }
        if (pos == inicio) {        // Es el inicio de la lista
            inicio = inicio.getSiguiente();
            if (inicio == null) {
                fin = null;
            }
        } else {
            anterior.setSiguiente(pos.getSiguiente());
            if (anterior.getSiguiente() == null) {
                fin = anterior;
            }
        }
    }
}
