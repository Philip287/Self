package Glava10.Exz16;

public class Checkers implements Game {
    private Checkers(){}
    private int move = 0;
    private static final int MOVE = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move " + move);
        return ++move != MOVE;
    }
    public static GameFactory factory = new GameFactory() {
        @Override
        public Game GetGame() {
            return new Checkers();
        }
    };
}
