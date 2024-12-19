package puntospeajes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmEmpleados extends javax.swing.JFrame {

    ArrayList<empleados> emplea;
    DefaultTableModel modelo;
    Conexion objC = new Conexion();
    Connection cnn;

    public FrmEmpleados() {
        this.cnn = null;
        initComponents();
        
          configurarEventos();
        setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        emplea = new ArrayList<>();
    }

    
    
    
    private void configurarEventos() {
    TBLEMPLEADOS.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int filaSeleccionada = TBLEMPLEADOS.getSelectedRow();
            if (filaSeleccionada != -1) {
                // Obtiene los valores de la fila seleccionada
                String codpe = TBLEMPLEADOS.getValueAt(filaSeleccionada, 0).toString();
                String codem = TBLEMPLEADOS.getValueAt(filaSeleccionada, 1).toString();
                String nomb = TBLEMPLEADOS.getValueAt(filaSeleccionada, 2).toString();
                String cargo = TBLEMPLEADOS.getValueAt(filaSeleccionada, 3).toString();

                // Carga los valores en los campos del formulario
                TXTPEAJE.setText(codpe);
                TXTCODEMP.setText(codem);
                TXTNOM.setText(nomb);
                CBOCARGO.setSelectedItem(cargo);
            }
        }
    });
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTPEAJE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTCODEMP = new javax.swing.JTextField();
        TXTNOM = new javax.swing.JTextField();
        CBOCARGO = new javax.swing.JComboBox<String>();
        BTNGUARDAR = new javax.swing.JButton();
        BTNCERRAR = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        BTNLISTAREMPLE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLEMPLEADOS = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("REGISTRO DE EMPLEADOS POR PEAJES");

        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("CODIGO DE PEAJE");

        TXTPEAJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPEAJEActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(51, 0, 204));
        jLabel3.setText("CODIGO EMPLEADOS");

        jLabel4.setForeground(new java.awt.Color(51, 0, 204));
        jLabel4.setText("NOMBRES");

        jLabel5.setForeground(new java.awt.Color(51, 0, 204));
        jLabel5.setText("CARGO");

        CBOCARGO.setForeground(new java.awt.Color(0, 0, 153));
        CBOCARGO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBOCARGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOCARGOActionPerformed(evt);
            }
        });

        BTNGUARDAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNGUARDAR.setText("SAVE");
        BTNGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGUARDARActionPerformed(evt);
            }
        });

        BTNCERRAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNCERRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/action_go.gif"))); // NOI18N
        BTNCERRAR.setText("CERRAR");
        BTNCERRAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNCERRAR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BTNCERRAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTNCERRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNCERRARMouseClicked(evt);
            }
        });
        BTNCERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCERRARActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/application_flash.gif"))); // NOI18N
        jButton1.setText("EDITAR");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BTNLISTAREMPLE.setText("LISTAR EMPLEADOS");
        BTNLISTAREMPLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLISTAREMPLEActionPerformed(evt);
            }
        });

        TBLEMPLEADOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD PEAJE", "COD EMPLEADO", "NOMBRES", "CARGOS"
            }
        ));
        jScrollPane1.setViewportView(TBLEMPLEADOS);

        jButton2.setText("ELIMINAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTNOM, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(TXTPEAJE, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTCODEMP)
                                    .addComponent(CBOCARGO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTNLISTAREMPLE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BTNGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BTNCERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(TXTPEAJE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(TXTCODEMP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTNOM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBOCARGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNLISTAREMPLE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNCERRAR))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCERRARActionPerformed


    }//GEN-LAST:event_BTNCERRARActionPerformed


    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.CBOCARGO.setModel(new DefaultComboBoxModel(LosCargos.values()));
    }//GEN-LAST:event_formComponentShown

    private void BTNGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGUARDARActionPerformed
        String codpe = this.TXTPEAJE.getText();
        String codem = this.TXTCODEMP.getText();
        String nomb = this.TXTNOM.getText();
        String cargo = this.CBOCARGO.getSelectedItem().toString();

        if (codpe.isEmpty() || codem.isEmpty() || nomb.isEmpty() || cargo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return; // Detiene el proceso si hay campos vacíos
        }

        Statement st;
        empleados emp = new empleados(codpe, codem, nomb, cargo);

