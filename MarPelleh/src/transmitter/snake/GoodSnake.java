package transmitter.snake;

import board.Cell;
import player.Player;

public class GoodSnake extends Snake{
    static int goodScore = 0;


    @Override
    public void transmit(Player player) {
        if (BadSnake.badSCore > goodScore){
            player.setCurrentCell(new Cell(xEnd, yEnd));
            goodScore++;
            counterSnake++;
        }
    }
}
