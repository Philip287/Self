package Glava11.HomeTask.Task22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class Task22 {
    public static void main(String[] args) throws IOException {
        List<String> list1 = Files.readAllLines(
                Paths.get("C:\\Users\\hp\\SetOperations.java"));
        Set<String> words =
                new TreeSet<>(CASE_INSENSITIVE_ORDER);
        int counter = 0;
        Set<KlassSave> wordMap = new HashSet<>();
        for (String line : list1) {
            for (String word : line.split("\\W+")) {
                Boolean count = wordMap.contains(word);
                int count1 = 0;
                if (count == false) {
                    wordMap.add(new KlassSave(word.toString(), 1));
                } else {
                    wordMap.remove(word);
                    wordMap.add(new KlassSave(word.toString(), count1+1));
                }
            }
        }
        System.out.println(wordMap);

    }
}