// Modelo de la tabla
        modelo = (DefaultTableModel) TBLEMPLEADOS.getModel();

// Prepara la fila para agregar al modelo
        Object[] fila = new Object[4];
        fila[0] = codpe;
        fila[1] = codem;
        fila[2] = nomb;
        fila[3] = cargo;

        try {
            // Conexión a la base de datos
            cnn = objC.conectar();
            st = cnn.createStatement();

            // Verifica que el codpeaje exista
            String sqlPeaje = "SELECT COUNT(*) AS existe FROM peajes WHERE codpeaje = '" + codpe + "'";
            ResultSet rsPeaje = st.executeQuery(sqlPeaje);
            rsPeaje.next();
            if (rsPeaje.getInt("existe") == 0) {
                JOptionPane.showMessageDialog(null, "El código de peaje no existe.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Detiene el proceso si no existe el codpeaje
            }

            // Verifica que el codempleado no exista ya
            String sqlEmpleado = "SELECT COUNT(*) AS existe FROM empleados WHERE codempleado = '" + codem + "'";
            ResultSet rsEmpleado = st.executeQuery(sqlEmpleado);
            rsEmpleado.next();
            if (rsEmpleado.getInt("existe") > 0) {
                JOptionPane.showMessageDialog(null, "El código de empleado ya existe. No se puede registrar nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Detiene el proceso si el codempleado ya existe
            }

            // Inserta el nuevo empleado
            String sqlInsert = "INSERT INTO empleados(cod, codempleado, nombres, cargo) "
                    + "VALUES('" + fila[0] + "', '" + fila[1] + "', '" + fila[2] + "', '" + fila[3] + "')";
            st.executeUpdate(sqlInsert);

            // Agrega la fila al modelo de la tabla
            modelo.addRow(fila);

            // Mensaje de éxito
            JOptionPane.showMessageDialog(null, "Empleado registrado correctamente.");

            cnn.close(); // Cierra la conexión
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error es " + ex.getMessage());
        }

// Limpia los campos de entrada
        this.TXTPEAJE.setText("");
        this.TXTPEAJE.requestFocus();
        blanquearentrada(); // Método que limpia los campos de entrada
    }//GEN-LAST:event_BTNGUARDARActionPerformed

    private void BTNCERRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNCERRARMouseClicked
        MenuPrincipal objP = new MenuPrincipal();
        objP.setVisible(true);
        FrmEmpleados objEm = new FrmEmpleados();
        objEm.setVisible(false);
    }//GEN-LAST:event_BTNCERRARMouseClicked
    private void BTNLISTAREMPLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLISTAREMPLEActionPerformed
        Conexion objC = new Conexion();
        Connection cnn = null;
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM empleados";

        try {
            cnn = objC.conectar(); // Conectar a la base de datos
            st = cnn.createStatement();
            rs = st.executeQuery(sql);

            // Obtén el modelo de la tabla
            modelo = (DefaultTableModel) TBLEMPLEADOS.getModel();

            // Limpia las filas existentes del modelo
            modelo.setRowCount(0);

            // Crea un array con el tamaño correspondiente a las columnas de la tabla empleados
            Object[] empleado = new Object[4];

            // Recorre los resultados de la consulta y agrega filas al modelo
            while (rs.next()) {
                empleado[0] = rs.getString("cod");
                empleado[1] = rs.getString("codempleado");
                empleado[2] = rs.getString("nombres");
                empleado[3] = rs.getString("cargo");
                modelo.addRow(empleado);
            }

            TBLEMPLEADOS.setModel(modelo); // Actualiza la tabla con el modelo
            cnn.close(); // Cierra la conexión
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error es --> " + ex.getMessage());
        }
    }//GEN-LAST:event_BTNLISTAREMPLEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String codpe = TXTPEAJE.getText().trim();
    String codem = TXTCODEMP.getText().trim();
    String nomb = TXTNOM.getText().trim();
    String cargo = CBOCARGO.getSelectedItem() != null ? CBOCARGO.getSelectedItem().toString() : "";

    if (codpe.isEmpty() || codem.isEmpty() || nomb.isEmpty() || cargo.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return; // Detiene el proceso si hay campos vacíos
    }

    try {
        // Conexión a la base de datos
        cnn = objC.conectar();
        Statement st = cnn.createStatement();

        // Actualiza los datos en la base de datos
        String sqlUpdate = "UPDATE empleados SET nombres = '" + nomb + "', cargo = '" + cargo + "' "
                + "WHERE codempleado = '" + codem + "' AND cod = '" + codpe + "'";
        st.executeUpdate(sqlUpdate);

        // Actualiza los datos en la tabla
        int filaSeleccionada = TBLEMPLEADOS.getSelectedRow();
        if (filaSeleccionada != -1) {
            TBLEMPLEADOS.setValueAt(codpe, filaSeleccionada, 0);
            TBLEMPLEADOS.setValueAt(codem, filaSeleccionada, 1);
            TBLEMPLEADOS.setValueAt(nomb, filaSeleccionada, 2);
            TBLEMPLEADOS.setValueAt(cargo, filaSeleccionada, 3);
        }

        // Mensaje de éxito
        JOptionPane.showMessageDialog(null, "Empleado actualizado correctamente.");
        cnn.close();
    } catch (ClassNotFoundException | SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CBOCARGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOCARGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBOCARGOActionPerformed

    private void TXTPEAJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPEAJEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPEAJEActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           // Verifica si hay una fila seleccionada en la tabla
    int filaSeleccionada = TBLEMPLEADOS.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return; // Detiene el proceso si no hay fila seleccionada
    }

    // Confirmación de eliminación
    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar este registro?", "Confirmación", JOptionPane.YES_NO_OPTION);
    if (confirmacion != JOptionPane.YES_OPTION) {
        return; // Si el usuario cancela, no se realiza ninguna acción
    }

    // Obtiene el código de empleado y código de peaje de la fila seleccionada
    String codem = TBLEMPLEADOS.getValueAt(filaSeleccionada, 1).toString();
    String codpe = TBLEMPLEADOS.getValueAt(filaSeleccionada, 0).toString();

    try {
        // Conexión a la base de datos
        cnn = objC.conectar();
        Statement st = cnn.createStatement();

        // Elimina el registro de la base de datos
        String sqlDelete = "DELETE FROM empleados WHERE codempleado = '" + codem + "' AND cod = '" + codpe + "'";
        st.executeUpdate(sqlDelete);

        // Elimina la fila de la tabla
        ((DefaultTableModel) TBLEMPLEADOS.getModel()).removeRow(filaSeleccionada);
 limpiarFormulario();
        // Mensaje de éxito
        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
        cnn.close();
    } catch (ClassNotFoundException | SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton2ActionPerformed
    public void verEmpleados() {
        limpiarTabla();
        modelo = (DefaultTableModel) TBLEMPLEADOS.getModel();
        Object[] obj = new Object[4];
        int i = 0;
        while (i < emplea.size()) {
            obj[0] = emplea.get(i).getCodpeaje();
            obj[1] = emplea.get(i).getCodemple();
            obj[2] = emplea.get(i).getNomemple();
            obj[3] = emplea.get(i).getCargoemple();
            modelo.addRow(obj);
            i++;
        }
        TBLEMPLEADOS.setModel(modelo);
        this.BTNLISTAREMPLE.enable(false);
    }

    public void blanquearentrada() {
        this.TXTPEAJE.setText("");
        this.TXTCODEMP.setText("");
        this.TXTNOM.setText("");
        this.TXTPEAJE.requestFocus();
    }

    public void limpiarTabla() {
        for (int x = 0; x < modelo.getRowCount(); x++) {
            modelo.removeRow(x);
            x -= 1;
        }
    }
private void limpiarFormulario() {
    TXTPEAJE.setText("");       // Limpia el campo de código de peaje
    TXTCODEMP.setText("");      // Limpia el campo de código de empleado
    TXTNOM.setText("");         // Limpia el campo de nombre
    CBOCARGO.setSelectedIndex(0); // Restablece el combo box al primer elemento (opción por defecto)
    TXTPEAJE.requestFocus();    // Establece el foco en el primer campo
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
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCERRAR;
    private javax.swing.JButton BTNGUARDAR;
    private javax.swing.JButton BTNLISTAREMPLE;
    private javax.swing.JComboBox<String> CBOCARGO;
    private javax.swing.JTable TBLEMPLEADOS;
    private javax.swing.JTextField TXTCODEMP;
    private javax.swing.JTextField TXTNOM;
    private javax.swing.JTextField TXTPEAJE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
