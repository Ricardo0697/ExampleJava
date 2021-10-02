/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidad.Empleado;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo
 */
public class EmpleadoArchivo extends Archivo<Empleado>{
    
    private static String path;
    private static BufferedWriter escribir;
    private static BufferedReader leer;

    @Override
    public void CrearArchivo(String nombreArchivo, Boolean agregar) throws IOException {
        try {
            path = new File("src/Datos/Empleados.txt").getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void CerrarArchivo() throws IOException {
        escribir.close();
    }

    @Override
    public Boolean Existe(Empleado object) {
        try {
            leer = new BufferedReader(new FileReader(this.path));
            String line = null;
            while ((line = leer.readLine()) != null) {
                String[] data = line.split("@");
                if (data[0].equals(String.valueOf(object.getId()))) {
                    return true;
                }
            }
            leer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmpleadoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {        
            Logger.getLogger(EmpleadoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean Agregar(Empleado object) {
        try {
            this.CrearArchivo(this.path, true);
            if (!this.Existe(object)) {
                object.setId(this.Autoincremental());
                escribir.write(String.valueOf(object.getId()) + "@");
                escribir.write(object.getNombre() + "@");
                escribir.write(object.getApellido()+ "@");
                escribir.write(object.getFechaIngreso()+"");
                escribir.write(System.lineSeparator());
                this.CerrarArchivo();
                return true;
            }
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoArchivo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }

    @Override
    public Boolean Editar(Empleado object) {
        try {
            leer = new BufferedReader(new FileReader(this.path));
            String line = null;
            StringBuilder cadena = new StringBuilder();
            while ((line = leer.readLine()) != null) {
                String[] data = line.split("@");
                if (data[0].equals(String.valueOf(object.getId()))) {
                    cadena.append(String.valueOf(object.getId()) + "@"
                            + object.getNombre() + "@"
                            + object.getApellido() + "@"
                            + object.getFechaIngreso()
                            + System.lineSeparator());
                } else {
                    cadena.append(line + System.lineSeparator());
                }
            }
            leer.close();
            this.CrearArchivo(this.path, false);
            this.CrearArchivo(this.path, true);
            escribir.write(cadena.toString());
            this.CerrarArchivo();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmpleadoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean Eliminar(Empleado object) {
        try {
            leer = new BufferedReader(new FileReader(this.path));
            String line = null;
            StringBuilder cadena = new StringBuilder();
            while ((line = leer.readLine()) != null) {
                String[] data = line.split("@");
                if (!data[0].equals(String.valueOf(object.getId()))) {
                    cadena.append(line
                            + System.lineSeparator());
                }
            }
            leer.close();
            this.CrearArchivo(this.path, false);
            this.CrearArchivo(this.path, true);
            escribir.write(cadena.toString());
            this.CerrarArchivo();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmpleadoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Empleado> Obtener() {
        List<Empleado> empleados=new ArrayList();
        try {            
            leer = new BufferedReader(new FileReader(this.path));
            String line = null;
            StringBuilder cadena = new StringBuilder();
            while ((line = leer.readLine()) != null) {
                String[] data = line.split("@");
                Empleado empleado=new Empleado();
                empleado.setId(Integer.parseInt(data[0]));
                empleado.setNombre(data[1]);
                empleado.setApellido(data[2]);
                empleado.setFechaIngreso(Long.parseLong(data[3]));
                empleados.add(empleado);
            }
            leer.close();

            return empleados;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmpleadoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empleados;
    }

    @Override
    public int Autoincremental() {
        int autoincremental=0;
        try {            
            leer = new BufferedReader(new FileReader(this.path));
            String line = null;
            StringBuilder cadena = new StringBuilder();
            while ((line = leer.readLine()) != null) {
                String[] data = line.split("@");
                if(autoincremental<Integer.parseInt(data[0]))
                {
                    autoincremental=Integer.parseInt(data[0]);
                } 
            }
            leer.close();

            return autoincremental+1;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmpleadoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return autoincremental;
    }
    
}
