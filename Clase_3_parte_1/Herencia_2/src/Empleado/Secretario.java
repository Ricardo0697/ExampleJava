/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Empleado;

/**
 *
 * @author Ricardo
 */
public class Secretario extends HerenciaEmpleado {
    
    private Boolean tieneDespacho;
    private String numeroFax;
    private float aumentoActual;
    
    
    public Secretario(String nombre, String apellidos, String dni,
            String direccioon, float annosAntiguuedad, String teleefono,
            float salario, HerenciaEmpleado supervisa,Boolean tieneDespacho,
            String numeroFax,float aumentoActual) {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setDni(dni);
        this.setDireccioon(direccioon);
        this.setAnnosAntiguuedad(annosAntiguuedad);
        this.setTeleefono(teleefono);
        this.setSalario(salario);
        this.setSupervisa(supervisa);
        this.setTieneDespacho(tieneDespacho);
        this.setNumeroFax(numeroFax);
        this.setAumentoActual(aumentoActual);
    }
    
    @Override
    public String Imprimir() {
        return String.format("El nombre del empleado es %s "
                + "\"El apellido del empleado es %s "
                + "\"El dni del empleado es %s "
                + "\"La direccion del empleado es %s "
                + "\"La cantidad de años de antiguedad del empleado es %s "
                + "\"El telefono del empleado es %s "
                + "\"El salario del empleado es %f "
                + "\"El nombre del supervisor del empleado es %s "
                + "\"Tiene despacho %s "
                + "\"Numero fax %s "
                + "\"El aumento anual es %f "
                + "\"Es un secretario %s ", 
                this.getNombre(),
                this.getApellidos(),
                this.getDni(),
                this.getDireccioon(),
                this.getAnnosAntiguuedad(),
                this.getTeleefono(),
                this.getSalario(),
                this.getSupervisa().getNombre(),
                this.getTieneDespacho(),
                this.getNumeroFax(),
                this.getAumentoActual());
    }

    /**
     * @return the tieneDespacho
     */
    public Boolean getTieneDespacho() {
        return tieneDespacho;
    }

    /**
     * @param tieneDespacho the tieneDespacho to set
     */
    public void setTieneDespacho(Boolean tieneDespacho) {
        this.tieneDespacho = tieneDespacho;
    }

    /**
     * @return the numeroFax
     */
    public String getNumeroFax() {
        return numeroFax;
    }

    /**
     * @param numeroFax the numeroFax to set
     */
    public void setNumeroFax(String numeroFax) {
        this.numeroFax = numeroFax;
    }

    /**
     * @return the aumentoActual
     */
    public float getAumentoActual() {
        return aumentoActual;
    }

    /**
     * @param aumentoActual the aumentoActual to set
     */
    public void setAumentoActual(float aumentoActual) {
        this.aumentoActual = aumentoActual;
    }

}
