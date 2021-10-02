
import AccesoDatos.ClienteArchivo;
import Entidad.Cliente;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ClienteArchivo dsdsd=new ClienteArchivo();
        
        Cliente sdsd1=new Cliente();
        sdsd1.setId(1);
        sdsd1.setNombre("Hola");
        sdsd1.setApellido("jiji");
        dsdsd.Agregar(sdsd1);
        
        Cliente sdsd=new Cliente();
        sdsd.setId(1);
        sdsd.setNombre("HolaX");
        sdsd.setApellido("jiji2");
        dsdsd.Editar(sdsd);
        
        Cliente sdsd2=new Cliente();
        sdsd2.setId(2);
        sdsd2.setNombre("kk");
        sdsd2.setApellido("ss");
        dsdsd.Agregar(sdsd2);
        
        Cliente sdsd3=new Cliente();
        sdsd3.setId(1);
        sdsd3.setNombre("4444");
        sdsd3.setApellido("xxxxx");
        dsdsd.Eliminar(sdsd3);
        
        //dsdsd.Obtener(sdsd3)
    }
    
}
