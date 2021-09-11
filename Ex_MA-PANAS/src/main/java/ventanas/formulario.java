/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;


import datos.*;
import domain.*;
import java.sql.*;
import java.util.List;
import java.sql.*;

public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
   
    rbActualizar.setEnabled(false);
    rbAgregar.setEnabled(false);
    rbEliminar.setEnabled(false);
    rbListar.setEnabled(false);
    txtApellido.setEnabled(false);
    txtArea.setEnabled(false);
    txtTelefono.setEnabled(false);
    txtEmail.setEnabled(false);
    txtId.setEnabled(false);
    txtNombre.setEnabled(false);
    btnAceptar.setEnabled(false);
    txtTelefono.setEnabled(false);
    txtContraseña.setEnabled(false);
    
    }
    
    int counterUsuarioAdd = 0;
    int counterPersonaAdd = 0;
    
    int counterUsuarioSelect = 0;
    int counterPersonaSelect= 0;
    
    int counterUsuarioUpdate= 0;
    int counterPersonaUpdate= 0;
    
    int counterUsuarioDelete= 0;
    int counterPersonaDelete= 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rbEntidad = new javax.swing.ButtonGroup();
        rbMetodo = new javax.swing.ButtonGroup();
        btnAceptar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbAgregar = new javax.swing.JRadioButton();
        rbEliminar = new javax.swing.JRadioButton();
        rbListar = new javax.swing.JRadioButton();
        rbActualizar = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rbPersona = new javax.swing.JRadioButton();
        rbUsuario = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtContraseña = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar(evt);
            }
        });

        txtId.setText("ID");

        txtNombre.setText("Nombre/Username");

        txtApellido.setText("Apellido");

        txtEmail.setText("Email");

        txtTelefono.setText("Telefono");
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        rbMetodo.add(rbAgregar);
        rbAgregar.setText("Agregar");
        rbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAgregar(evt);
            }
        });

        rbMetodo.add(rbEliminar);
        rbEliminar.setText("Eliminar");
        rbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEliminar(evt);
            }
        });

        rbMetodo.add(rbListar);
        rbListar.setText("Listar");
        rbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbListar(evt);
            }
        });

        rbMetodo.add(rbActualizar);
        rbActualizar.setText("Actualizar");
        rbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActualizar(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbListar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rbAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbListar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rbEntidad.add(rbPersona);
        rbPersona.setText("Persona");
        rbPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPersona(evt);
            }
        });

        rbEntidad.add(rbUsuario);
        rbUsuario.setText("Usuario");
        rbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUsuario(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(rbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbUsuario)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        txtContraseña.setText("Contraseña");
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtId)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addComponent(txtApellido)
                                        .addComponent(txtEmail))
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2)))
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar
        Connection conexion = null;
        UsuarioDAO usuarioDAO = new UsuarioDAO(conexion);
        PersonaDAO personaDAO = new PersonaDAO(conexion);
        
        try {
                conexion = Conexion.getConnection();
                if (conexion.getAutoCommit()) {
                    conexion.setAutoCommit(false);// Para no hacer automaticamente el commit
                }
                
                if(rbUsuario.isSelected()){
                    if(rbAgregar.isSelected()){                
                        Usuario nuevaUsuario = new Usuario();
                        nuevaUsuario.setUsername(txtNombre.getText());
                        nuevaUsuario .setPassword(txtContraseña.getText());
                        usuarioDAO.insertar(nuevaUsuario );
                        counterUsuarioAdd ++;
                    }else{
                        if(rbActualizar.isSelected()){
                            Usuario actualizarUsuario = new Usuario();
                            actualizarUsuario.setId_usuario(Integer.parseInt(txtId.getText()));
                            actualizarUsuario.setUsername(txtContraseña.getText());
                            actualizarUsuario.setPassword("password");
                            usuarioDAO.actualizar(actualizarUsuario);
                            counterUsuarioUpdate ++;
                        }else{
                            if(rbEliminar.isSelected()){
                                 usuarioDAO.eliminar(Integer.parseInt(txtId.getText()));
                                 counterUsuarioDelete++;
                            }else{
                                if(rbListar.isSelected()){
                                    List<Usuario> usuarios = usuarioDAO.seleccionar();
                                    txtArea.setText(usuarios.toString());
                                    
                                }
                            }
                        }
                    }
                }else{
                    if(rbPersona.isSelected()){
                        if(rbAgregar.isSelected()){                
                            Persona nuevaPersona = new Persona();
                            nuevaPersona.setNombre(txtNombre.getText());
                            nuevaPersona.setApellido(txtApellido.getText());
                            nuevaPersona.setEmail(txtEmail.getText());
                            nuevaPersona.setTelefono(txtTelefono.getText());
                            personaDAO.insertar(nuevaPersona);
                            counterPersonaAdd ++;
                        }else{
                            if(rbActualizar.isSelected()){
                                Persona actualizarPersona = new Persona();
                                actualizarPersona.setId_Persona(Integer.parseInt(txtId.getText()));
                                actualizarPersona.setNombre(txtNombre.getText());
                                actualizarPersona.setApellido(txtApellido.getText());
                                actualizarPersona.setEmail(txtEmail.getText());
                                actualizarPersona.setTelefono(txtTelefono.getText());                       
                                personaDAO.actualizar(actualizarPersona);
                                counterPersonaUpdate ++;
                            }else{
                                if(rbEliminar.isSelected()){
                                     personaDAO.eliminar(Integer.parseInt(txtId.getText()));
                                     counterPersonaDelete ++;
                                }else{
                                    if(rbListar.isSelected()){
                                        List<Persona> personas = personaDAO.seleccionar();
                                        txtArea.setText(personas.toString());
                                       
                                    }
                                }
                            }
                        }
                    }
                }
                
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
    }//GEN-LAST:event_btnAceptar

    private void rbAgregar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAgregar
        if(rbUsuario.isSelected()){
            txtId.setEnabled(false);
            txtApellido.setEnabled(false);
            txtEmail.setEnabled(false);
            txtNombre.setEnabled(true);
            txtTelefono.setEnabled(false);
            txtContraseña.setEnabled(true);
            btnAceptar.setEnabled(true);
       }else{
           txtId.setEnabled(false);
            txtApellido.setEnabled(true);
            txtEmail.setEnabled(true);
            txtNombre.setEnabled(true);
            txtTelefono.setEnabled(true);
            txtContraseña.setEnabled(true);
            btnAceptar.setEnabled(true);
       }
    }//GEN-LAST:event_rbAgregar

    private void rbEliminar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEliminar
        txtId.setEnabled(true);
        txtApellido.setEnabled(false);
        txtEmail.setEnabled(false);
        txtNombre.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtContraseña.setEnabled(false);
        btnAceptar.setEnabled(true);
    }//GEN-LAST:event_rbEliminar

    private void rbActualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActualizar
       if(rbUsuario.isSelected()){
            txtId.setEnabled(true);
            txtApellido.setEnabled(false);
            txtEmail.setEnabled(false);
            txtNombre.setEnabled(true);
            txtTelefono.setEnabled(false);
            txtContraseña.setEnabled(true);
            btnAceptar.setEnabled(true);
       }else{
           txtId.setEnabled(true);
            txtApellido.setEnabled(true);
            txtEmail.setEnabled(true);
            txtNombre.setEnabled(true);
            txtTelefono.setEnabled(true);
            txtContraseña.setEnabled(false);
            btnAceptar.setEnabled(true);
       }
        
    }//GEN-LAST:event_rbActualizar

    private void rbListar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbListar
        txtApellido.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtEmail.setEnabled(false);
        txtId.setEnabled(false);
        txtNombre.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtContraseña.setEnabled(false);
        btnAceptar.setEnabled(true);
    }//GEN-LAST:event_rbListar

    private void rbUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUsuario
        txtNombre.setEnabled(true);
        txtContraseña.setEnabled(true);
        rbActualizar.setEnabled(true);
        rbAgregar.setEnabled(true);
        rbEliminar.setEnabled(true);
        rbListar.setEnabled(true);
    }//GEN-LAST:event_rbUsuario

    private void rbPersona(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPersona
        txtApellido.setEnabled(true);
        txtEmail.setEnabled(true);
        txtNombre.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtContraseña.setEnabled(false);
        rbActualizar.setEnabled(true);
        rbAgregar.setEnabled(true);
        rbEliminar.setEnabled(true);
        rbListar.setEnabled(true);
    }//GEN-LAST:event_rbPersona

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        txtArea.setText("Personas Agregadas: "+counterPersonaAdd+ "\nPersonas Actualizadas: "+ counterPersonaUpdate+ "\nPersonas Eliminadas: "+ counterPersonaDelete +"\n\nUsuarios Agregados: "+counterUsuarioAdd+ "\nUsuarios Actualizados: "+ counterUsuarioUpdate+ "\nUsuarios Eliminados: "+ counterUsuarioDelete  );
        counterPersonaAdd = 0;
        counterPersonaUpdate = 0;
        counterPersonaDelete = 0;
        counterUsuarioAdd = 0;
        counterUsuarioUpdate = 0;
        counterUsuarioDelete = 0;
    }//GEN-LAST:event_btnFinalizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbActualizar;
    private javax.swing.JRadioButton rbAgregar;
    private javax.swing.JRadioButton rbEliminar;
    private javax.swing.ButtonGroup rbEntidad;
    private javax.swing.JRadioButton rbListar;
    private javax.swing.ButtonGroup rbMetodo;
    private javax.swing.JRadioButton rbPersona;
    private javax.swing.JRadioButton rbUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
