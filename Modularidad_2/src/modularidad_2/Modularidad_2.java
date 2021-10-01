/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad_2;

import cadena.Invertido;
import java.util.Scanner;

/**
 *
 * @author efren
 */
public class Modularidad_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner texto = new Scanner (System.in); 	
        //Creación de un objeto Scanner
        System.out.println("Digite la frase a invertir");
        String cadena=texto.nextLine(); 
        Invertido oInvertido=new Invertido(cadena);
        System.out.println(oInvertido.InvertirCadena());
        
    }
    
}
