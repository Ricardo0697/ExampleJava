/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ricardo
 */
public class Conexion {

    
    
    //private static String db="d62mmvu7mo2p62";
    private static String db="erputn";
    private static String login="postgres";
    private static String password="12345";
    private static String server="localhost";
    private static String puerto="5432";
    private static String url="jdbc:postgresql://";
    private static Boolean existeError=false;    
    private static String mensajeError="";
    private Connection connection=null;
    
    public Conexion()
    {
        try {
            //"jdbc:postgresql://127.0.0.1:5432/test", "postgres", "password"
            connection= DriverManager.getConnection(url+server+":"+puerto+"/"+db,login,password);
            if (connection != null) {
                System.out.println("La conexion esta correcta");
            }
            else
            {
                existeError=true;
                System.out.println("La conexion esta cerrada");
                mensajeError="La conexion esta cerrada";
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());            
        } catch (Exception e) {            
        } 
    }
    
    public void Desconectar()
    {
        try {
            this.getConnection().close();
        } catch (Exception e) {
        }
    }
    
    /**
     * @return the connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
