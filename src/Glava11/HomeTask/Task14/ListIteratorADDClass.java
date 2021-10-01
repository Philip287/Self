package Glava11.HomeTask.Task14;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorADDClass {
    public static void main(String[] args) {
        LinkedList<Integer> linkListInt = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            linkListInt.add(i+100);
        }
        System.out.println(linkListInt.toString());
        ListIterator<Integer> integerListIterator = linkListInt.listIterator(5);

        while (integerListIterator.hasNext()){
            integerListIterator.next();
            integerListIterator.set(45);

        }
        System.out.println(linkListInt.toString());
    }
}
