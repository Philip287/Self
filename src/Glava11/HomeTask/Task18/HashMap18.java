package Glava11.HomeTask.Task18;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class HashMap18 {

    public static String str1 = "Point number: ";

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            map1.put(str1 + i, rand.nextInt(20));
        }
        System.out.println(map1);

        for (String str2 : map1.keySet()) {
            System.out.println(str2);
            System.out.println(map1.get(str2));
        }
        Map<String, Integer> mapLinked = new LinkedHashMap();
        map1.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
                .forEach(System.out::println);

        for (String i : map1.keySet()) {
            Integer h = map1.get(i);
            mapLinked.put(i,h);
        }
        mapLinked.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
                .forEach(System.out::println);
    }
}
