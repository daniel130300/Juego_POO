package juego;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Sugerencias {
    
    public static Integer CorrectasMaximas = -1;
    
    public static int intentos = 0;
    private Integer contadorCorrecto=0, contadorIncorrecto=0, contadorInvertido=0;
    String[] vectorRespuesta = new String[4];
    int centi=0;
    
    public String LlenarSugerencia(char[]respuesta, char[]sucesioncorrecta)
    {
        String sugerencia = "";
        
        for (int i = 0; i<sucesioncorrecta.length; i++)
        {
            if (respuesta[i] == sucesioncorrecta[i])
            {   
                this.contadorCorrecto++;
            }
            else
            {
                for(int j=0; j<4; j++)
                {
                    if(j!=i)
                    {
                        if(respuesta[i] == sucesioncorrecta[j])
                            this.contadorInvertido++;
                    }
                }
            }
            
            for(int j=0; j<4; j++)
            {
                if(respuesta[i]!= sucesioncorrecta[j])
                    centi++;
                else
                    centi--;
            }
            if(centi==4)
                this.contadorIncorrecto++;

            centi=0;
        }
        
        intentos++;
        
        sugerencia = "\nIntento " + intentos + "\n\nCarácteres Ingresados: " +Arrays.toString(respuesta)+ 
        "\nCarácteres Correctos: " +this.contadorCorrecto + "\nCaracteres Incorrectos: " +this.contadorIncorrecto+ 
        "\nCaracteres Invertidos: " +this.contadorInvertido + "\n";
        
                
        if (this.contadorCorrecto > CorrectasMaximas)
        {
            CorrectasMaximas = this.contadorCorrecto;
        }
        
        
        return sugerencia;
    }
    
    public Integer GanarOPerder(){
       
        int verificador = 0;
        
        if(this.contadorCorrecto == 4){
             
            verificador = 1;
        }
        
        if(intentos == 10 && this.contadorCorrecto != 4){
            verificador = 2;
        }
        
        return verificador;
    }
}