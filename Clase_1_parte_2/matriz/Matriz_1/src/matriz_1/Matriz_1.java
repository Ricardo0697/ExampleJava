/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_1;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Matriz_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner texto = new Scanner (System.in); 	//Creación de un objeto Scanner
        System.out.println("Digite el numero de filas");
        int filas=texto.nextInt(); 
        
        texto = new Scanner (System.in);
        System.out.println("Digite el numero de columnas");
        int columnas=texto.nextInt(); 
        
        int[][] matriz=new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {                
                texto = new Scanner (System.in); 	//Creación de un objeto Scanner
                System.out.println(String.format(
                        "Digite el numero a agregar en la posicion %d %d",i,j));
                int numero=texto.nextInt(); 
                matriz[i][j]=numero;
            }
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println(String.format(
                        "El numero %d es en la posicion %d %d",matriz[i][j],i,j));
            }
        }
    }
    
}
