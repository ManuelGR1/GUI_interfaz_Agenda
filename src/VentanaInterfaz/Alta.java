package VentanaInterfaz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ManuelRamón
 */
public class Alta extends javax.swing.JFrame {

    /**
     * Creates new form Alta
     */
    public Alta() {
        initComponents();
        this.setLocation(150, 150);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        Dni = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        Alta = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        CampoDni = new javax.swing.JTextField();
        CampoNombre = new javax.swing.JTextField();
        CampoApellido = new javax.swing.JTextField();
        CampoDireccion = new javax.swing.JTextField();
        CampoTelefono = new javax.swing.JTextField();
        alta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Nombre.setText("Nombre");

        Apellido.setText("Apellido");

        Dni.setText("DNI");

        Direccion.setText("Direccion");

        Telefono.setText("Telefono");

        Status.setForeground(new java.awt.Color(51, 0, 204));
        Status.setText("Status");

        Alta.setText("ALTA");
        Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaActionPerformed(evt);
            }
        });

        Cerrar.setText("CERRAR");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        Limpiar.setText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        CampoDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDniActionPerformed(evt);
            }
        });

        CampoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTelefonoActionPerformed(evt);
            }
        });

        alta.setFont(new java.awt.Font("Pristina", 3, 48)); // NOI18N
        alta.setForeground(new java.awt.Color(51, 51, 255));
        alta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alta.setText("ALTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre)
                            .addComponent(Dni))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CampoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Apellido)
                        .addGap(18, 18, 18)
                        .addComponent(CampoApellido))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Status)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Direccion)
                            .addComponent(Telefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoDireccion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Alta)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(alta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alta)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dni)
                    .addComponent(CampoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido)
                    .addComponent(CampoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Direccion)
                    .addComponent(CampoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono)
                    .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Alta)
                .addGap(10, 10, 10)
                .addComponent(Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cerrar)
                    .addComponent(Limpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDniActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // Codificamos el boton limpiar:
        CampoDni.setText("");
        CampoNombre.setText("");
        CampoApellido.setText("");
        CampoDireccion.setText("");
        CampoTelefono.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void AltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaActionPerformed
        // Codificamos el boton alta:
        String nom = CampoNombre.getText().trim(); // trim metodo que quita espacio delante y detras de lo que introduce el usuario
        String ape = CampoApellido.getText().trim();
        String direccion = CampoDireccion.getText().trim();
        String dni = CampoDni.getText().trim();
        String telefono = CampoTelefono.getText().trim();
        if (nom.length() != 0 && ape.length() != 0) {
            String resultado = bd.insercion(nom, ape, direccion, dni, telefono);
            BufferedWriter fichero3 = null;
            try {
                fichero3 = new BufferedWriter(new FileWriter("fichero.txt", true));
                fichero3.write(CampoNombre.getText() + " ");
                fichero3.write(CampoApellido.getText() + " ");
                fichero3.write(CampoDireccion.getText() + " ");
                fichero3.write(CampoDni.getText() + " ");
                fichero3.write(CampoTelefono.getText() + " ");
                fichero3.write(" " + resultado);
                fichero3.newLine();
                fichero3.close();
                Status.setText("Alta correcta");
                //ficheros con interfaz grafica
            } catch (IOException ex) {
                System.out.println("Error al guardar en fichero");
                Status.setText("Erro al escribir en fichero");
            } finally {
                try {
                    fichero3.close();
                } catch (IOException ex) {
                    System.out.println("Error al guardar en fichero3");
                }
            }
        } else {
            Status.setText("Error en los campos");
        }
    }//GEN-LAST:event_AltaActionPerformed

    private void CampoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alta;
    private javax.swing.JLabel Apellido;
    private javax.swing.JTextField CampoApellido;
    private javax.swing.JTextField CampoDireccion;
    private javax.swing.JTextField CampoDni;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoTelefono;
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Dni;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel alta;
    // End of variables declaration//GEN-END:variables
BBDD bd = new BBDD();
}
