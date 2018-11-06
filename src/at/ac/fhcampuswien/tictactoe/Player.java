package at.ac.fhcampuswien.tictactoe;

public class Player {

    private char symbol = '0';
    private int victories = 0;

    public char getSymbol() {
        return symbol;
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}





