package Glava11.HomeTask.Task25and26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task25 {
    public static Integer count = 0;
    public static String word;

    public static void main(String[] args) throws IOException {
        Map<String, ArrayList<Integer>> mapArr = new HashMap<>();
        Stream<String> stream = Files.lines(Paths.get("C:\\Users\\hp\\SetOperations.java"));
        List<String> lines = stream.collect(Collectors.toList());
        for (String line : lines) {
            for (String word:
                 line.split("\\W+")) {
                if (word.trim().length() > 0) {
                    boolean countB = mapArr.containsKey(word);
                    if (countB == false) {
                        ArrayList a = new ArrayList<Integer>();
                        count = (count + 1);
                        a.add(count);
                        mapArr.put(word, a);
                    } else {
                        ArrayList b = mapArr.get(word);
                        count = (count + 1);
                        b.add(count);
                        mapArr.put(word, b);
                    }

                }
            }
        }
        System.out.println();
        System.out.println(mapArr);

        for (String word : mapArr.keySet()) {
            ArrayList a = mapArr.get(word);
        }
    }
}
