package Glava11.HomeTask.Task17;

import Glava11.HomeTask.Task2.Gerbil;

import java.util.HashMap;

import static Glava11.HomeTask.Task2.Gerbil.hop;

public class mapTask17 {
    public static void main(String[] args) {
        HashMap<String, Gerbil> Getbil = new HashMap<>();
        String str = " Point ";
        for (int i = 0; i < 15; i++) {
            Getbil.put(str + i, (new Gerbil(i)));
        }
        for (String s: Getbil.keySet()) {
            System.out.println(s);
        };
        hop(Getbil.values().iterator());
    }
}
