package at.ac.fhcampuswien.tictactoe;

import java.util.Scanner;

public class GameLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        Gameboard game = new Gameboard();

        while (game.isReset()) {

            game.reset();

            System.out.println("Spieler 1: Bitte wählen Sie Ihr Symbol, um das Spiel zu starten");

            while (!game.isResetplayer()) {
                player1.setSymbol(scan.next().charAt(0));
                switch (player1.getSymbol()) {
                    case 'O':
                        player2.setSymbol('X');// setzt die Symbole für beide Spieler
                        game.setResetplayer(true);
                        break;
                    case 'X':
                        player2.setSymbol('O');
                        game.setResetplayer(true);
                        break;
                    default:
                        System.out.println("Ungültiges Symbol!");
                        break;
                }
            }


            while (!game.isWin() && game.getTurn() < 10) {

                int spalte;
                int zeile;
                boolean check;


                do {
                    System.out.println("Bitte ein leeres / gültiges Feld wählen:");
                    spalte = scan.nextInt();
                    zeile = scan.nextInt();
                    check = game.checkField(spalte - 1, zeile - 1);
                }
                while (!check);

                game.setSpalte(spalte);
                game.setZeile(zeile);


                switch (game.getTurn() % 2) {
                    case 1:
                        game.set(player1, game.getSpalte() - 1, game.getZeile() - 1);
                        game.setWin(game.checkIfWon(player1));
                        if (game.isWin())
                            player1.setVictories(player1.getVictories() + 1);
                        break;
                    case 0:
                        game.set(player2, game.getSpalte() - 1, game.getZeile() - 1);
                        game.setWin(game.checkIfWon(player2));
                        if (game.isWin())
                            player2.setVictories(player2.getVictories() + 1);
                        break;

                }


                game.setTurn(game.getTurn() + 1);
                game.printBoard();

            }

            System.out.println("Spiel ist zu Ende.");
            System.out.println("Statistik: \nSpieler 1 - " + player1.getVictories() + " Siege");
            System.out.println("Spieler 2 - " + player2.getVictories() + " Siege");
            System.out.println("Wollen Sie neu beginnen? ja/nein");

            boolean exit = false;

            while (!exit) {
                String ende = scan.next();
                switch (ende) {
                    case "ja":
                        game.setReset(true);
                        exit=true;
                        break;
                    case "nein":
                        game.setReset(false);
                        exit=true;
                        break;
                    default:
                        System.out.println("Ungültige Eingabe");
                        exit=false;
                        break;
                }
            }


        }

        System.out.println("Spiel zu Ende. Program wird beendet");
    }

}