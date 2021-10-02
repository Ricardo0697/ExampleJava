/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcessoDatos;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public abstract class Archivo<e> {
    
    public abstract void CrearArchivo(String nombreArchivo, Boolean agregar) throws IOException;
    
    public abstract void CerrarArchivo() throws IOException;
    
    public abstract Boolean Existe(e object);
    
    public abstract Boolean Agregar(e object);
    
    public abstract Boolean Editar(e object);
    
    public abstract Boolean Eliminar(e object);
    
    public abstract List<e> Obtener();
    
    public abstract int Autoincremental();
    
    
    
    
}
