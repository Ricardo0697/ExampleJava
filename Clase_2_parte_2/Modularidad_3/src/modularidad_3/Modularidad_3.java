/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad_3;

import Seguridad.Validacion;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Modularidad_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner texto = new Scanner (System.in); 	
        //Creación de un objeto Scanner
        System.out.println("Digite el usuario");
        String usuario=texto.nextLine(); 
        texto = new Scanner (System.in); 	
        //Creación de un objeto Scanner
        System.out.println("Digite la contraseña");
        String contrasena=texto.nextLine(); 
        Validacion oValidacion2=new Validacion();
        oValidacion2.setContrasena(contrasena);
        oValidacion2.setUsuario(contrasena);
        Validacion oValidacion=new Validacion(usuario,contrasena);
        System.out.println(oValidacion.ValidarEntrada());
        
    }
    
}
