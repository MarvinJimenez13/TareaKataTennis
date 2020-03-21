package tareakatatennis;

/**
 *
 * @author Marvin
 */
public class Juego {
    
    private Jugador jugador1 = new Jugador();
    private Jugador jugador2 = new Jugador();
    public static final int JUGADOR1 = 1;
    public static final int JUGADOR2 = 2;
    
    public Juego(String nombreJugador1, String nombreJugador2){
        
        jugador1.setNombre(nombreJugador1);
        jugador2.setNombre(nombreJugador2);
        
    }
    
    public void punto(int jugador){
        
        if(jugador == Juego.JUGADOR1)
            jugador1.puntuacion++;
        else if(jugador == Juego.JUGADOR2)
            jugador2.puntuacion++;
        
    }
    
    public String estatusJuego(int jugador){
        
        String estatus = "";
        
        switch (jugador) {
            case Juego.JUGADOR1:
                if(jugador1.getPuntuacion() == 40)
                    estatus = "forty";
                else if(jugador1.getPuntuacion() == 30)
                    estatus = "thirty";
                else if(jugador1.getPuntuacion() == 15)
                    estatus = "fifteen";
                else if(jugador1.getPuntuacion() == 0)
                    estatus = "love";
                break;
            case Juego.JUGADOR2:
                if(jugador2.getPuntuacion() == 40)
                    estatus = "forty";
                else if(jugador2.getPuntuacion() == 30)
                    estatus = "thirty";
                else if(jugador2.getPuntuacion() == 15)
                    estatus = "fifteen";
                else if(jugador2.getPuntuacion() == 0)
                    estatus = "love";
                break;
            default:
                throw new AssertionError();
        }
        
        return estatus;
        
    }
    
    public String esDeuce(){
        
        String deuce = "";
        if(jugador1.getPuntuacion() == 40 && jugador2.getPuntuacion() == jugador1.getPuntuacion())
            deuce = "deuce";
        else
            deuce = null;
        
        return deuce;
        
    }
    
    public String ventaja(){
        
        String ventaja = "";
        
        if(jugador1.getPuntuacion() + 1  == jugador2.getPuntuacion())
            ventaja = jugador2.getNombre();
        else if(jugador2.getPuntuacion() + 1 == jugador1.getPuntuacion())
            ventaja = jugador1.getNombre();
        
        return ventaja;
            
    }
    
    public String ganador(){
        
        String ganador = "";
        
        if(jugador1.getPuntuacion() > 40 && jugador2.getPuntuacion() < 40)
            ganador = jugador1.getNombre();
        else if(jugador2.getPuntuacion() > 40 && jugador1.getPuntuacion() < 40)
            ganador = jugador2.getNombre();
        
        return ganador;
        
    }
    
}
