/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author efren
 */
public abstract class PersonaAbstracta {
    
    private String nombre;
    private float edad;
    private String dni;
    
    public abstract boolean MayorEdad();
    
    public abstract String Mostrar();

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
     * @return the edad
     */
    public float getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(float edad) {
        this.edad = edad;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
}
