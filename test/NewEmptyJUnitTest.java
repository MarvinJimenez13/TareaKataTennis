import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import tareakatatennis.Juego;

/**
 *
 * @author Marvin
 */
public class NewEmptyJUnitTest {
    
    private Juego juego;

    @Test
    public void verEstatusJugador1() {
    
        juego = new Juego("Marvin", "Roberto");
        for (int i = 0; i < 15; i++) {
            juego.punto(Juego.JUGADOR1);
        }
        
        assertEquals(juego.estatusJuego(Juego.JUGADOR1), "fifteen");
    
    }
    
    @Test
    public void verEstatusJugador2() {
    
        juego = new Juego("Marvin", "Roberto");
        for (int i = 0; i < 30; i++) {
            juego.punto(Juego.JUGADOR2);
        }
        
        assertEquals(juego.estatusJuego(Juego.JUGADOR2), "thirty");
    
    }
    
    @Test 
    public void ventaja(){
        
        juego = new Juego("Rob", "Mar");
        for (int i = 0; i < 30; i++) {
            juego.punto(Juego.JUGADOR1);
        }
        for (int i = 0; i < 31; i++) {
            juego.punto(Juego.JUGADOR2);
        }
        
        assertEquals(juego.ventaja(), "Mar");
        
    }
    
    @Test
    public void esDeuce(){
        
        juego = new Juego("Roberto", "Marvin");
        for (int i = 0; i < 40; i++) {
            juego.punto(Juego.JUGADOR1);
            juego.punto(Juego.JUGADOR2);
        }
        
        assertEquals(juego.esDeuce(), "deuce");
        
    }
    
    @Test
    public void ganador(){
        
        juego = new Juego("Marvin", "Roberto");
        for (int i = 0; i < 10; i++) {
            juego.punto(Juego.JUGADOR1);
        }
        for (int i = 0; i < 41; i++) {
            juego.punto(Juego.JUGADOR2);
        }
        
        assertEquals(juego.ganador(), "Roberto");
        
    }
    
}
