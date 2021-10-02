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
public class Cuenta extends CuentaAbstracta {
    
    private String titular;
    private double cantidad;
    
    public Cuenta()
    {
        
    }
    
    public Cuenta(String titular,double cantidad)
    {
        this.setTitular(titular);
        this.setCantidad(cantidad);
    }

    @Override
    public String Mostrar() {
        return String.format("El titular es %s y el monto en la cuenta es %.2f"
                , this.getTitular(),this.getCantidad());
    }

    @Override
    public double Ingresar(double monto) {
        this.setCantidad(this.getCantidad()+monto);
        return getCantidad();
    }

    @Override
    public double Retirar(double monto) {
        this.setCantidad(this.getCantidad()- monto);
        return getCantidad();
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
    
}
