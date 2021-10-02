/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import AccesoDatos.Conexion;
import Entidad.Permiso;
import Entidad.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class PermisoLogica {

    /**
     * @return the existeError
     */
    public boolean isExisteError() {
        return existeError;
    }

    /**
     * @param existeError the existeError to set
     */
    public void setExisteError(boolean existeError) {
        this.existeError = existeError;
    }

    /**
     * @return the mensajeError
     */
    public String getMensajeError() {
        return mensajeError;
    }

    /**
     * @param mensajeError the mensajeError to set
     */
    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    private boolean existeError = false;
    private String mensajeError = "";

    public List<Permiso> ObtenerPermisosPorUsuario(Usuario usuario) {
        Conexion conexion = new Conexion();
        List<Permiso> permisos = new ArrayList<>();
        try {
            Statement ejecucion;
            ejecucion = conexion.getConnection().createStatement();
            String sql = "SELECT permiso.id,permiso.id_rol,permiso.id_modulo,permiso.accion \n"
                    + "FROM usuario usuario,\n"
                    + "rol_usuario rol_usuario,\n"
                    + "rol rol,\n"
                    + "permiso permiso,\n"
                    + "modulo modulo\n"
                    + "WHERE \n"
                    + "usuario.id=rol_usuario.id_usuario\n"
                    + "AND\n"
                    + "rol_usuario.id_rol=rol.id\n"
                    + "AND\n"
                    + "rol.id=permiso.id_rol\n"
                    + "AND\n"
                    + "permiso.id_modulo=modulo.id\n"
                    + "AND\n"
                    + "usuario.id=" + usuario.getId();
            ResultSet queryResult = ejecucion.executeQuery(sql);
            while (queryResult.next()) {
                Permiso permiso = new Permiso();

                String id = queryResult.getString("id");
                permiso.setId(Integer.parseInt(id));

                String idRol = queryResult.getString("id_rol");
                permiso.setIdRol(Integer.parseInt(idRol));

                String idModulo = queryResult.getString("id_modulo");
                permiso.setIdModulo(Integer.parseInt(idModulo));

                String accion = queryResult.getString("accion");
                permiso.setAccion(Integer.parseInt(accion));

                permisos.add(permiso);

            }
            ejecucion.close();
            //Siempre desconectarse del servidor de base de datos o se quedan sin trabajo
            // gracias =)
            conexion.Desconectar();

        } catch (Exception e) {
            this.setExisteError(true);
            this.setMensajeError(e.getMessage());
        }
        return permisos;
    }

    public List<Permiso> ObtenerPermisos() {
        Conexion conexion = new Conexion();
        List<Permiso> permisos = new ArrayList<>();
        try {
            Statement ejecucion;
            ejecucion = conexion.getConnection().createStatement();
            String sql = "SELECT permiso.id,permiso.id_rol,permiso.id_modulo,permiso.accion \n"
                    + "FROM usuario usuario,\n"
                    + "rol_usuario rol_usuario,\n"
                    + "rol rol,\n"
                    + "permiso permiso,\n"
                    + "modulo modulo\n"
                    + "WHERE \n"
                    + "usuario.id=rol_usuario.id_usuario\n"
                    + "AND\n"
                    + "rol_usuario.id_rol=rol.id\n"
                    + "AND\n"
                    + "rol.id=permiso.id_rol\n"
                    + "AND\n"
                    + "permiso.id_modulo=modulo.id\n";
            ResultSet queryResult = ejecucion.executeQuery(sql);
            while (queryResult.next()) {
                Permiso permiso = new Permiso();

                String id = queryResult.getString("id");
                permiso.setId(Integer.parseInt(id));

                String idRol = queryResult.getString("id_rol");
                permiso.setIdRol(Integer.parseInt(idRol));

                String idModulo = queryResult.getString("id_modulo");
                permiso.setIdModulo(Integer.parseInt(idModulo));

                String accion = queryResult.getString("accion");
                permiso.setAccion(Integer.parseInt(accion));

                permisos.add(permiso);

            }
            ejecucion.close();
            //Siempre desconectarse del servidor de base de datos o se quedan sin trabajo
            // gracias =)
            conexion.Desconectar();

        } catch (Exception e) {
            this.setExisteError(true);
            this.setMensajeError(e.getMessage());
        }
        return permisos;
    }
}
