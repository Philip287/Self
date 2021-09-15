package Glava11.Klasswork;

import Glava11.Klasswork.Pet.*;

import java.util.*;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
      //  IntCreator intCre = new IntCreator();
        List<String> strin = new ArrayList<String> (Arrays.asList(StringCreator.stringCreator()));
        System.out.println("1: " + strin);
        String h = "11";
        strin.add(h); // Automatically resizes
        System.out.println("2: " + strin);
        System.out.println("3: " + strin.contains(h));
        strin.remove(h); // Remove by object
        String p = strin.get(0);
        System.out.println(
                "4: " + p + " " + strin.indexOf(p));
        Integer cymric = 15;
        System.out.println("5: " + strin.indexOf(cymric));
        System.out.println("6: " + strin.remove(cymric));
        // Must be the exact object:
        System.out.println("7: " + strin.remove(p));
        System.out.println("8: " + strin);
        strin.add(0, "15"); // Insert at an index
        System.out.println("9: " + strin);
        List<String> sub = strin.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + strin.containsAll(sub));
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
        // Order is not important in containsAll():
        System.out.println("11: " + strin.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + strin.containsAll(sub));
        List<String> copy = new ArrayList<String>(strin);
        sub = Arrays.asList(strin.get(1), strin.get(1));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<String>(strin); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        copy.set(1, "11"); // Replace an element
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);
        System.out.println("18: " + strin.isEmpty());
        strin.clear(); // Remove all elements
        System.out.println("19: " + strin);
        System.out.println("20: " + strin.isEmpty());
        strin.addAll((Arrays.asList(StringCreator.stringCreator())));
        System.out.println("21: " + strin);
        Object[] o = strin.toArray();
        System.out.println("22: " + o[1]);
        Object[] pa = strin.toArray();
        System.out.println("23: " + pa[0]);
    }
}
