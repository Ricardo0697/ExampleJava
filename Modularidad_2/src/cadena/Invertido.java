/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

/**
 *
 * @author efren
 */
public class Invertido {
    
    private String Cadena;
    private String Resultado;
    
    public Invertido(String cadena) 
    {
        this.setCadena(cadena);
    }
    
    public String InvertirCadena()
    {
        this.setResultado("");
        for (int i = this.getCadena().length(); i >0 ; i--) {
            this.setResultado(this.getResultado()+this.getCadena().charAt(i-1));
        }
        return this.getResultado();
    }

    /**
     * @return the Cadena
     */
    public String getCadena() {
        return Cadena;
    }

    /**
     * @param Cadena the Cadena to set
     */
    public void setCadena(String Cadena) {
        this.Cadena = Cadena;
    }

    /**
     * @return the Resultado
     */
    public String getResultado() {
        return Resultado;
    }

    /**
     * @param Resultado the Resultado to set
     */
    public void setResultado(String Resultado) {
        this.Resultado = Resultado;
    }
    
    
}
