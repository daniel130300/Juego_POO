
package juego;

public class Jugador 
{
    private static Integer Posicion;
    private static Integer ID;
    private static String Username;
    private static Integer Puntuacion;

    public static Integer getPosicion() {
        return Posicion;
    }

    public static void setPosicion(Integer Posicion) {
        Jugador.Posicion = Posicion;
    }

    public static Integer getID() {
        return ID;
    }

    public static void setID(Integer ID) {
        Jugador.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        Jugador.Username = Username;
    }

    public static Integer getPuntuacion() {
        return Puntuacion;
    }

    public static void setPuntuacion(Integer Puntuacion) {
        Jugador.Puntuacion = Puntuacion;
    }
    
    public Integer puntaje(int intento, int segundos, int minutos)
    {
        int puntaje=0;
        
        switch(intento)
        {
            case 9: 
                if(minutos==2)
                {
                    if(segundos>=46)
                        puntaje=500;
                    if(segundos>=30 && segundos<=45)
                        puntaje=450;
                    if(segundos<=29)
                        puntaje=400;
                }
                else if(minutos==1)
                    puntaje=350;
                else if(minutos<1)
                    puntaje=300;
            break;
                        
            case 8: 
                if(minutos==2)
                {
                    if(segundos>=46)
                        puntaje=450;
                    if(segundos>=30 && segundos<=45)
                        puntaje=400;
                    if(segundos<=29)
                        puntaje=350;
                }
                else if(minutos==1)
                    puntaje=300;
                else if(minutos<1)
                    puntaje=250;

            break;
                        
            case 7: 
                if(minutos==2)
                {
                    if(segundos>=46)
                        puntaje=400;
                    if(segundos>=30 && segundos<=45)
                        puntaje=350;
                    if(segundos<=29)
                        puntaje=300;
                }
                else if(minutos==1)
                    puntaje=250;
                else if(minutos<1)
                    puntaje=200;
            break;
                    
            case 6: 
                if(minutos==2)
                    puntaje=300;
                else if(minutos==1)
                    puntaje=250;
                else if(minutos<1)
                    puntaje=200;
            break;
                        
            case 5: 
            case 4:
            case 3: 
                if(minutos==2)
                    puntaje=150;
                else if(minutos==1)
                    puntaje=100;
                else if(minutos<1)
                    puntaje=50;
            break;
                        
            case 2:
            case 1:
            case 0: 
                if(minutos==2)
                    puntaje=40;
                else if(minutos==1)
                    puntaje=30;
                else if(minutos<1)
                    puntaje=25;
            break;
        }
        Puntuacion = puntaje;
        return puntaje;
    }
    
    public Integer puntajePerdedor(int contadorCorrectas)
    {
        Integer puntaje =  0;
        
        if (contadorCorrectas == 0)
            puntaje = 5;
        else if (contadorCorrectas == 1)
            puntaje = 10;
        else if (contadorCorrectas == 2)
            puntaje = 15;
        else if (contadorCorrectas == 3)
            puntaje = 20;
        
        Puntuacion = puntaje;
        return puntaje;
    }
}
