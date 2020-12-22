package juego;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author danie
 */
public class Principal extends javax.swing.JFrame {

    Vectores vectores = new Vectores();

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        t = new Timer(1000,accion);
        t.start();
        this.txtRespuesta.setTransferHandler(null);
    }
    
    Principal form = this;
    public Timer t;
    private int m=3, s=0;
    
    private int verificador = 0;
    
    
    private ActionListener accion = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            actualizarLabel();
            
            if(m==3){
                m--;
                s=60;
                actualizarLabel();
            }
                
            s--;
            actualizarLabel();
            
            if(m==0 && s==0) 
            {
                actualizarLabel();
                t.stop();
                Sugerencias sugerencias = new Sugerencias();
                Jugador jugador = new Jugador();
                String puntaje = String.valueOf(jugador.puntajePerdedor(sugerencias.CorrectasMaximas));
                JOptionPane.showMessageDialog(null, "¡Tiempo acabado! Has perdido, tu puntación fue: " + puntaje + ". La cadena correcta es: " + txtSucesionCorrecta.getText());
                Conexion con = new Conexion();
                con.Ingresar(jugador.getUsername(), Integer.parseInt(puntaje));
                jugador.setID(con.ConsultarID());
                jugador.setPosicion(con.ConsultarPosicion(jugador.getID()));
                Puntajes puntajes = new Puntajes();
                puntajes.setVisible(true);
                puntajes.setPnlJugadorActual(true);
                form.dispose();
                verificador = 1;
            }
            
            if(s==0) 
            {
                s = 60;
                --m;
            }
        }
        
    };
    
    private void actualizarLabel() {
        String tiempo = (m<=9?"0":"")+m+":"+(s<=9?"0":"")+s;
        etiquetaTiempo.setText(tiempo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRespuesta = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        txtSucesionCorrecta = new javax.swing.JPasswordField();
        txtCaracteresGenerados = new javax.swing.JTextField();
        lblInstrucciones = new javax.swing.JTextArea();
        panelLimitaciones = new javax.swing.JPanel();
        panelSugerencias = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtSugerencias = new javax.swing.JTextArea();
        lblIntentosRestantes = new javax.swing.JLabel();
        txtIntentos = new javax.swing.JTextField();
        etiquetaTiempo = new javax.swing.JLabel();
        lblIntentosRestantes1 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblSucesionCorrecta = new javax.swing.JLabel();
        lblRespuesta = new javax.swing.JLabel();
        lblGenerados = new javax.swing.JLabel();
        imgBackground = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRespuesta.setBackground(new java.awt.Color(216, 234, 255));
        txtRespuesta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRespuesta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuestaActionPerformed(evt);
            }
        });
        txtRespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRespuestaKeyTyped(evt);
            }
        });
        getContentPane().add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 210, -1));

        btnSalir.setBackground(new java.awt.Color(255, 204, 0));
        btnSalir.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 102, 51));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 110, 40));

        txtSucesionCorrecta.setEditable(false);
        txtSucesionCorrecta.setBackground(new java.awt.Color(216, 234, 255));
        txtSucesionCorrecta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtSucesionCorrecta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtSucesionCorrecta.setOpaque(false);
        getContentPane().add(txtSucesionCorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 210, -1));

        txtCaracteresGenerados.setEditable(false);
        txtCaracteresGenerados.setBackground(new java.awt.Color(216, 234, 255));
        txtCaracteresGenerados.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCaracteresGenerados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCaracteresGenerados.setOpaque(false);
        getContentPane().add(txtCaracteresGenerados, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 210, -1));

        lblInstrucciones.setEditable(false);
        lblInstrucciones.setColumns(20);
        lblInstrucciones.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblInstrucciones.setForeground(new java.awt.Color(0, 0, 102));
        lblInstrucciones.setRows(5);
        lblInstrucciones.setText("Instrucciones: La lista de caracteres generados mostrada es la que usted utilizará como\nguía para poder encontrar la sucesión de caracteres correcta oculta, la cual consta \núnicamente de 4 caracteres.\n\nNota: Recuerde que cuenta con el panel de ayuda a su derecha para poder guiarse \npara encontrar los caracteres ocultos.");
        lblInstrucciones.setOpaque(false);
        getContentPane().add(lblInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 610, -1));

        panelLimitaciones.setOpaque(false);
        panelLimitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSugerencias.setOpaque(false);
        panelSugerencias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("SUGERENCIAS");
        panelSugerencias.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        txtSugerencias.setEditable(false);
        txtSugerencias.setColumns(20);
        txtSugerencias.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtSugerencias.setForeground(new java.awt.Color(0, 0, 102));
        txtSugerencias.setRows(5);
        jScrollPane5.setViewportView(txtSugerencias);

        panelSugerencias.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, 200));

        panelLimitaciones.add(panelSugerencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 280, 270));

        lblIntentosRestantes.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblIntentosRestantes.setForeground(new java.awt.Color(0, 0, 102));
        lblIntentosRestantes.setText("Tiempo restante:");
        panelLimitaciones.add(lblIntentosRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtIntentos.setEditable(false);
        txtIntentos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIntentos.setForeground(new java.awt.Color(0, 0, 102));
        txtIntentos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntentos.setText("10");
        txtIntentos.setBorder(null);
        txtIntentos.setOpaque(false);
        panelLimitaciones.add(txtIntentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 30, -1));

        etiquetaTiempo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        etiquetaTiempo.setForeground(new java.awt.Color(0, 0, 102));
        etiquetaTiempo.setText("03:00");
        etiquetaTiempo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                etiquetaTiempoInputMethodTextChanged(evt);
            }
        });
        etiquetaTiempo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                etiquetaTiempoPropertyChange(evt);
            }
        });
        panelLimitaciones.add(etiquetaTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        lblIntentosRestantes1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblIntentosRestantes1.setForeground(new java.awt.Color(0, 0, 102));
        lblIntentosRestantes1.setText("Intentos restantes: ");
        panelLimitaciones.add(lblIntentosRestantes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        getContentPane().add(panelLimitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 280, 360));

        btnIngresar.setBackground(new java.awt.Color(255, 204, 0));
        btnIngresar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 102, 51));
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnIngresarKeyTyped(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 140, 40));

        lblTitulo.setBackground(new java.awt.Color(255, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Bauhaus 93", 0, 30)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 102));
        lblTitulo.setText("Adivina la Sucesión ASCII");
        lblTitulo.setToolTipText("");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 340, 70));

        lblSucesionCorrecta.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblSucesionCorrecta.setForeground(new java.awt.Color(0, 0, 102));
        lblSucesionCorrecta.setText("Sucesión a adivinar: ");
        getContentPane().add(lblSucesionCorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        lblRespuesta.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblRespuesta.setForeground(new java.awt.Color(0, 0, 102));
        lblRespuesta.setText("Respuesta:");
        getContentPane().add(lblRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        lblGenerados.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblGenerados.setForeground(new java.awt.Color(0, 0, 102));
        lblGenerados.setText("Caracteres generados:");
        getContentPane().add(lblGenerados, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/imagenes/GameBackground.png"))); // NOI18N
        getContentPane().add(imgBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 570));

        btnMostrar.setBackground(new java.awt.Color(255, 204, 0));
        btnMostrar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(0, 102, 51));
        btnMostrar.setText("MOSTRAR");
        btnMostrar.setEnabled(false);
        btnMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMostrarMousePressed(evt);
            }
        });
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        Validaciones validar = new Validaciones();
        Sugerencias sugerencia = new Sugerencias();
        
        if (validar.ValidarRespuesta(txtRespuesta) == true)
        {
            char[] sucesion_correcta;
            char[] respuesta;
            
            sucesion_correcta = this.txtSucesionCorrecta.getPassword();
            respuesta = this.txtRespuesta.getText().toCharArray();
            this.txtSugerencias.setText(this.txtSugerencias.getText() + sugerencia.LlenarSugerencia(respuesta, sucesion_correcta));
            this.txtIntentos.setText(String.valueOf(10 - sugerencia.intentos));

            if(sugerencia.GanarOPerder() == 1)
            {               
                t.stop();
                Jugador jugador = new Jugador();
                String puntaje = String.valueOf(jugador.puntaje(Integer.parseInt(txtIntentos.getText()), s, m));
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has ganado, tu puntuación fue: " + puntaje);
                Conexion con = new Conexion();
                con.Ingresar(jugador.getUsername(), Integer.parseInt(puntaje));
                jugador.setID(con.ConsultarID());
                jugador.setPosicion(con.ConsultarPosicion(jugador.getID()));
                this.txtSugerencias.setText(null);
                this.txtRespuesta.setText(null);
                Puntajes puntajes = new Puntajes();
                puntajes.setVisible(true);
                puntajes.setPnlJugadorActual(true);
                this.dispose();
                verificador = 1;
            }
            
            if(sugerencia.GanarOPerder() == 2)
            {
                t.stop(); 
                Jugador jugador = new Jugador();
                Sugerencias sugerencias = new Sugerencias();
                String puntaje = String.valueOf(jugador.puntajePerdedor(sugerencias.CorrectasMaximas));
                JOptionPane.showMessageDialog(null, "¡Intentos terminados! Has perdido, tu puntuación fue: " + puntaje + ". La cadena correcta es: " + this.txtSucesionCorrecta.getText());
                Conexion con = new Conexion();
                con.Ingresar(jugador.getUsername(), Integer.parseInt(puntaje));
                jugador.setID(con.ConsultarID());
                jugador.setPosicion(con.ConsultarPosicion(jugador.getID()));
                this.txtSugerencias.setText(null);
                this.txtRespuesta.setText(null);
                this.setVisible(false);
                Puntajes puntajes = new Puntajes();
                puntajes.setVisible(true);
                puntajes.setPnlJugadorActual(true);
                this.dispose();
                verificador = 1;
            }
            
            this.txtRespuesta.setText(null);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        this.txtCaracteresGenerados.setText(String.valueOf(vectores.CaracteresAsciiAleatoriosPantalla()));
        this.txtSucesionCorrecta.setText(String.valueOf(vectores.CaracteresOcultos()));
        this.txtRespuesta.setText("");
        
    }//GEN-LAST:event_formComponentShown

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        t.stop();
        Menu menu = new Menu();
        this.dispose();
        menu.setVisible(true);
        verificador = 1;
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtRespuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespuestaKeyTyped
        if ((evt.getKeyChar() == KeyEvent.VK_SPACE))
        {
            JOptionPane.showMessageDialog(rootPane, "No se pueden ingresar espacios.");
            evt.consume();
        }   
        if (this.txtRespuesta.getText().length()== 4) 
        {
            evt.consume(); 
        }
        
        if (evt.getKeyChar() != this.txtCaracteresGenerados.getText().charAt(0) && evt.getKeyChar() != this.txtCaracteresGenerados.getText().charAt(1) && evt.getKeyChar() != this.txtCaracteresGenerados.getText().charAt(2) && evt.getKeyChar() != this.txtCaracteresGenerados.getText().charAt(3) && evt.getKeyChar() != this.txtCaracteresGenerados.getText().charAt(4) && evt.getKeyChar() != this.txtCaracteresGenerados.getText().charAt(5) && evt.getKeyChar() != this.txtCaracteresGenerados.getText().charAt(6) && evt.getKeyChar() != this.txtCaracteresGenerados.getText().charAt(7))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtRespuestaKeyTyped

    private void txtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaActionPerformed

    private void etiquetaTiempoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_etiquetaTiempoPropertyChange

    }//GEN-LAST:event_etiquetaTiempoPropertyChange

    private void etiquetaTiempoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_etiquetaTiempoInputMethodTextChanged

    }//GEN-LAST:event_etiquetaTiempoInputMethodTextChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
        if (verificador==0)
        {
            t.stop();
            Menu menu = new Menu();
            menu.setVisible(true);
        }

    }//GEN-LAST:event_formWindowClosed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:

        this.txtSucesionCorrecta.setEchoChar((char)0);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnMostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMousePressed

    }//GEN-LAST:event_btnMostrarMousePressed

    private void btnMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseClicked

        if (this.btnMostrar.getText().equals("Mostrar"))
        {
            this.txtSucesionCorrecta.setEchoChar((char)0);
            this.btnMostrar.setText("Ocultar");
        }
        else if (this.btnMostrar.getText().equals("Ocultar"))
        {
            this.txtSucesionCorrecta.setEchoChar('•');
            this.btnMostrar.setText("Mostrar");
        }
    }//GEN-LAST:event_btnMostrarMouseClicked

    private void btnIngresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyTyped

    }//GEN-LAST:event_btnIngresarKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JLabel imgBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblGenerados;
    private javax.swing.JTextArea lblInstrucciones;
    private javax.swing.JLabel lblIntentosRestantes;
    private javax.swing.JLabel lblIntentosRestantes1;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JLabel lblSucesionCorrecta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelLimitaciones;
    private javax.swing.JPanel panelSugerencias;
    private javax.swing.JTextField txtCaracteresGenerados;
    private javax.swing.JTextField txtIntentos;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JPasswordField txtSucesionCorrecta;
    private javax.swing.JTextArea txtSugerencias;
    // End of variables declaration//GEN-END:variables
}
