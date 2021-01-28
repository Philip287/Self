package Glava10.Exz16;

public class PlayGame {
    public static void playGame(GameFactory factory){
        Game s = factory.GetGame();
        while (s.move());
    }

    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}
