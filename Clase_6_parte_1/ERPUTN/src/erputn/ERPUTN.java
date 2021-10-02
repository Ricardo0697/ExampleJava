/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erputn;

import Entidad.Usuario;
import Vista.Seguridad.Entrada;

/**
 *
 * @author Ricardo
 */
public class ERPUTN {
    
    public static Usuario usuario;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Entrada entrada=new Entrada();
        entrada.setVisible(true);
        
        
        
        // TODO code application logic here
        /*ClienteLogica clienteLogica=new ClienteLogica();
        /*Cliente cliente=new Cliente();
        cliente.setCedula("206740149");
        cliente.setNombre("Don Ramon");
        cliente.setDireccion("La vencidad del chavo");
        clienteLogica.Crear(cliente);*/
        
        /*Cliente cliente=new Cliente();
        cliente.setCedula("206740147");
        cliente.setNombre("Juana la cubana");
        cliente.setDireccion("Barrio cuba");
        cliente.setId(1);
        clienteLogica.Editar(cliente);*/
        
        /*Cliente cliente=new Cliente();
        cliente.setId(1);
        clienteLogica.Eliminar(cliente);
        
        List<Cliente> clientes= clienteLogica.Obtener();
        System.out.println(clientes);*/
        
        
        /*Usuario usuario=new Usuario();
        usuario.setNombre("celia");
        usuario.setClave("azucar");
        
        UsuarioLogica usuarioLogica=new UsuarioLogica();
        usuarioLogica.Crear(usuario);
        
        usuario.setId(1);
        usuario.setNombre("oliver");
        usuario.setClave("Niupi");        
        usuarioLogica.Editar(usuario);
        
        usuario.setId(1);       
        usuarioLogica.Eliminar(usuario);
        
               
        List<Usuario> usuarios= usuarioLogica.Obtener();
        for (Usuario usurio : usuarios) {
            System.out.println(usurio.getNombre());
            System.out.println(usurio.getClave());
            System.out.println("########################");
        }*/
    }    
}
