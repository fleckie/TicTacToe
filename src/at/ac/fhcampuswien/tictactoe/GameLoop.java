package at.ac.fhcampuswien.tictactoe;

import java.util.Scanner;

public class GameLoop {

    public static void main(String[] args) {

        Gameboard game = new Gameboard();

        System.out.println("Bitte geben Sie X oder O ein, um das Spiel zu starten");
        Scanner scan = new Scanner(System.in);

        char player = scan.next().charAt(0);
        int spalte = scan.nextInt();
        int reihe = scan.nextInt();

        game.set(player, spalte, reihe);
        System.out.println(game.getBoard()[0][0]);










    }
}
