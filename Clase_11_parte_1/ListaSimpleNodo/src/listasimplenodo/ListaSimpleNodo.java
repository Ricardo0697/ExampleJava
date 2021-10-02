/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimplenodo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class ListaSimpleNodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaSimple listaSimple=new ListaSimple();
        listaSimple.Agregar("Dato 1");
        listaSimple.Agregar(525);
        listaSimple.Agregar(true);
        listaSimple.Agregar(10.2);
        listaSimple.Imprimir();
        listaSimple.Eliminar(525);
        listaSimple.Imprimir();
    }
    
}
