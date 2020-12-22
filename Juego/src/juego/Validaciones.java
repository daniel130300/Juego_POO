/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author danie
 */
public class Validaciones 
{
    Jugador jugador = new Jugador();
    Efectos_Sonido efectos = new Efectos_Sonido();
    Sugerencias sugerencia = new Sugerencias();
    
    public void ValidarUsername(JTextField Username, JFrame inicio)
    {
        if (!Username.getText().equals("") && Username.getText().length() >= 4)
        {
            jugador.setUsername(Username.getText());
            Principal principal = new Principal();
            principal.setVisible(true);
            inicio.dispose();
            efectos.CargarAudio("StartGame.wav");
            sugerencia.intentos = 0;
            //efectos.Play();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "¡Error! Ingrese su nombre de usuario.");
        }
    }
    
    public boolean ValidarRespuesta(JTextField Respuesta)
    {
        boolean bool = true;
        
        if(Respuesta.getText().equals("") || Respuesta.getText().length() < 4)
        {
            JOptionPane.showMessageDialog(null, "¡Error! El campo no debe contener menos de 4 caracteres.");
            bool = false;
        }
        
        return bool;
    }
}
    

