package Glava11.Klasswork.Pet;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntCreator {

    private static void printList(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }

    public static ArrayList getRandomNumber(int i) {
        Random rand = new Random(47);
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            int x = rand.nextInt();
            list.add(x);
        }
          printList((ArrayList) list);
        return (ArrayList) list;
    }

}

