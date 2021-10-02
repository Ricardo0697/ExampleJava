/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion_1;

import java.util.Scanner;

/**
 *
 * @author efren
 */
public class Composicion_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Agenda agenda=new Agenda();        
        Scanner texto = new Scanner (System.in); 	//Creación de un objeto Scanner
        System.out.println("Digite el numero de contactos a agregar");
        int numero=texto.nextInt();        
        for (int i = 0; i < numero; i++) {
            agenda.AgregarContacto();
        }        
    }
    
}
