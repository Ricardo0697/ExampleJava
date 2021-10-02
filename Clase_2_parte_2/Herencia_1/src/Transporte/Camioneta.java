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
public class Camioneta extends Coche{

    private float carga;

    public Camioneta() {
        super();
    }

    public String Mostrar() {
        return super.Mostrar() + String.format(", la carga de la camioneta es de %f toneladas ",
                 this.getCarga());
    }
    
     /**
     * @return the carga
     */
    public float getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(float carga) {
        this.carga = carga;
    }
    
}
