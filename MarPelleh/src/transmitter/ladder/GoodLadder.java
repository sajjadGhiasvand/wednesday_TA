package transmitter.ladder;

import board.Cell;
import player.Player;
import transmitter.snake.Snake;

public class GoodLadder extends Ladder{
    static int goodLadder = 0;
    @Override
    public void transmit(Player player) {
        if (counterLadder < Snake.getCounterSnake()){
            player.setCurrentCell(new Cell(xEnd, yEnd));
            goodLadder++;
            counterLadder++;
            if (goodLadder <= 6){
                player.setScoreFromSnake_Ladder(player.getScoreFromSnake_Ladder() + 1);
            }
        }
    }
}
