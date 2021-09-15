package Glava11.HomeTask.Task1;

import Glava11.HomeTask.Task2.Gerbil;

import java.util.ArrayList;

import static Glava11.HomeTask.Task2.Gerbil.hop;

public class MainClassTask1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerb = new ArrayList<Gerbil>();
        for (int i = 0; i < 5; i++) {
            gerb.add(new Gerbil(i));
        }
        int i;
        hop(gerb.iterator());
       /* for (int j = 0; j < gerb.size(); j++) {
            hop(gerb.iterator());
        }*/
    }
}
