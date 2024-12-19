
package puntospeajes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrmRptGeneral extends javax.swing.JFrame {
   ArrayList<Peajes> Lpeaje;
   DefaultTableModel modelo;
  ArrayList<Nomina> nomi;
  ArrayList<empleados> Lemple;
  Conexion objC = new Conexion();
  Connection cnn;
    public FrmRptGeneral() {
        initComponents();
        setLocationRelativeTo(null);
        nomi =  new ArrayList<>(); 
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBLGENERAL = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbodist = new javax.swing.JComboBox<String>();
        btntodos = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Cerrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 170, 30));

        TBLGENERAL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD PEAJE", "DISTRITO", "CODEMPLEADO", "NOMBRES", "CARGO"
            }
        ));
        jScrollPane4.setViewportView(TBLGENERAL);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 870, 260));

        jLabel1.setText("Por distrito :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        cbodist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbodistActionPerformed(evt);
            }
        });
        getContentPane().add(cbodist, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 260, 30));

        btntodos.setText("TODOS");
        btntodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntodosActionPerformed(evt);
            }
        });
        getContentPane().add(btntodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 170, 30));

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void leerDistritos(){
       String sql;
    Statement st;
    ResultSet rs;
    sql = "SELECT DISTINCT distrito FROM peajes";

    try {
        cnn = objC.conectar();
        st = cnn.createStatement();
        rs = st.executeQuery(sql);

        // Limpia los elementos actuales del JComboBox
        this.cbodist.removeAllItems();

        // Agrega un valor inicial, opcionalmente
        this.cbodist.addItem("Seleccione un distrito");

        // Agrega los valores obtenidos de la consulta
        while (rs.next()) {
            this.cbodist.addItem(rs.getString("distrito"));
        }

        cnn.close();
    } catch (ClassNotFoundException | SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       leerDistritos(); 
       String  sql;
       Statement st;
       ResultSet rs;
        sql = "SELECT p.codpeaje, p.distrito, e.codempleado, e.nombres, e.cargo \n" +
"FROM peajes p \n" +
"INNER JOIN empleados e \n" +
"ON p.codpeaje = e.cod;";
       try{
           cnn = objC.conectar();
           st = cnn.createStatement();
           rs = st.executeQuery(sql);
           Object [] emple= new Object[5];
           modelo=(DefaultTableModel)  TBLGENERAL.getModel(); 
           while(rs.next()){
               emple[0]=rs.getString("codpeaje");
               emple[1]=rs.getString("distrito");
               emple[2]=rs.getString("codempleado");
               emple[3]=rs.getString("nombres");
               emple[4]=rs.getString("cargo");
              modelo.addRow(emple);
           }
             TBLGENERAL.setModel(modelo); 
                     // Muestra el total de registros en el JTextField
        jTextField1.setText("Total elementos: " + modelo.getRowCount());
             cnn.close();
             
             
             
       }catch(ClassNotFoundException | SQLException ex){
       }
    }
    public void limpiarTabla(){
     for(int x = 0; x<modelo.getRowCount();x++){
           modelo.removeRow(x);
          x-=1;
      }
    }//GEN-LAST:event_formComponentShown

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        MenuPrincipal  frm3= new MenuPrincipal();
        frm3.setVisible(true);
        FrmRptGeneral rpt = new FrmRptGeneral();
        rpt.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void cbodistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbodistActionPerformed
   String sql;
    Statement st;
    ResultSet rs;

    // Construir la consulta SQL
    sql = "SELECT p.codpeaje, p.distrito, e.codempleado, e.nombres, e.cargo "
        + "FROM peajes p INNER JOIN empleados e ON p.codpeaje = e.cod "
        + "WHERE p.distrito = '" + this.cbodist.getSelectedItem() + "'";

    try {
        // Conectar a la base de datos
        cnn = objC.conectar();
        st = cnn.createStatement();
        rs = st.executeQuery(sql);

        // Preparar el modelo de la tabla
        Object[] datos = new Object[5];
        modelo = (DefaultTableModel) TBLGENERAL.getModel();
        modelo.setRowCount(0); // Limpia las filas existentes

        // Llenar la tabla con los resultados
        while (rs.next()) {
            datos[0] = rs.getString("codpeaje");
            datos[1] = rs.getString("distrito");
            datos[2] = rs.getString("codempleado");
            datos[3] = rs.getString("nombres");
            datos[4] = rs.getString("cargo");
            modelo.addRow(datos);
        }

        // Actualizar la tabla
        TBLGENERAL.setModel(modelo);
                // Muestra el total de registros en el JTextField
        jTextField1.setText("Total elementos: " + modelo.getRowCount());
        cnn.close(); // Cerrar la conexión
    } catch (ClassNotFoundException | SQLException ex) {
        System.out.println("Error es --> " + ex.getMessage());
    }
    }//GEN-LAST:event_cbodistActionPerformed

    private void btntodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntodosActionPerformed
     String sql;
    Statement st;
    ResultSet rs;

    // Consulta SQL para listar todos los registros
    sql = "SELECT p.codpeaje, p.distrito, e.codempleado, e.nombres, e.cargo "
        + "FROM peajes p INNER JOIN empleados e ON p.codpeaje = e.cod";

    try {
        // Conectar a la base de datos
        cnn = objC.conectar();
        st = cnn.createStatement();
        rs = st.executeQuery(sql);

        // Preparar el modelo de la tabla
        Object[] datos = new Object[5];
        modelo = (DefaultTableModel) TBLGENERAL.getModel();
        modelo.setRowCount(0); // Limpia las filas existentes en la tabla

        // Llenar la tabla con todos los registros
        while (rs.next()) {
            datos[0] = rs.getString("codpeaje");
            datos[1] = rs.getString("distrito");
            datos[2] = rs.getString("codempleado");
            datos[3] = rs.getString("nombres");
            datos[4] = rs.getString("cargo");
            modelo.addRow(datos);
        }

        // Actualizar la tabla
        TBLGENERAL.setModel(modelo);
        cnn.close(); // Cerrar la conexión
    } catch (ClassNotFoundException | SQLException ex) {
        System.out.println("Error es --> " + ex.getMessage());
    }
    }//GEN-LAST:event_btntodosActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
            // Obtén el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) TBLGENERAL.getModel();
    
    // Cuenta el número de filas
    int rowCount = modelo.getRowCount();
    
    // Muestra el número de filas en el JTextField
    jTextField1.setText("Total elementos: " + rowCount);
    }//GEN-LAST:event_jTextField1ActionPerformed
     public void llenaremp(String bus){
     for(empleados emple:Lemple){
         if(emple.getCodpeaje().compareToIgnoreCase(bus)==0){
                  Nomina emplea = new Nomina(emple.getCodpeaje(),emple.getCodemple(),emple.getNomemple(),emple.getCargoemple(),emple.getCargoemple());
                  nomi.add(emplea);
                  leerDistritos();
         }        
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
            java.util.logging.Logger.getLogger(FrmRptGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRptGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRptGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRptGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRptGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBLGENERAL;
    private javax.swing.JButton btntodos;
    private javax.swing.JComboBox<String> cbodist;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
