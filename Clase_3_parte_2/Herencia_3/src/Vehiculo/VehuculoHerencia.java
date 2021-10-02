/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

/**
 *
 * @author Ricardo
 */
public class VehuculoHerencia {

    private String matricula;
    private float velocidad;

    public String ToString() {
        return String.format("La matricula es %s y la velocidad es %f", this.getMatricula(), this.getVelocidad());
    }

    public float Acelerar(float nuevaVelocidad) {
        this.setVelocidad(this.getVelocidad() + nuevaVelocidad);
        return this.getVelocidad();
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
