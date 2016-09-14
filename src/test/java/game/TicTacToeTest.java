package game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by arjunsv on 9/13/16.
 */
public class TicTacToeTest {

    TicTacToe ticTacToe;

    @Before
    public void setup()
    {
        ticTacToe = new TicTacToe();
    }

    @After
    public void tearDown()
    {

    }

    @Test
    public void canary()
    {
        assertTrue(true);
    }

    @Test
    public void gameWonByNoneAtStart()
    {
        assertEquals("none", ticTacToe.winner());
    }

//    @Test
//    public void pickFirstPlayer()
//    {
//      //  TicTacToe ticTacToe = new TicTacToe();
//      //  ticTacToe.setFirstPlayer(new Player("Player1", new xPeg()));
//
//      //  assertEquals("Player1",ticTacToe.getFirstPlayer().getName());
//
//        ticTacToe.setFirstPlayer(new Player(new xPeg()));
//        assertEquals("X",ticTacToe.getFirstPlayer().getPeg().getFace());

//    }

    @Test
    public void placeFirstPeg()
    {
        assertEquals(TicTacToe.Peg.FIRST, ticTacToe.placePeg(0,1));
    }

    @Test
    public void placeSecondPeg()
    {
        ticTacToe.placePeg(0,2);
        assertEquals(TicTacToe.Peg.SECOND, ticTacToe.placePeg(0,1));
    }

    @Test
    public void placePegAtOccupiedPosition()
    {
        ticTacToe.placePeg(2,1);
        assertEquals(TicTacToe.Peg.FIRST, ticTacToe.placePeg(2,1));
    }

    @Test
    public void placePegOutofRowRange()
    {
        try {
            ticTacToe.placePeg(0, 7);
            fail("Expected exception for out of row bounds");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {

        }
    }

    @Test
    public void placePegOutofColumnRange()
    {
        try{
            ticTacToe.placePeg(8,0);
            fail("Expected exception for out of column bounds");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {

        }
    }
}
