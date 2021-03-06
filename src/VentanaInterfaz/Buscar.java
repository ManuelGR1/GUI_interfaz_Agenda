package VentanaInterfaz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ManuelRamón
 */
public class Buscar extends javax.swing.JFrame {

    /**
     * Creates new form Buscar
     */
    public Buscar() {
        initComponents();
        this.setLocation(550, 150);
    }
    
    Connection cn;
    PreparedStatement ps; /*La interfaz PreparedStatement hereda de Statement(http://seduca.uaemex.mx/material/LIA/POO/materiales/PreparedStatement.html)*/
    ResultSet rs;
    ResultSetMetaData rsm;/*http://www.chuidiang.org/java/mysql/ResultSet-DataBase-MetaData.php*/
    DefaultTableModel dtm; //El DefaultTableModel es una clase que implementa TableModel 


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoApellido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CampoTextArea = new javax.swing.JTextArea();
        BotonBuscar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CampoJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        Datos = new javax.swing.JButton();
        Status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Pristina", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar");

        Nombre.setText("Nombre");

        jLabel2.setText("Apellido");

        CampoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoApellidoActionPerformed(evt);
            }
        });

        CampoTextArea.setColumns(20);
        CampoTextArea.setRows(5);
        jScrollPane1.setViewportView(CampoTextArea);

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        Limpiar.setText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Cerrar.setText("CERRAR");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        CampoJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido"
            }
        ));
        CampoJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoJTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CampoJTable);

        jLabel3.setText("Pulsa el boton datos para ver registro >>");

        Datos.setText("DATOS");
        Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosActionPerformed(evt);
            }
        });

        Status.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nombre)
                                .addGap(18, 18, 18)
                                .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Status)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(CampoApellido)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonBuscar))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Datos)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre)
                            .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CampoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BotonBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Datos))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpiar)
                    .addComponent(Cerrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoApellidoActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // boton cerrar:
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        CampoNombre.setText("");
        CampoApellido.setText("");
        CampoTextArea.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("org.sqlite.JDBC");
            cn = DriverManager.getConnection("jdbc:sqlite:datos.sqlite");
            ps = cn.prepareStatement("select * from datos");
            try {
                rs = ps.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                rsm = rs.getMetaData();
            } catch (SQLException ex) {
                Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
            }
            ArrayList<Object[]> data = new ArrayList<>();
            try {
                while (rs.next()) {
                    Object[] rows = new Object[rsm.getColumnCount()];
                    for (int i = 0; i < rows.length; i++) {
                        rows[i] = rs.getObject(i + 1);
                    }
                    data.add(rows);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
            }

            dtm = (DefaultTableModel) this.CampoJTable.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_DatosActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        String nom = CampoNombre.getText().trim();
        //metodo que quita espacio delante y detras
        String ape = CampoApellido.getText().trim();
        String consulta;
        CampoTextArea.setText("");
        if (nom.length() != 0 && ape.length() != 0) {
            consulta = bd.seleccion2(nom, ape);
            CampoTextArea.setText(consulta);
            BufferedWriter fichero3 = null;
            try {
                fichero3 = new BufferedWriter(new FileWriter("fichero.txt", true));
                fichero3.write(CampoNombre.getText() + " ");
                fichero3.write(CampoApellido.getText() + " ");
                fichero3.write(" " + consulta);
                fichero3.newLine();
                fichero3.close();
                Status.setText("Resultado");
                //ficheros con interfaz grafica
            } catch (IOException ex) {
                //System.out.println("Error al guardar en fichero");
                Status.setText("Error al escribir en fichero");
            } finally {

                try {
                    fichero3.close();
                } catch (IOException ex) {
                    System.out.println("Error al guardar en fichero3");
                }
            }

        } else {
            Status.setText("Error en los campos");
//consulta = bd.seleccion();
//jTextArea2.setText(consulta); 
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void CampoJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoJTableMouseClicked
        // TODO add your handling code here:
        int seleccion = CampoJTable.rowAtPoint(evt.getPoint());
        CampoNombre.setText(String.valueOf(CampoJTable.getValueAt(seleccion,0)));
        CampoApellido.setText(String.valueOf(CampoJTable.getValueAt(seleccion,1)));
    }//GEN-LAST:event_CampoJTableMouseClicked

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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JTextField CampoApellido;
    private javax.swing.JTable CampoJTable;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextArea CampoTextArea;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Datos;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
BBDD bd = new BBDD();
}
