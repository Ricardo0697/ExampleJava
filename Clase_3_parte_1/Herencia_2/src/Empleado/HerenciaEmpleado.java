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
public class HerenciaEmpleado {

    private String nombre;
    private String apellidos;
    private String dni;
    private String direccioon;
    private float annosAntiguuedad;
    private String teleefono;
    private float salario;
    private HerenciaEmpleado supervisa;

    public HerenciaEmpleado() {

    }

    public HerenciaEmpleado(String nombre, String apellidos, String dni,
            String direccioon, float annosAntiguuedad, String teleefono,
            float salario, HerenciaEmpleado supervisa) {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setDni(dni);
        this.setDireccioon(direccioon);
        this.setAnnosAntiguuedad(annosAntiguuedad);
        this.setTeleefono(teleefono);
        this.setSalario(salario);
        this.setSupervisa(supervisa);
    }

    public String Imprimir() {
        return String.format("El nombre del empleado es %s "
                + "\"El apellido del empleado es %s "
                + "\"El dni del empleado es %s "
                + "\"La direccion del empleado es %s "
                + "\"La cantidad de años de antiguedad del empleado es %s "
                + "\"El telefono del empleado es %s "
                + "\"El salario del empleado es %f "
                + "\"El nombre del supervisor del empleado es %s "
                + "\"El nombre del empleado es %s ", this.getNombre(),
                this.getApellidos(),
                this.getDni(),
                this.getDireccioon(),
                this.getAnnosAntiguuedad(),
                this.getTeleefono(),
                this.getSalario(),
                this.getSupervisa().getNombre());
    }

    public Boolean CambiarSupervisior(HerenciaEmpleado supervisa) {
        HerenciaEmpleado lastUser = this.getSupervisa();
        this.setSupervisa(supervisa);
        if (!lastUser.getNombre().equals(supervisa.getNombre())) {
            return true;
        } else {
            return false;
        }
    }

    public float CambiarSalario(float salarioNuevo) {
        this.setSalario(salarioNuevo);
        return this.getSalario();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param tipo the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the supervisa
     */
    public HerenciaEmpleado getSupervisa() {
        return supervisa;
    }

    /**
     * @param tipo the nombre to set
     */
    public void setSupervisa(HerenciaEmpleado supervisa) {
        this.supervisa = supervisa;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the direccioon
     */
    public String getDireccioon() {
        return direccioon;
    }

    /**
     * @param direccioon the direccioon to set
     */
    public void setDireccioon(String direccioon) {
        this.direccioon = direccioon;
    }

    /**
     * @return the annosAntiguuedad
     */
    public float getAnnosAntiguuedad() {
        return annosAntiguuedad;
    }

    /**
     * @param annosAntiguuedad the annosAntiguuedad to set
     */
    public void setAnnosAntiguuedad(float annosAntiguuedad) {
        this.annosAntiguuedad = annosAntiguuedad;
    }

    /**
     * @return the teleefono
     */
    public String getTeleefono() {
        return teleefono;
    }

    /**
     * @param teleefono the teleefono to set
     */
    public void setTeleefono(String teleefono) {
        this.teleefono = teleefono;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
