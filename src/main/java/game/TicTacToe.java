package game;

/**
 * Created by arjunsv on 9/13/16.
 */
public class TicTacToe {

    private Peg currentPeg;
    public enum Peg {NONE, FIRST, SECOND }
    private Player firstPlayer;
    private final int SIZE = 3;
    private Peg[][] cells = new Peg[SIZE][SIZE];

    public TicTacToe()
    {
        for(int i=0; i < SIZE; i++)
            for(int j=0; j < SIZE; j++)
                cells[i][j] = Peg.NONE;

        currentPeg = Peg.FIRST;
    }
    public String winner() {
        return "none";
    }

    public Peg placePeg(int row, int col)
    {
        if(cells[row][col] == Peg.NONE) {
            cells[row][col] = currentPeg;
            currentPeg = togglePeg();
        }
            return cells[row][col];

    }

    private Peg togglePeg() {
        return (currentPeg == Peg.FIRST) ? Peg.SECOND: Peg.FIRST;
    }

    public void setFirstPlayer(Player firstPlayer) {
        this.firstPlayer = firstPlayer;
    }
}
