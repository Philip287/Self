package Glava11.Klasswork;

import java.util.*;

public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("Крыса");
        collection.add("Кошка");
        collection.add("Собака");
        collection.add("Собака");
        return collection;
    }
    static Map fill(Map<String, String> map){
        map.put("Крыса", "Анфиса");
        map.put("Кошка", "Мурка");
        map.put("Собака", "Шарик");
        map.put("Собака", "Бобик");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String,String>()));
        System.out.println(fill(new TreeMap<String,String>()));
        System.out.println(fill(new LinkedHashMap<String,String>()));
    }
}
