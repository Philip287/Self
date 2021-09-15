package Glava11.HomeTask.Task12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTask {
    public static void main(String[] args) {
        List<Integer> int1 = new ArrayList<>(listCreator(15));
        List<Integer> int2 = new ArrayList<>(listCreator2(15));
        ListIterator<Integer> it = int1.listIterator();
        while (it.hasNext()){
            System.out.print(it.next() +
                    " - " + it.nextIndex()+ "; ");
        }
        System.out.println();

        ListIterator<Integer> it2 = int2.listIterator();
        it = int1.listIterator(10);
        while (it.hasPrevious()){
            it.previous();
            it.set(it2.next());
        }
        System.out.println(int1);
    }

    public static List listCreator(Integer v) {
        List<Integer> int3 = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            int3.add(i);
        }
        return int3;
    }
    public static List listCreator2(Integer v) {
        List<Integer> int3 = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            int3.add(i+11);
        }
        return int3;
    }


}
