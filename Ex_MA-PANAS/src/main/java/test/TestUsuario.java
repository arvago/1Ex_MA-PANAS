/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author luis_
 */
public class TestUsuario {
    public static void main(String[] args) {
        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);// Para no hacer automaticamente el commit
            }
            UsuarioDAO usuarioDAO = new UsuarioDAO(conexion);

           Usuario actualizarUsuario = new Usuario();
            actualizarUsuario.setId_usuario(3);
            actualizarUsuario.setUsername("juanito banana");
            actualizarUsuario.setPassword("password");

            usuarioDAO.actualizar(actualizarUsuario);

            Usuario nuevaPersona = new Usuario();
            nuevaPersona.setUsername("Shakira");
            nuevaPersona.setPassword("wakkawaka");

            usuarioDAO.insertar(nuevaPersona);

            usuarioDAO.eliminar(2);

            List<Usuario> personas = usuarioDAO.seleccionar();
            personas.forEach(user -> {
                System.out.println(user);
            });

            conexion.commit();
            System.out.println("Se realizaron correctamente las modificaciones en la BD");

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback - no fue posible realizar cambios");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
