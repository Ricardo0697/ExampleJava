/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_1;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Arreglo_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner texto = new Scanner (System.in); 	//Creación de un objeto Scanner
        System.out.println("Digite el numero de elementos a agregar");
        int elemntos=texto.nextInt(); 
        int[] arreglo=new int[elemntos];
        for (int i = 0; i < elemntos; i++) {
            texto = new Scanner (System.in); 	//Creación de un objeto Scanner
            System.out.println("Digite el numero a agregar");
            int numero=texto.nextInt(); 
            arreglo[i]=numero;
        }
        texto = new Scanner (System.in); 	//Creación de un objeto Scanner
        System.out.println("Digite el numero por el cual desea multiplicar");
        int multi=texto.nextInt(); 
         for (int i = 0; i < elemntos; i++) {
            System.out.print(String.format("%d - ", (arreglo[i]*multi)));
        }
    }
}
