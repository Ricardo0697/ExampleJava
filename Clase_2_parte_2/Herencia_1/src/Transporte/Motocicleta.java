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
public class Motocicleta extends Bicicleta{
    
    private float cilindrada;
    private float velocidad;
    
    public Motocicleta() {
        super();
    }

    public String Mostrar() {
        return super.Mostrar() + String.format(", el cilindraje de ls motocicleta es %f "
                + "y la velocidad es %f ", this.getCilindrada(), this.getVelocidad());
    }
    
    /**
     * @return the cilindrada
     */
    public float getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * @return the velocidad
     */
    public float getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
