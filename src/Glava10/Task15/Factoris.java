package Glava10.Task15;

import java.util.Scanner;

public class Factoris {
    public static void gameConsumer(GameFactory fact) {
        Game g = fact.gameFactory();
        g.makeAMove();
    }

       public static void main(String[] args) {
        Menu();
    }

    private static void Menu() {
        Scanner c = new Scanner(System.in);
        System.out.println("Choose: 1 = Cube; 2 - Coin; 0 or other number > 2 to exit");
        int j = c.nextInt();
        do {
            if (j == 1) {
                Сube.factory.gameFactory().makeAMove();
                Menu();
            }
            if (j == 2) {
                Сoin.factory.gameFactory().makeAMove();
                Menu();
            }
        }
        while (j > 0 && j <= 2);
    }
}
