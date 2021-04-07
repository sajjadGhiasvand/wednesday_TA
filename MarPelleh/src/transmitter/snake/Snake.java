package transmitter.snake;

import transmitter.Transmitter;

abstract public class Snake extends Transmitter {
    protected static int counterSnake = 0;

    public static int getCounterSnake() {
        return counterSnake;
    }
}
