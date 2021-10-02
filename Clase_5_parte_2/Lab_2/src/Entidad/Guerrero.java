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
public class Guerrero extends Personaje{
    
    @Override
    public String Alimentarse(int alimento)
    {
        this.setNivel(this.getNivel()+alimento+1);
        return String.format("El personaje s% tiene de nivel de energia d%",
                this.getNombre(),this.getNivel());
    }
    
}
