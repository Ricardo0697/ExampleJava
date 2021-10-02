/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tensor_1;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Tensor_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner texto = new Scanner (System.in); 	//Creación de un objeto Scanner
        System.out.println("Digite el numero de paginas");
        int paginas=texto.nextInt(); 
        
        texto = new Scanner (System.in);
        System.out.println("Digite el numero de lineas");
        int lineas=texto.nextInt(); 
        
        texto = new Scanner (System.in);
        System.out.println("Digite el numero de columnas");
        int columnas=texto.nextInt(); 
        
        String[][][] matriz=new String[paginas][lineas][columnas];
        
        for (int i = 0; i < paginas; i++) {
            for (int j = 0; j < lineas; j++) {      
                for (int k = 0; k < columnas; k++) {
                    texto = new Scanner (System.in); 	//Creación de un objeto Scanner
                    System.out.println(String.format(
                        "Digite el caracter en la pagina %d "
                                + "en la linea %d y la columna "
                                + "%d",i,j,k));
                    String caracter=texto.nextLine(); 
                    matriz[i][j][k]=caracter;
                }
            }
        }
        
        for (int i = 0; i < paginas; i++) {
            for (int j = 0; j < lineas; j++) {      
                for (int k = 0; k < columnas; k++) {
                    System.out.println(String.format(
                        "El caracter %s en la pagina %d "
                                + "en la linea %d y la columna "
                                + "%d",matriz[i][j][k],i,j,k));
                }
            }
        }
    }    
}
