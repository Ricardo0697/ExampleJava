/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_1;

import Transporte.Bicicleta;
import Transporte.Camioneta;
import Transporte.Coche;
import Transporte.Motocicleta;

/**
 *
 * @author Ricardo
 */
public class Herencia_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche oCoche=new Coche();
        oCoche.setCilindrada(1500);
        oCoche.setColor("Blanco");
        oCoche.setRuedas(4);
        oCoche.setVelocidad(200);
        System.out.println(oCoche.Mostrar());
        
        Bicicleta oBicicleta=new Bicicleta();
        oBicicleta.setColor("Azul");
        oBicicleta.setRuedas(2);
        oBicicleta.setTipo(1);
        System.out.println(oBicicleta.Mostrar());
        
        Camioneta oCamioneta=new Camioneta();
        oCamioneta.setCilindrada(5000);
        oCamioneta.setColor("Verde");
        oCamioneta.setRuedas(4);
        oCamioneta.setVelocidad(120);
        oCamioneta.setCarga(2);
        System.out.println(oCamioneta.Mostrar());
        
        Motocicleta oMotocicleta=new Motocicleta();
        oMotocicleta.setCilindrada(1000);
        oMotocicleta.setColor("Amarilla");
        oMotocicleta.setRuedas(2);
        oMotocicleta.setVelocidad(250);
        System.out.println(oMotocicleta.Mostrar());
    }
    
}
