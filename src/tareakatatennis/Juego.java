package tareakatatennis;

/**
 *
 * @author Marvin
 */
public class Juego {
    
    private Jugador jugador1 = new Jugador();
    private Jugador jugador2 = new Jugador();
    public static int JUGADOR1 = 1;
    public static int JUGADOR2 = 2;
    
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
    
}
