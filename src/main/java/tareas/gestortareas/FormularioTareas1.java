package tareas.gestortareas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Yago
 */
public class FormularioTareas1 extends javax.swing.JFrame {

    GestorTareasInterface gestorTareas = new GestorTareas();
    private DefaultListModel<String> listModelo;

    public FormularioTareas1() {
        initComponents();
        
        //Añadir titulo
        setTitle("Aplicacion Gestor Tareas");
        
        //Permite que el formulario no se pueda modificar en sus dimensiones
        setResizable(false);

        // Permite crear SpinnerDateModel con un valor inicial y su formato de fecha
        SpinnerDateModel dateModel = new SpinnerDateModel(new Date(), null, null, Calendar.MINUTE);
        //Permite anexarle el modelo al componente
        txtFecha.setModel(dateModel);

        // Permite Formatear el JSpinner para mostrar la fecha de manera específica
        JSpinner.DateEditor editor = new JSpinner.DateEditor(txtFecha, "dd/MM/yyyy HH:mm");
        //Se agrega al componente
        txtFecha.setEditor(editor);

        // Lista para mostrar tareas
        listModelo = new DefaultListModel<>();
        listaTareas.setModel(listModelo);
        
        
        cargarTareasDesdeArchivo();
       
    }

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRecordar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTareas = new javax.swing.JList<>();
        btnConsultar = new javax.swing.JButton();
        txtRecordatorio = new javax.swing.JTextField();
        txtPrioridad1 = new javax.swing.JTextField();
        txtFecha = new javax.swing.JSpinner();
        txtDescripcion2 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("GESTOR DE TAREAS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 0, 220, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("Prioridad");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 400, 150, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Descripcion");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 190, 100, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("Fecha Vencimiento");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 260, 150, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setText("Recordatorio");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 330, 150, 16);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono2.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 30, 170, 180);

        btnRecordar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnRecordar.setText("Recordar");
        btnRecordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecordar);
        btnRecordar.setBounds(380, 630, 110, 30);

        btnAgregar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(380, 470, 110, 30);

        btnEditar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar);
        btnEditar.setBounds(380, 510, 110, 30);

        btnEliminar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(380, 550, 110, 30);

        listaTareas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        listaTareas.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(listaTareas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 470, 360, 190);

        btnConsultar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar);
        btnConsultar.setBounds(380, 590, 110, 30);

        txtRecordatorio.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtRecordatorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jPanel1.add(txtRecordatorio);
        txtRecordatorio.setBounds(10, 350, 480, 40);

        txtPrioridad1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtPrioridad1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jPanel1.add(txtPrioridad1);
        txtPrioridad1.setBounds(10, 420, 480, 40);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(10, 280, 480, 40);

        txtDescripcion2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtDescripcion2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jPanel1.add(txtDescripcion2);
        txtDescripcion2.setBounds(10, 210, 480, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordarActionPerformed
        gestorTareas.recordarTareas();
    }//GEN-LAST:event_btnRecordarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarTarea();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editarTarea();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarTarea();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        listarTareasPendientes();
    }//GEN-LAST:event_btnConsultarActionPerformed

    //Se muestra como se integran los metodos de la clase Gestor Tareas con el formulario 
    private void agregarTarea() {

        // Se obtiene la informacion
        String descripcion = txtDescripcion2.getText();
        Date fechaVencimientoStr = (Date) txtFecha.getValue();
        String recordatorioStr = txtRecordatorio.getText();
        String prioridadStr = txtPrioridad1.getText();

        // Permite verificar si hay errores al ejecutar el metodo y mostrar un mensaje para el usuario
        try {

            Date recordatorio = null;
            if (!recordatorioStr.isEmpty()) {
                recordatorio = new SimpleDateFormat("HH:mm").parse(recordatorioStr);
            }

            int prioridad = Integer.parseInt(prioridadStr);

            gestorTareas.agregarTarea(descripcion, fechaVencimientoStr, recordatorio, prioridad);
           listarTareas();
             gestorTareas.guardarTareasEnArchivo();
            // Limpia los  campos del formulario
            txtDescripcion2.setText("");
            txtPrioridad1.setText("");
            txtFecha.setValue(new Date()); // Restaurar el valor predeterminado de fecha
            txtRecordatorio.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al agregar la tarea. Verifique el formato de fecha y recordatorio.");
        }
    }

    private void listarTareas() {
        listModelo.clear();
        List<Tarea> tareas = (List<Tarea>) gestorTareas.obtenerTareas();
        for (Tarea tarea : tareas) {
            listModelo.addElement(tarea.toString());
        }
    }
  private void editarTarea() {
    int indiceSeleccionado = listaTareas.getSelectedIndex();
    if (indiceSeleccionado != -1) {
        String descripcion = txtDescripcion2.getText();
        Date fechaVencimiento = (Date) txtFecha.getValue();
        String recordatorioStr = txtRecordatorio.getText();
        String prioridadStr = txtPrioridad1.getText();

        // Permite verificar si hay errores al ejecutar el metodo y mostrar un mensaje para el usuario
        try {

            Date recordatorio = null;
            if (!recordatorioStr.isEmpty()) {
                recordatorio = new SimpleDateFormat("HH:mm").parse(recordatorioStr);
            }

            int prioridad = Integer.parseInt(prioridadStr);

            gestorTareas.editarTarea(indiceSeleccionado,descripcion, fechaVencimiento, recordatorio, prioridad);
           listarTareas();
             gestorTareas.guardarTareasEnArchivo();
            // Limpia los  campos del formulario
            txtDescripcion2.setText("");
            txtPrioridad1.setText("");
            txtFecha.setValue(new Date()); // Restaurar el valor predeterminado de fecha
            txtRecordatorio.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al agregar la tarea. Verifique el formato de fecha y recordatorio.");
        }
  
        
}}

    private void eliminarTarea() {
        int indiceSeleccionado = listaTareas.getSelectedIndex();
        if (indiceSeleccionado != -1) {
            gestorTareas.eliminarTarea(indiceSeleccionado);
            listarTareas();
            // Después de eliminar la tarea, guardar en el archivo
            gestorTareas.guardarTareasEnArchivo();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una tarea para eliminar.");
        }
    }

    private void listarTareasPendientes() {
        listModelo.clear();
        List<Tarea> tareasPendientes = gestorTareas.listarTareasPendientes();
        for (Tarea tarea : tareasPendientes) {
            listModelo.addElement(tarea.toString());
        }
    }  
        private void cargarTareasDesdeArchivo() {
        gestorTareas.cargarTareasDesdeArchivo();
        listarTareas();
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
            java.util.logging.Logger.getLogger(FormularioTareas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioTareas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioTareas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioTareas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioTareas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRecordar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaTareas;
    private javax.swing.JTextField txtDescripcion2;
    private javax.swing.JSpinner txtFecha;
    private javax.swing.JTextField txtPrioridad1;
    private javax.swing.JTextField txtRecordatorio;
    // End of variables declaration//GEN-END:variables
}
