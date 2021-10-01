/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta_1;

import persona.PersonaAdministrativo;

/**
 *
 * @author efren
 */
public class Abstracta_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersonaAdministrativo oPersonaAdministrativo=
                new PersonaAdministrativo("Carlos",60,"20674590");
        System.out.println(oPersonaAdministrativo.MayorEdad());
        System.out.println(oPersonaAdministrativo.Mostrar());
    }
    
}
