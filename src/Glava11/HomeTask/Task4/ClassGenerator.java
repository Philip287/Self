package Glava11.HomeTask.Task4;

import java.util.*;

public class ClassGenerator {
    /*static Collection created(Collection<String> collection){
        collection.add("Terminator");
        collection.add("Ant-Man");
        collection.add("Iron-Man");
        collection.add("SuperMan");
        collection.add("Man in black");
        return collection;
    }*/

    private static Collection next(Collection c) {
        String[] str1 = new String[]{"Terminator","Ant-Man","Iron-Man","SuperMan","Man in black"};
        for (int i = 0; i < str1.length; i++) {
            c.addAll(Arrays.asList(str1[i]));
        }
        return c;

    }

    public static void main(String[] args) {
        System.out.println(next(new ArrayList<String>()));
        System.out.println(next(new LinkedList<String>()));
        System.out.println(next(new HashSet<String>()));
        System.out.println(next(new TreeSet<String>()));
        System.out.println(next(new LinkedHashSet<String>()));
    }
}
