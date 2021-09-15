package Glava11.HomeTask.Task11;

import java.util.*;

public class MetodIterator {
    public static void main(String[] args) {
        Collection<String> col1 = new ArrayList<>();
        Collection<String> col2 = new HashSet<>();
        Collection<String> col3 = new TreeSet<>();
        Collection<String> col4 = new LinkedList<>();
        Collection<String> col5 = new LinkedHashSet<>();
        Collection<String> col6 = new PriorityQueue<>();
        Collection<String> col7 = new Stack<>();
        String str2;
        for (int i = 0; i < 20; i++) {
            str2 = i + " Nomber  mumber";
            col1.add(str2);
            col2.add(str2);
            col3.add(str2);
            col4.add(str2);
            col5.add(str2);
            col6.add(str2);
            col7.add(str2);
        }
        printCollection(col1.iterator());
        printCollection(col2.iterator());
        printCollection(col3.iterator());
        printCollection(col4.iterator());
        printCollection(col5.iterator());
        printCollection(col6.iterator());
        printCollection(col7.iterator());

    }


    public static void printCollection(Iterator<String> c) {
        while (c.hasNext()) {
            Object v = c.next();
            System.out.println(v.toString());
        }
    }


}
