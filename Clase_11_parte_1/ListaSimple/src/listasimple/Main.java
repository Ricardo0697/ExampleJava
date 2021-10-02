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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaSimple listaSimple=new  ListaSimple();
        listaSimple.Agregar("Datos 1");
        listaSimple.Agregar("Datos 2");
        listaSimple.Agregar("Datos 3");
        listaSimple.Agregar("Datos 4");
        listaSimple.Imprime();
        listaSimple.Eliminar("Datos 3");
        listaSimple.Imprime();
    }
    
}
