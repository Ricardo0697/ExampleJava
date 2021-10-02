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
public class Bicicleta extends Vehiculo {

    private int tipo;

    public Bicicleta() {
        super();
    }

    public String Mostrar() {
        return super.Mostrar() + String.format(", el tipo de bicicleta es %d ",
                 this.getTipo());
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
