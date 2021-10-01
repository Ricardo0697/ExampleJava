/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad_1;
import java.util.Scanner;
import matematicas.Exponenente;

/**
 *
 * @author efren
 */
public class Modularidad_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner texto = new Scanner (System.in); 	
        //Creación de un objeto Scanner
        System.out.println("Digite la base ");
        float base=texto.nextFloat(); 
        System.out.println("Digite el exponente ");
        float exponente=texto.nextFloat(); 
        Exponenente oExponenente=new Exponenente(base,exponente);
        System.out.println(String.format(" El resulatado es %f ", oExponenente.Calculo()));
        for (int i = 1; i <= 10; i++) {
            oExponenente=new Exponenente(i,2);
            System.out.println(String.format(" El resulatado es %f de %d exponente de 2 ",
                    oExponenente.Calculo(),i));
        }
        
    }
    
}
