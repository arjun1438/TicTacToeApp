package game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by arjunsv on 9/13/16.
 */
public class TicTacToeTest {

    @Test
    public void canary()
    {
        assertTrue(true);
    }

    @Test
    public void gameWonByNoneAtStart()
    {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals("none", ticTacToe.winner());
    }
}
