/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion_1;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Agregacion_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Socio socio=new Socio();        
        Scanner texto = new Scanner (System.in); 	//Creación de un objeto Scanner
        System.out.println("Digite el numero de socios a agregar");
        int numero=texto.nextInt(); 
        
        java.util.Date fecha = new Date();
        Fecha oFecha=new Fecha();
        oFecha.setAnno(Calendar.getInstance().get(Calendar.YEAR));
        oFecha.setDia(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        oFecha.setMes(Calendar.getInstance().get(Calendar.MONTH));
        
        for (int i = 0; i < numero; i++) {
            Random r1 = new Random();
            socio=new Socio();
            socio.setCodigo(r1.nextInt(1000)+1);
            texto = new Scanner (System.in); 
            System.out.println("Digite el nombre del usuario");
            socio.setNombre(texto.nextLine());
            socio.setFecha(oFecha);
            socio.Imprimir();
        }       
    }
    
}
