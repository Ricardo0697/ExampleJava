/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import Entidad.Cliente;
import Entidad.Coche;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class Vendedor extends HerenciaEmpleado {
    
    private Coche coche;
    private String telefonoMovil;
    private String areaVenta;
    private List<Cliente> clientes;
    private float comision;
    private float aumento;
    
    
    
    public Vendedor(String nombre, String apellidos, String dni,
            String direccioon, float annosAntiguuedad, String teleefono,
            float salario, HerenciaEmpleado supervisa,Coche coche,
            String telefonoMovil,String areaVenta,List<Cliente> clientes,
            float comision,float aumento) {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setDni(dni);
        this.setDireccioon(direccioon);
        this.setAnnosAntiguuedad(annosAntiguuedad);
        this.setTeleefono(teleefono);
        this.setSalario(salario);
        this.setSupervisa(supervisa);
        
        this.setCoche(coche);
        this.setTelefonoMovil(telefonoMovil);
        this.setAreaVenta(areaVenta);
        this.setClientes(clientes);
        this.setComision(comision);
        this.setAumento(aumento);
        
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
                + "\"Es un secretario %s "
                + "\"El aumento anual es %f "
                + "\"El aumento anual es %f ", 
                
                this.getNombre(),
                this.getApellidos(),
                this.getDni(),
                this.getDireccioon(),
                this.getAnnosAntiguuedad(),
                this.getTeleefono(),
                this.getSalario(),
                this.getSupervisa().getNombre(),
                this.getCoche().getMatricula(),
                this.getTelefonoMovil(),
                this.getAreaVenta(),
                this.getClientes(),
                this.getComision(),
                this.getAumento());
    }
    
    public boolean AgregarCliente(Cliente cliente)
    {
        this.getClientes().add(cliente);
        return true;
    }
    

    /**
     * @return the coche
     */
    public Coche getCoche() {
        return coche;
    }

    /**
     * @param coche the coche to set
     */
    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    /**
     * @return the telefono
     */
    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    /**
     * @param telefonoMovil the telefono to set
     */
    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    /**
     * @return the areaVenta
     */
    public String getAreaVenta() {
        return areaVenta;
    }

    /**
     * @param areaVenta the areaVenta to set
     */
    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    /**
     * @return the clientes
     */
    public List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the comision
     */
    public float getComision() {
        return comision;
    }

    /**
     * @param comision the comision to set
     */
    public void setComision(float comision) {
        this.comision = comision;
    }

    /**
     * @return the aumento
     */
    public float getAumento() {
        return aumento;
    }

    /**
     * @param aumento the aumento to set
     */
    public void setAumento(float aumento) {
        this.aumento = aumento;
    }
    
    
    
    
}
