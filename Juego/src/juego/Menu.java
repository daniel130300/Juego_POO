/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author danie
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        btnTablaPuntuaciones = new javax.swing.JButton();
        btnNuevaPartida = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTablaPuntuaciones.setBackground(new java.awt.Color(255, 204, 0));
        btnTablaPuntuaciones.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnTablaPuntuaciones.setForeground(new java.awt.Color(0, 102, 51));
        btnTablaPuntuaciones.setText("Tabla de Puntuaciones");
        btnTablaPuntuaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaPuntuacionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnTablaPuntuaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 250, 50));

        btnNuevaPartida.setBackground(new java.awt.Color(255, 204, 0));
        btnNuevaPartida.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnNuevaPartida.setForeground(new java.awt.Color(0, 102, 51));
        btnNuevaPartida.setText("Nueva Partida");
        btnNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevaPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 250, 50));

        lblTitle.setBackground(new java.awt.Color(255, 0, 0));
        lblTitle.setFont(new java.awt.Font("Bauhaus 93", 0, 30)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setText("Adivina la Sucesión ASCII");
        lblTitle.setToolTipText("");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 350, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/imagenes/Colorful.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTablaPuntuacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaPuntuacionesActionPerformed

        Puntajes puntaje = new Puntajes();
        puntaje.setVisible(true);
        puntaje.setPnlJugadorActual(false);
        this.dispose();
    }//GEN-LAST:event_btnTablaPuntuacionesActionPerformed

    private void btnNuevaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaPartidaActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNuevaPartidaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaPartida;
    private javax.swing.JButton btnTablaPuntuaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}