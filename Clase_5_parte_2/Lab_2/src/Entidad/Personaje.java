/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Ricardo
 */
public class Personaje {
    
    private String nombre;
    private int nivel; 
    
    public Personaje()
    {
        
    }
    
    public String Alimentarse(int alimento)
    {
        this.setNivel(this.getNivel()+alimento);
        return String.format("El personaje s% tiene de nivel de energia d%",
                this.getNombre(),this.getNivel());
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
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
               
    
}
