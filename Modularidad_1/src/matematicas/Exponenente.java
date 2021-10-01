/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

import java.util.Scanner;

/**
 *
 * @author efren
 */
public class Exponenente {
    
    private float exponenete =0;
    private float base=0;
    
    public Exponenente(float exponenete, float base)
    {
        this.setExponenete(exponenete);
        this.setBase(base);
    }
    
    public double Calculo()
    {
        return Math.pow(this.getBase(), this.getExponenete());
    }

/**
     * @return the exponenete
     */
    public float getExponenete() {
        return exponenete;
    }

    /**
     * @param exponenete the exponenete to set
     */
    public void setExponenete(float exponenete) {
        this.exponenete = exponenete;
    }

    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
    }
    
}
