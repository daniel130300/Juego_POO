
package juego;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Vectores 
{
    private Integer[] numeros_aleatorios = new Integer[94];
    private int[] numeros = new int[numeros_aleatorios.length];
    private char[] Caracteres_Ascii = new char [8];
    private char[] caracteresAsciiOcultos = new char[4];
    
    List<String> Ascii = new ArrayList<>();
    
    private void NumerosAleatorios(Integer[]arreglo1, int[]arreglo2) //numeros_aleatorios, numeros
    {       
        for (int i = 0; i < arreglo1.length; i++) 
        {
           arreglo1[i] = i+33;
        }
        
        Collections.shuffle(Arrays.asList(arreglo1));
        
        for (int i=0; i<arreglo2.length; i++)
        {
            arreglo2[i] = arreglo1[i];
        }
    }

    public char[] CaracteresAsciiAleatoriosPantalla() 
    {
        NumerosAleatorios(numeros_aleatorios, numeros);
        
        for (int i=0; i<this.Caracteres_Ascii.length; i++)
        {
            this.Caracteres_Ascii[i] = (char) this.numeros[i]; 
            Ascii.add(String.valueOf(this.Caracteres_Ascii[i]));
        }

        Collections.shuffle(Ascii);
        
        for (int i=0; i<this.Caracteres_Ascii.length; i++)
        {
            Caracteres_Ascii[i] = Ascii.get(i).charAt(0);
        }
        
        return Caracteres_Ascii;
    }
    
    public char[] CaracteresOcultos(){
        
        Collections.shuffle(Ascii);
        
        for(int i=0; i<this.caracteresAsciiOcultos.length; i++){
            
            caracteresAsciiOcultos[i] = Ascii.get(i).charAt(0);
        }
        
        return caracteresAsciiOcultos;
    }
}
