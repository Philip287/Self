package Glava11.HomeTask.Task24;

import java.util.*;

public class LinkedHashMapTask {
    public static void main(String[] args) {
        Map<String, String> map1 = new LinkedHashMap<>();
        Random random = new Random();
        String str1 = "First element of string ";
        String str2 = "Second element of string ";
        for (int i = 0; i < 10; i++) {
            map1.put(str1 + random.nextInt(100), str2 + random.nextInt(50));
        }
        for (String str : map1.keySet()) {
            System.out.println(str + " " + map1.get(str));
        }
        System.out.println(" Second part");

        Map sortedMap = new TreeMap<>(map1);
        sortedMap.entrySet().forEach(System.out::println);

        map1.clear();
        for (Object str3 : sortedMap.keySet()) {
            Object str4 = sortedMap.get(str3);
            map1.put((String) str3, (String) str4);
        }
        System.out.println("map1");
        for (String str : map1.keySet()) {
            System.out.println(str + " " + map1.get(str));
        }
    }
}
