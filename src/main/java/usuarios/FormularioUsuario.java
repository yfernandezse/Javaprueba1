
package usuarios;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;


public class FormularioUsuario extends javax.swing.JFrame {

       private DefaultListModel<String> usuariosListModel;
    private List<Usuarios> usuarios;
    private GestorUsuarios usuarioManager;
        
    
         public FormularioUsuario() {
        initComponents();
        
             setResizable(false);
        
        usuarios = new ArrayList<>();
        usuarioManager = new GestorUsuarios();
           //Añadir titulo
        setTitle("Gestor Usuario");
        
        //Permite que el formulario no se pueda modificar en sus dimensiones
        setResizable(false);

        
        
       // Lista para mostrar tareas
        usuariosListModel = new DefaultListModel<>();
        listaUsuarios.setModel(usuariosListModel);
  
          cargarUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList<>();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        btnAgregar1 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbxUsuarios = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario1.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 40, 130, 140);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("GESTOR DE USUARIOS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 10, 250, 30);

        listaUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        listaUsuarios.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(listaUsuarios);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 390, 300, 150);

        txtNombre.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jPanel1.add(txtNombre);
        txtNombre.setBounds(10, 200, 420, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Nombre de Usuario:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 180, 130, 16);

        btnEliminar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(320, 490, 110, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de Usuario:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 320, 130, 16);

        txtContrasena.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jPanel1.add(txtContrasena);
        txtContrasena.setBounds(10, 270, 420, 40);

        btnAgregar1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnAgregar1.setText("Agregar");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar1);
        btnAgregar1.setBounds(320, 410, 110, 30);

        btnEditar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar);
        btnEditar.setBounds(320, 450, 110, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setText("Contraseña:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 250, 130, 16);

        cbxUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Estudiante", " " }));
        jPanel1.add(cbxUsuarios);
        cbxUsuarios.setBounds(10, 340, 420, 40);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 50, 120, 110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarUsuario();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        agregarUsuario();
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       editarUsuario();
    }//GEN-LAST:event_btnEditarActionPerformed

        private void agregarUsuario() {
        String nombre = txtNombre.getText();
        String contraseña = new String(txtContrasena.getPassword());
     String tipoUsuario = (String) cbxUsuarios.getSelectedItem();

        usuarioManager.crearUsuario(nombre, contraseña, tipoUsuario);
        actualizarListaUsuarios();
    }

    

 private void editarUsuario() {
    int indiceSeleccionado = listaUsuarios.getSelectedIndex();

    if (indiceSeleccionado != -1) {
        String nuevoNombre = txtNombre.getText();
        String nuevaContraseña = new String(txtContrasena.getPassword());
        String nuevoTipoUsuario = (String) cbxUsuarios.getSelectedItem();

        // Obtener el usuario seleccionado actualmente
        String usuarioActual = usuariosListModel.get(indiceSeleccionado);

        // Obtener el nombre del usuario actual
        String nombreUsuarioActual = usuarioActual.split(" - ")[0];

        // Editar el usuario en el modelo y en el archivo
        usuarioManager.editarUsuario(nombreUsuarioActual, nuevoNombre, nuevaContraseña, nuevoTipoUsuario);

    actualizarListaUsuarios();
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona un usuario para editar", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
private void eliminarUsuario() {
    String nombre = txtNombre.getText();

    if (!nombre.isEmpty()) {
        usuarioManager.eliminarUsuario(nombre);
        actualizarListaUsuarios();
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona un usuario para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void actualizarListaUsuarios() {
    usuariosListModel.clear();
    for (Usuarios usuario : usuarioManager.obtenerUsuarios()) {
        usuariosListModel.addElement(usuario.getNombre() + " - " + usuario.getTipoUsuario());
    }
}

   private void cargarUsuarios() {
        List<Usuarios> usuariosCargados = usuarioManager.cargarUsuariosDesdeArchivo();
        for (Usuarios usuario : usuariosCargados) {
            usuariosListModel.addElement(usuario.getNombre() + " - " + usuario.getTipoUsuario());
        }
    }
    
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
            java.util.logging.Logger.getLogger(FormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbxUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaUsuarios;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
