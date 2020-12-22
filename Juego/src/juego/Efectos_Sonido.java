
package juego;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.JOptionPane;

public class Efectos_Sonido 
{
  		
    Clip audio_clip;

    public void CargarAudio (String nombre_archivo)
    {			
        try
        {
            File archivo = new File(nombre_archivo);
            AudioInputStream sonido = AudioSystem.getAudioInputStream(archivo);	
            audio_clip = AudioSystem.getClip();
            audio_clip.open(sonido);
        }
        catch(IOException | LineUnavailableException | UnsupportedAudioFileException e)
        {
            JOptionPane.showMessageDialog(null, "Error: "+ e.toString());
        }
    }

    public void Play()
    {			
        audio_clip.setFramePosition(0);
        audio_clip.start();
    }

/*
public class Sound {
	
	JFrame window;
	Container con;
	JPanel buttonPanel;
	JButton soundButton;
	String clickSound;
	ButtonHandler bHandler = new ButtonHandler();
	SoundEffect se = new SoundEffect();
	

	
	public Sound(){
	
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		con = window.getContentPane();
		
		buttonPanel = new JPanel();
		buttonPanel.setBounds(300, 300, 200, 100);
		buttonPanel.setBackground(Color.black);
		con.add(buttonPanel);
		
		soundButton = new JButton("Sound Effect");
		soundButton.setFocusPainted(false);
		soundButton.addActionListener(bHandler);
		soundButton.setActionCommand("soundB");
		buttonPanel.add(soundButton);
				
		window.setVisible(true);
			
		clickSound = ".//res//retroClick.wav";
	}
	
*/
}
	


    

