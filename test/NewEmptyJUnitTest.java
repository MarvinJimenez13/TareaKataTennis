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
    
}
