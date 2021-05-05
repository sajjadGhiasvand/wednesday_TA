package board;

import player.Player;
import transmitter.Transmitter;
import transmitter.ladder.BadLadder;
import transmitter.ladder.GoodLadder;
import transmitter.snake.BadSnake;
import transmitter.snake.GoodSnake;

import java.util.ArrayList;

public class Board {
    private Cell[][] cells;
    private ArrayList<Transmitter> transmitters;
    private ArrayList<Player> players;

    public Board(int numberOfPlayers){
        initCells();
        initTransmitters();
//        update();
        initPlayer(numberOfPlayers);
    }

    private void initCells(){
        cells = new Cell[10][10];
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }


    private void initTransmitters() {
        transmitters = new ArrayList<>();
        //YOUR CODE HERE
        Transmitter badLadder1 = new BadLadder();
        Transmitter badLadder2 = new BadLadder();
        Transmitter badLadder3 = new BadLadder();
        badLadder1.set(0 , 3 , 5 , 6);
        badLadder2.set(3 , 4 , 7 , 8);
        badLadder3.set(5 , 8 , 9 , 4);
        transmitters.add(badLadder1);
        transmitters.add(badLadder2);
        transmitters.add(badLadder3);
        cells[0][3].setTransmitter(badLadder1);
        cells[3][4].setTransmitter(badLadder2);
        cells[5][8].setTransmitter(badLadder3);

        Transmitter goodLadder1 = new GoodLadder();
        Transmitter goodLadder2 = new GoodLadder();
        goodLadder1.set(0 , 9 , 6 , 9);
        goodLadder2.set(4 , 6 , 8 , 5);
        transmitters.add(goodLadder1);
        transmitters.add(goodLadder2);
        cells[0][9].setTransmitter(goodLadder1);
        cells[4][6].setTransmitter(goodLadder2);

        Transmitter badSnake1 = new BadSnake();
        Transmitter badSnake2 = new BadSnake();
        badSnake1.set(7 , 3 , 0 , 4);
        badSnake2.set(8 , 8 , 5 , 5);
        transmitters.add(badSnake1);
        transmitters.add(badSnake2);
        cells[7][3].setTransmitter(badSnake1);
        cells[8][8].setTransmitter(badSnake2);

        Transmitter goodSanke1 = new GoodSnake();
        Transmitter goodSanke2 = new GoodSnake();
        Transmitter goodSanke3 = new GoodSnake();
        goodSanke1.set(9 , 3 , 1 , 1);
        goodSanke2.set(4 , 4 , 2 , 9);
        goodSanke3.set(8 , 6 , 5 , 7);
        transmitters.add(goodSanke1);
        transmitters.add(goodSanke2);
        transmitters.add(goodSanke3);
        cells[9][3].setTransmitter(goodSanke1);
        cells[4][4].setTransmitter(goodSanke2);
        cells[8][6].setTransmitter(goodSanke3);
    }

    private void update(){
        for (Transmitter transmitter : transmitters) {
            transmitter.getFirstCell().setTransmitter(transmitter);
        }
    }

    private void initPlayer(int numberOfPlayers){
        players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player(getCell(0, 0)));
        }
    }

    public void movePlayer(int indexOfPlayer, int newX, int newY){
        Player player = players.get(indexOfPlayer);
        Cell cell = getCell(newX, newY);
        player.setCurrentCell(cell);
        checkIfMustTransmit(player);
    }

    private void checkIfMustTransmit(Player player){
        Transmitter transmitter = player.getCurrentCell().getTransmitter();
        if (transmitter != null){
            transmitter.transmit(player);
        }
    }



    public Cell getCell(int x, int y){
        return cells[x][y];
    }

    public Player getPlayer(int indexOfPlayer){
        return players.get(indexOfPlayer);
    }
}
