import board.Board;
import player.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Board board = new Board(2);

        Player player1 = board.getPlayer(0);
        Player player2 = board.getPlayer(1);

        for (int i = 0; i < 20; i++) {
            board.movePlayer(0, scanner.nextInt(), scanner.nextInt());
            board.movePlayer(1, scanner.nextInt(), scanner.nextInt());
            System.out.println("player1 is in " + player1.getCurrentCell());
            System.out.println("player2 is in " + player2.getCurrentCell());
            System.out.println("Total score of player1 " + player1.getTotalScore());
            System.out.println("Total score of player2 " + player2.getTotalScore());
            System.out.println("ScoreFrom ladder and snake player1 " + player1.getScoreFromSnake_Ladder());
            System.out.println("ScoreFrom ladder and snake player2 " + player2.getScoreFromSnake_Ladder());
            System.out.println("player1 is better than player2 " + player1.compare(player2));
        }
    }
}
