/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion_1;

/**
 *
 * @author Ricardo
 */
public class Socio {
    
    private int codigo;
    private String nombre;
    private Fecha fechaIngreso;
    
    /**
     * Metodo constructor
     */
    public Socio()
    {
        
    }
    
    public void setFecha(Fecha fecha)
    {
        this.fechaIngreso=fecha;
    }
    
    public void Imprimir()
    {
        System.out.println(String.format("El codigo es %d", this.codigo));
        System.out.println(String.format("El nombre es %s", this.nombre));
        System.out.println(String.format("El año es %d el mes es %d y el dia %d",
                this.fechaIngreso.getAnno(),this.fechaIngreso.getMes(),
                this.fechaIngreso.getDia()));
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
