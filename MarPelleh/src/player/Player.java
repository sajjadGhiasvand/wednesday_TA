package player;

import board.Cell;

public class Player{
    private int scoreFromSnake_Ladder = 0;
    private Cell currentCell;

    public Player(Cell currentCell) {
        this.currentCell = currentCell;
    }

    public int getScoreFromSnake_Ladder() {
        return scoreFromSnake_Ladder;
    }

    public void setScoreFromSnake_Ladder(int scoreFromSnake_Ladder) {
        this.scoreFromSnake_Ladder = scoreFromSnake_Ladder;
    }

    public Cell getCurrentCell() {
        return currentCell;
    }

    public void setCurrentCell(Cell currentCell) {
        this.currentCell = currentCell;
    }

    public int getTotalScore(){
        return scoreFromSnake_Ladder + currentCell.getX() + currentCell.getY();
    }

    public int compare(Player player){
        if (this.getTotalScore() > player.getTotalScore())
            return 1;
        else return 0;
    }
}
