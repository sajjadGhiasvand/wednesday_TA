package transmitter.snake;

import board.Cell;
import player.Player;

public class BadSnake extends Snake{
    static int badSCore = 0;

    @Override
    public void transmit(Player player) {
        player.setCurrentCell(new Cell(xEnd, yEnd));
        badSCore++;
        counterSnake++;
        if (badSCore <= 7){
            player.setScoreFromSnake_Ladder(player.getScoreFromSnake_Ladder() - 1);
        }
    }
}
