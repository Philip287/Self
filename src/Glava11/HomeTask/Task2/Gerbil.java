package Glava11.HomeTask.Task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Gerbil {
    private final int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    @Override
    public String toString() {
        return "gerbilNumber = " + gerbilNumber;
    }

    public static void hop(Iterator<Gerbil> c) {
        while (c.hasNext()) {
            Gerbil p = c.next();
            System.out.println("Short message, number = " + p);
        }
    }
}
