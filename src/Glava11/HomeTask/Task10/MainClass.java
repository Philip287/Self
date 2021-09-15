package Glava11.HomeTask.Task10;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {
    public static void main(String[] args) {
        ArrayList r = arrayListRodents(14);
        print(r.iterator());
    }
    private static ArrayList arrayListRodents (int i){
        ArrayList<Rodent> rodList = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            Rodent m = new Mouse(j,"Rodent", "rrr", j,"Mouse", "pi-pi");
            Rodent h = new Hamster(j,"Rodent", "rrr", j,"Hamster", "hfgh");
            Rodent s = new Squirrel(j,"Rodent", "rrr", j,"Squirrel", "x");
            Rodent r = new Rat(j,"Rodent", "rrr", j,"Rat", "gf");
            rodList.add(m);
            rodList.add(h);
            rodList.add(s);
            rodList.add(r);
        }
        return rodList;
    }
    public static void print(Iterator<Rodent> rod){
        while (rod.hasNext()){
            Rodent r = rod.next();
            System.out.println(r);
        }

    }
}
