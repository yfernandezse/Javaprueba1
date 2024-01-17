/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package usuarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class FormularioLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormularioLogin
     */
    
        private GestorUsuarios gestorUsuarios;
    public FormularioLogin() {
        initComponents();
        
        setResizable(false);
        gestorUsuarios = new GestorUsuarios();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        cbxUsuarios = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 60, 140, 130);

        txtContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jPanel1.add(txtContraseña);
        txtContraseña.setBounds(50, 290, 300, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Nombre de Usuario:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 200, 123, 16);

        txtNombre.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jPanel1.add(txtNombre);
        txtNombre.setBounds(50, 220, 300, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setText("Contraseña:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 270, 73, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("INICIO DE SESIÒN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 20, 220, 30);

        btnAgregar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnAgregar.setText("Entrar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(100, 420, 190, 40);

        cbxUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Estudiante", " " }));
        jPanel1.add(cbxUsuarios);
        cbxUsuarios.setBounds(50, 360, 300, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de Usuario:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 340, 110, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
realizarLogin();
    }//GEN-LAST:event_btnAgregarActionPerformed
private void realizarLogin() {
    String nombreUsuario = txtNombre.getText();
    String contraseña = new String(txtContraseña.getPassword());

    try (BufferedReader reader = new BufferedReader(new FileReader("C:/usuarios/usuarios.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 3) {
                String nombre = parts[0];
                String contraseñaArchivo = parts[1];
                String tipoUsuario = parts[2];

                if (nombre.equals(nombreUsuario) && contraseñaArchivo.equals(contraseña)) {
                    // Inicio de sesión exitoso
                    mostrarMenuSegunTipo(tipoUsuario);
                    return;
                }
            }
        }

        // Si no se encontró el usuario
        JOptionPane.showMessageDialog(this, "Inicio de sesión fallido. Verifica tus credenciales.");
    } catch (IOException e) {
        e.printStackTrace();
    }
}


// ...

private void mostrarMenuSegunTipo(String tipoUsuario) {
    switch (tipoUsuario) {
        case "Administrativo":
           dispose();
           MenuAdmin m = new MenuAdmin();
           m.setVisible(true);
            break;
        case "Estudiante":
           dispose();
            MenuEstudiante me= new MenuEstudiante();
           me.setVisible(true);
            break;
        default:
            // Manejar otro tipo de usuario si es necesario
            JOptionPane.showMessageDialog(this, "Bienvenido. Tipo de usuario no reconocido.");
            break;
    }
}
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
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cbxUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
