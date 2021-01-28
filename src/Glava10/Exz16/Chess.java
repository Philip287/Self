package Glava10.Exz16;

public class Chess implements Game {
    private int move = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("ches move " + move);
        return ++move != MOVES;
    }
    public static GameFactory factory = new GameFactory() {
        @Override
        public Game GetGame() {
            return new Chess();
        }
    };
}
