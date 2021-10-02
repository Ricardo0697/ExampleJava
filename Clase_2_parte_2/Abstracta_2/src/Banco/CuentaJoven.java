/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Ricardo
 */
public class CuentaJoven extends CuentaAbstracta{
    
    private String titular;
    private double cantidad;
    private float edad;
    
    public CuentaJoven()
    {
        
    }
    
    public CuentaJoven(String titular,double cantidad,float edad)
    {
        this.setTitular(titular);
        this.setCantidad(cantidad);
        this.setEdad(edad);
    }
    
    public boolean EsTitularValido()
    {
        if(this.getEdad()<=25)
        {
            return true;
        }
        return false;
    }

    @Override
    public String Mostrar() {
        return String.format("La cuenta es joven , la edad es %f, el titular es "
                + " %s y el monto en la cuenta es %f",
                this.getEdad(), this.getTitular(),this.getCantidad());
    }

    @Override
    public double Ingresar(double monto) {
        this.setCantidad(this.getCantidad()+monto);
        return getCantidad();
    }

    @Override
    public double Retirar(double monto) {
        if(this.EsTitularValido())
        {
            this.setCantidad(this.getCantidad()- monto);
            return getCantidad();
        }
        else
        {
            return getCantidad();
        }
    }
    
    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
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
    
}
