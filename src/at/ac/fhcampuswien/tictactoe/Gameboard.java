package at.ac.fhcampuswien.tictactoe;

public class Gameboard {

    private int [][] board;
    public Gameboard () {

         board = new int[3][3];
    }

    void printBoard(){

        int i1= 0;
        int i2 =0;

        for (i1 + )


    public static final int ROWS=0,COLS=0, EMPTY = 0, NOUGHT = 1, CROSS = 2;

}

    public void set(char player, int spalte, int reihe) {

        if (player == 'X') {
            this.board[spalte][reihe] = 1;
        } else if {player == "O"
        } else if {player == "O"
            this.board[spalte][reihe] = 2;
        }
    }

    int round = 1; // gerade Zahl: Spieler 1, ungerade Zahl : Spieler 2


    public int[][] getBoard() {
        return board;
    }

    public static int getEMPTY() {
        return EMPTY;
    }

    public static int getNOUGHT() {
        return NOUGHT;
    }

    public static int getCROSS() {
        return CROSS;
    }
}
