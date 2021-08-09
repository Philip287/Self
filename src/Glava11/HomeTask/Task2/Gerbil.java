package Glava11.HomeTask.Task2;

public class Gerbil {
    private final int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public static int hop(Gerbil c){
        System.out.println("Short message, number = " + c.gerbilNumber);
        return c.gerbilNumber;
    }

}
