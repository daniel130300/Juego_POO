
package juego;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Inicio extends javax.swing.JFrame {
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.txtUsername.setTransferHandler(null);
    }

        Jugador jugador = new Jugador();
        Efectos_Sonido efectos = new Efectos_Sonido();
        
        int verificador = 0;
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgUser = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnJugar = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 290));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/imagenes/UserFinal.png"))); // NOI18N
        imgUser.setMaximumSize(new java.awt.Dimension(40, 40));
        imgUser.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(imgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 60, 60));

        txtUsername.setBackground(new java.awt.Color(216, 234, 255));
        txtUsername.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUsername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtUsername.setOpaque(false);
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 210, -1));

        btnJugar.setBackground(new java.awt.Color(255, 204, 0));
        btnJugar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(0, 102, 51));
        btnJugar.setText("JUGAR");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 170, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/imagenes/Background_Inicio.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(650, 320));
        background.setMinimumSize(new java.awt.Dimension(650, 320));
        background.setPreferredSize(new java.awt.Dimension(650, 320));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed

    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        if ((evt.getKeyChar() == KeyEvent.VK_SPACE))
        {
            JOptionPane.showMessageDialog(rootPane, "No se pueden ingresar espacios.");
            evt.consume();
        }     
        if (this.txtUsername.getText().length()== 15) 
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
        if (verificador == 0)
        {
            Menu menu = new Menu();
            menu.setVisible(true);
        }

    }//GEN-LAST:event_formWindowClosed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
               
        verificador = 1;
        Validaciones validar = new Validaciones();
        JFrame form = this;  
        validar.ValidarUsername(this.txtUsername, form);  
    }//GEN-LAST:event_btnJugarActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel imgUser;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
