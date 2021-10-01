/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author efren
 */
public class PersonaAdministrativo extends PersonaAbstracta{
    
    public PersonaAdministrativo(String nombre,float edad, String dni)
    {
        super();
        super.setEdad(edad);
        super.setDni(dni);
        super.setNombre(nombre);
    }

    @Override
    public boolean MayorEdad() {
       if (super.getEdad()>=18)
       {
           return true;
       }
       else
       {
           return false;
       }
    }

    @Override
    public String Mostrar() {
       return String.format("El dni es %s , el nombre es %s , la edad es %f", super.getDni(),
               super.getNombre(),super.getEdad());
    }
    
}
