package Glava10.Task15;

import java.util.Random;

public class Сube implements Game {
    int number;

    @Override
    public void makeAMove() {
        int number = getRandomNumber();
        if (number == 1) {
            System.out.println("1");
        } else if (number == 2) {
            System.out.println("2");
        } else if (number == 3) {
            System.out.println("3");
        } else if (number == 4) {
            System.out.println("4");
        } else if (number == 5) {
            System.out.println("5");
        } else {
            System.out.println("6");
        }
    }

    int getRandomNumber() {
        Random random = new Random();
        int i = random.nextInt(6) + 1;
        return i;
    }

    public static GameFactory factory =
            new GameFactory() {
                public Game gameFactory() {
                    return new Сube();
                }
            };

}