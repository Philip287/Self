package Glava10.Task15;

import java.util.Random;

public class Сoin implements Game {

    @Override
    public void makeAMove() {
        int number = getRandomNumber();
        if (number == 0) {
            System.out.println("eagle");
        } else if (number == 1) {
            System.out.println("tails");
        } else {
            System.out.println("rib");
        }
    }

    int getRandomNumber() {
        Random random = new Random();
        int i = random.nextInt(2) + 0;
        return i;
    }
    public static GameFactory factory =
            new GameFactory(){
        public Game gameFactory(){
            return new Сoin();
        }
    };
}
