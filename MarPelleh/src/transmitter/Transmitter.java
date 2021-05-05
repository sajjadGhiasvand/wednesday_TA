package transmitter;

import board.Cell;
import player.Player;

abstract public class Transmitter {
    protected int xFirst;
    protected int yFirst;
    protected int xEnd;
    protected int yEnd;

    public void set(int xFirst, int yFirst, int xEnd, int yEnd){
        this.xFirst = xFirst;
        this.yFirst = yFirst;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
    }

    public int getxFirst() {
        return xFirst;
    }

    public void setxFirst(int xFirst) {
        this.xFirst = xFirst;
    }

    public int getyFirst() {
        return yFirst;
    }

    public void setyFirst(int yFirst) {
        this.yFirst = yFirst;
    }

    public int getxEnd() {
        return xEnd;
    }

    public void setxEnd(int xEnd) {
        this.xEnd = xEnd;
    }

    public int getyEnd() {
        return yEnd;
    }

    public void setyEnd(int yEnd) {
        this.yEnd = yEnd;
    }

    public Cell getFirstCell(){
        return new Cell(xFirst, yFirst);
    }

    public abstract void transmit(Player player);
}
