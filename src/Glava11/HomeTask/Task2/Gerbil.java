package Glava11.HomeTask.Task2;

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
        while (c.hasNext()){
            Gerbil p = c.next();
            System.out.println("Short message, number = " + p);
        }


    }
    public static void hop1(Iterator<Map<String, Gerbil>> v) {
        while (v.hasNext()){
            for (String str : v.next().keySet()) {
                System.out.print(" " + str);
                for (Gerbil ger : v.next().values()) {
                    System.out.println(" " + str);
                }

            }
        }
        System.out.println(" ");


    }
}
