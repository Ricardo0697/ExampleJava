/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

/**
 *
 * @author Ricardo
 */
public class Vehiculo {
    
    private String color;
    private int ruedas;  
    
    public Vehiculo()
    {
        
    }
    
    public Vehiculo(String color,int ruedas)
    {
        this.setColor(color);
        this.setRuedas(ruedas);
    }
    
    public String Mostrar()
    {
        return String.format("El color del vehiculo es %s "
                + "y la cantidad de ruedas es %d",this.getColor(), this.getRuedas());
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the ruedas
     */
    public int getRuedas() {
        return ruedas;
    }

    /**
     * @param ruedas the ruedas to set
     */
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    
    
    
}
