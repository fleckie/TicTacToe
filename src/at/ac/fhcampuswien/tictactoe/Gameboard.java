package at.ac.fhcampuswien.tictactoe;

import java.util.Arrays;

public class Gameboard {

    private int turn;
    public int spalte;
    public int zeile;
    public static final int ROWS = 3, COLS = 3, EMPTY = 0, NOUGHT = 1, CROSS = 2;
    private char[][] board;
    boolean reset = true;
    boolean resetplayer;
    boolean win;


    public Gameboard() {

        board = new char[3][3];
        turn = 1;

    }

    public void filler() {
        for (char[] row : this.board)
            Arrays.fill(row, '0');
    }

    void printBoard() {

        System.out.println(board[0][0] + " " + board[1][0] + " " + board[2][0]);
        System.out.println(board[0][1] + " " + board[1][1] + " " + board[2][1]);
        System.out.println(board[0][2] + " " + board[1][2] + " " + board[2][2]);

    }

    public boolean checkField(int x, int y) {

        if (x < 0 || x > 2 || y < 0 || y > 2)
            return false;

        return board[x][y] == '0';
    }


    public boolean checkIfWon(Player p){
        char symbol = p.getSymbol();

        if (board[0][0] == symbol && board [1][0] == symbol && board [2][0] == symbol ||
                board [0][1]== symbol && board[1][1] == symbol && board[2][1] == symbol ||
                board [0][2]== symbol && board[1][2] == symbol && board[2][2] == symbol ||

                board [0][0]== symbol && board[0][1] == symbol && board[0][2] == symbol ||
                board [1][0]== symbol && board[1][1] == symbol && board[1][2] == symbol ||
                board [2][0]== symbol && board[2][1] == symbol && board[2][2] == symbol ||

                board [0][0]== symbol && board[1][1] == symbol && board[2][2] == symbol ||
                board [0][2]== symbol && board[1][1] == symbol && board[2][0] == symbol)
            return true;

        return false;


}


    void reset() {

        reset = false;
        for (char[] row : this.board)
            Arrays.fill(row, '0');
        resetplayer=false;
        turn=1;
        win = false;


    }


    void set(Player p, int x, int y) {

        this.board[x][y] = p.getSymbol();

    }


    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public int getSpalte() {
        return spalte;
    }

    public void setSpalte(int spalte) {
        this.spalte = spalte;
    }

    public int getZeile() {
        return zeile;
    }

    public void setZeile(int zeile) {
        this.zeile = zeile;
    }

    public boolean isReset() {
        return reset;
    }


    public void setReset(boolean reset) {
        if (reset) this.reset = true;

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

    public boolean isResetplayer() {
        return resetplayer;
    }

    public void setResetplayer(boolean resetplayer) {
        this.resetplayer = resetplayer;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }
}