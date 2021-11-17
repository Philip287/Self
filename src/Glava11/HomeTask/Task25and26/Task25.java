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
            for (String word :
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

        List<String> lines1 = new ArrayList<>();
        for (int h = 0; h < 200; h++)
            lines1.add(null);
        for (String word : mapArr.keySet()) {
            ArrayList a = mapArr.get(word);
            for (int i = 0; i < a.size(); i++) {
                int d = (Integer) a.get(i);
                lines1.set(d - 1, word);
            }
        }
        Map<Integer, String> mapFinish = new TreeMap<>();
        for (String str1 : mapArr.keySet()) {
            ArrayList r = mapArr.get(str1);
            for (int i = 0; i < r.size(); i++) {
                int poz = (Integer) r.get(i);
                mapFinish.put(poz, str1);

            }
        }

        System.out.println(lines);
        System.out.println(lines1);
        for (String fin : mapFinish.values()){
            System.out.print(fin + " nb ");
        }
    }
}
