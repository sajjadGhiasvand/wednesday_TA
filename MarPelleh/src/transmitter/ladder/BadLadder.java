package transmitter.ladder;

import board.Cell;
import player.Player;
import transmitter.snake.Snake;

public class BadLadder extends Ladder{
    static int badLadder = 0;
    @Override
    public void transmit(Player player) {
        if (counterLadder < Snake.getCounterSnake()){
            player.setCurrentCell(new Cell(xEnd, yEnd));
            badLadder++;
            counterLadder++;
        }
    }
}
