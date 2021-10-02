/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_1;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Clase_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner var = new Scanner(System.in);
        int num1, num2;
        System.out.print("Digite el primer número : ");       
        num1 = var.nextInt();
        System.out.print("Digite el segundo número : ");
        num2 = var.nextInt();
        if (num1 > num2) {
            System.out.println("El mayor es: " + num1 + "El menor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num2);
        }
        
        int[] arregloNumeros;
        arregloNumeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número en la posición " + (i) + " :");
            arregloNumeros[i] = var.nextInt();
        }
        int suma=0;
        int promedio=0;
        int mayor=arregloNumeros[0];
        //Suma,mayor,promedio
        for (int i = 0; i < 10; i++) {
            suma+=arregloNumeros[i];
            if (arregloNumeros[i]>mayor)
            {
                mayor=arregloNumeros[i];
            }
            System.out.println(String.format("Posición [%d] Elemento: %d", i,arregloNumeros[i]));
        }
        promedio=suma/arregloNumeros.length;
        System.out.println(String.format("Mayor: %d Suma: %d Promedio: %d ", mayor,suma,promedio));
    }
    
}
