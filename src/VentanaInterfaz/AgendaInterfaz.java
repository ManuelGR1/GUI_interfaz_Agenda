package VentanaInterfaz;

/**
 *
 * @author ManuelRamón
 */
public class AgendaInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form AgendaInterfaz
     */
    public AgendaInterfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ALTA = new javax.swing.JButton();
        BAJA = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();
        LOG = new javax.swing.JButton();
        CERRAR = new javax.swing.JButton();
        Agenda = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ALTA.setText("ALTA");
        ALTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTAActionPerformed(evt);
            }
        });
        getContentPane().add(ALTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        BAJA.setText("BAJA");
        BAJA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAJAActionPerformed(evt);
            }
        });
        getContentPane().add(BAJA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        MODIFICAR.setText("MODIFICAR");
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });
        getContentPane().add(MODIFICAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        BUSCAR.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        BUSCAR.setText("BUSCAR");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });
        getContentPane().add(BUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        LOG.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LOG.setText("LOG");
        LOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGActionPerformed(evt);
            }
        });
        getContentPane().add(LOG, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        CERRAR.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        CERRAR.setText("CERRAR");
        CERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CERRARActionPerformed(evt);
            }
        });
        getContentPane().add(CERRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        Agenda.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 48)); // NOI18N
        Agenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Agenda.setText("AGENDA");
        getContentPane().add(Agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 34, 610, 110));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CERRARActionPerformed
        // Codificamos el boton cerrar
        System.exit(0);
    }//GEN-LAST:event_CERRARActionPerformed

    private void ALTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTAActionPerformed
        // Codificamos boton alta:
        if (v1 == null);
        v1 = new Alta();
        v1.setVisible(true);
    }//GEN-LAST:event_ALTAActionPerformed

    private void BAJAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAJAActionPerformed

        if (v2 == null);
        v2 = new Baja();
        v2.setVisible(true);
    }//GEN-LAST:event_BAJAActionPerformed

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
   
        if (v3 == null);
        v3 = new Modificar();
        v3.setVisible(true);
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        // TODO add your handling code here:
        if (v4 == null);
        v4 = new Buscar();
        v4.setVisible(true);
    }//GEN-LAST:event_BUSCARActionPerformed

    private void LOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGActionPerformed
        // TODO add your handling code here:
        if (v5 == null);
        v5 = new Logs();
        v5.setVisible(true);

    }//GEN-LAST:event_LOGActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTA;
    private javax.swing.JLabel Agenda;
    private javax.swing.JButton BAJA;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JButton CERRAR;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton LOG;
    private javax.swing.JButton MODIFICAR;
    // End of variables declaration//GEN-END:variables
private Alta v1;
private Baja v2;
private Modificar v3;
private Buscar v4;
private Logs v5;
}
