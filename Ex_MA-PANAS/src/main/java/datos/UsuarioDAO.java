/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Arturo Vallejo
 */
public class UsuarioDAO {
    private Connection conexionTransaccional;

    // SQL Statements
    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(username, password) VALUES(?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET username = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=?";

    public UsuarioDAO() {

    }

    // Maneja la sesión de la conexión transaccional
    public UsuarioDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Usuario> seleccionar() throws SQLException {
        //Inicializar parametros de conexión
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                //Obtener los atributos de cada usuario en la BD
                int id = rs.getInt("id_usuario");              
                String nombreUsuario = rs.getString("username");
                String contraseña = rs.getString("password");

                usuario = new Usuario(id, nombreUsuario, contraseña);

                usuarios.add(usuario);
            }
        } // Cerrar todos los objetos
        finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                // Si la conexión es externa entonces se cierra de forma externa sino se cierra dentro de DAO
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);

            }
        }
        return usuarios;
    }

    public int insertar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0; // Saber cuantos registros se han actualizado
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            //debido a los campos que se insertan se trabaja con tipo String
            stmt.setString(1, usuario.getUsername());//?
            stmt.setString(2, usuario.getPassword());//?
            

            // Ejecutar sentencia
            registros = stmt.executeUpdate(); // modifica el estado de la base de datos (insert, delete, update)
        } 
        finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int actualizar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0; // Saber cuantos registros se han actualizado
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsername());//?
            stmt.setString(2, usuario.getPassword());//?
            stmt.setInt(3, usuario.getId_usuario()); // Where id_persona = ?

            // Ejecutar sentencia
            registros = stmt.executeUpdate(); // modifica el estado de la base de datos (insert, delete, update)

        }
        finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int eliminar(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0; // Saber cuantos registros se han actualizado
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id);

            // Ejecutar sentencia
            registros = stmt.executeUpdate(); // modifica el estado de la base de datos (insert, delete, update)

        }
        finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
