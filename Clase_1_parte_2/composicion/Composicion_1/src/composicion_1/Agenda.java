/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author efren
 */
public class Agenda {
    
    private String nombre;
    private ArrayList<Contacto> contactos=new ArrayList<Contacto>();
   
    /**
     * Metodo constructor
     */
    public Agenda()
    {
        
    }
    
    public void AgregarContacto()
    {
        Scanner texto = new Scanner (System.in); 	//Creación de un objeto Scanner
        Contacto contacto=new Contacto();
        System.out.println("Digite el nombre del contacto");
        contacto.setNombre(texto.nextLine());
        System.out.println("Digite el telefono del contacto");
        contacto.setTelefono(texto.nextLine());
        //Agregar un usuario
        this.contactos.add(contacto);
        System.out.println("Contacto agregado con éxito");
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the contactos
     */
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
    
}
