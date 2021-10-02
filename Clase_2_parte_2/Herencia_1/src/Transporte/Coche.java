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
public class Coche extends Vehiculo {

    private float cilindrada;
    private float velocidad;

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

    public Coche() {
        super();
    }

    public Coche(String color, int ruedas, float cilindrada, float velocidad) {
        super();
        super.setColor(color);
        super.setRuedas(ruedas);
        this.setCilindrada(cilindrada);
        this.setVelocidad(velocidad);
    }

    public String Mostrar() {
        return super.Mostrar() + String.format(", el cilindraje del vehiculo es %f "
                + "y la velocidad es %f ", this.getCilindrada(), this.getVelocidad());
    }

}
