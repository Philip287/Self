package Glava11.HomeTask.Task21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class Task21 {
    public static void main(String[] args) throws IOException {
        List<String> list1 = Files.readAllLines(
                Paths.get("C:\\Users\\hp\\SetOperations.java"));
        Set<String> words =
                new TreeSet<>(CASE_INSENSITIVE_ORDER);
        int counter = 0;
        Map<String, Integer> wordMap = new HashMap<>();
        for (String line : list1) {
            for (String word : line.split("\\W+")) {
                Integer count = wordMap.get(word);
                if (count == null) {
                    wordMap.put(word, 1);
                } else {
                    wordMap.put(word, count + 1);
                }
            }
        }
        System.out.println(wordMap);
        //System.out.println(Collections.sort(wordMap, String.CASE_INSENSITIVE_ORDER));
        Map<String, Integer> sortedMap = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
        sortedMap.putAll(wordMap);
        System.out.println(sortedMap);
    }

}

