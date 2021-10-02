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
public class Mago extends Personaje{

    private String poder;
    
    public Mago()
    {
        super();
    }
    
    public int Encantar()
    {
        super.setNivel(this.getNivel()-2);
        return super.getNivel();
    }
    
    @Override
    public String Alimentarse(int alimento)
    {
        this.setNivel(this.getNivel()+alimento+2);
        return String.format("El personaje s% tiene de nivel de energia d%",
                this.getNombre(),this.getNivel());
    }
    
    /**
     * @return the poder
     */
    public String getPoder() {
        return poder;
    }

    /**
     * @param poder the poder to set
     */
    public void setPoder(String poder) {
        this.poder = poder;
    }
    
}
