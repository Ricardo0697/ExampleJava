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
 * Lista simple enlazada .
 */
public class ListaSimple {

    protected long tam; // cantidad de nodos en la lista
    private Nodo inicio;
    private Nodo fin;

    /**
     * constructor por defecto que crea una lista vac ´ıa
     */
    public ListaSimple() {
        inicio = null;
        tam = 0;
    }

    /**
     * Prueba que la lista esté vacía.
     *
     * @return true si está vacía y false en otro caso.
     */
    public boolean EstaVacia() {
        return inicio == null && fin == null;
    }

    /**
     * Crea una lista vacía.
     */
    public void Vaciar() {
        inicio = fin = null;
    }

    /**
     * Devuelve el primer elemento de la lista *
     */
    public Object PrimerElemento() {
        return (EstaVacia()) ? null : inicio.getElemento();
    }

    /**
     * Devuelve el último elemento de la lista *
     */
    public Object UltimoElemento() {
        return (EstaVacia()) ? null : fin.getElemento();
    }

    /**
     * Determina si un elemento está contenido en la lista.
     *
     * @param dato el elemento a buscar.
     * @return boolean - true si el dato está en la lista y false en otro caso.
     */
    public boolean Contiene(Object dato) {
        Nodo pos = inicio;

        while (pos != null && !dato.equals(pos.getElemento())) {
            pos = pos.getSig();
        }
        return pos != null;
    }

    /**
     * Sustituye el valor actual de un nodo por otro nuevo.
     *
     * @param orig -- valor original
     * @param nuevo -- nuevo valor
     */
    public void Sustituir(Object orig, Object nuevo) {
        Nodo pos = inicio;

        while (pos != null && !orig.equals(pos.getElemento())) {
            pos = pos.getSig();
        }
        if (pos != null) {
            pos.setElemento(nuevo);
        }
    }

    /**
     * Inserta el primer elemento de la lista.
     *
     * @param dato el dato a Agregar.
     */
    public void AgregarAlInicio(Object dato) {
        if (EstaVacia()) {
            inicio = fin = new Nodo(dato,null);
        } else {
            inicio = new Nodo(dato, inicio);
        }

    }

    /**
     * Inserta el último elemento de la lista.
     *
     * @param dato el dato a Agregar.
     */
    public void Agregar(Object dato) {
        if (EstaVacia()) {
            inicio = fin = new Nodo(dato,null);
        } else {
            fin.setSig(new Nodo(dato,null));
            fin=fin.getSig();
        }
    }

    /**
     * Elimina la primera ocurrencia de un dato.
     *
     * @param dato el dato a Eliminar.
     */
    public void Eliminar(Object dato) {
        Nodo pos = inicio, anterior = null;

        while (pos != null && !dato.equals(pos.getElemento())) {
            anterior = pos;
            pos = pos.getSig();
        }
        if (pos == null) {
            return;   // No lo encontró
        }
        if (pos == inicio) {        // Es el inicio de la lista
            inicio = inicio.getSig();
            if (inicio == null) {
                fin = null;
            }
        } else {
            anterior.setSig(pos.getSig());
            if (anterior.getSig() == null) {
                fin = anterior;
            }
        }
    }

    public void EliminarPrimero() {
        if (!EstaVacia()) {
            inicio = inicio.getSig();
            if (inicio == null) {
                fin = null;
            }
        }
    }

// Método para imprimir
    public void Imprime() {
        if (EstaVacia()) {
            System.out.print("La lista está vacía");
        } else {
            for (Nodo pos = inicio; pos != null; pos = pos.getSig()) {
                System.out.print(pos.getElemento() + " ");
            }
            System.out.println();
        }
    }

}
