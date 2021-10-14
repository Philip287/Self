package Glava11.HomeTask.Task16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetHomeTask {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(
                Paths.get("C:\\Users\\hp\\SetOperations.java"));
        Set<String> words =
                new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        int counter = 0;
        for (String line : lines) {
            for (String word : line.split("\\W+")) {
                int count1 = 0;
                for (String word1 : word.split("")) {

                    if (word1.trim().length() > 0) {
                        switch (word1) {
                            case "a":
                            case "e":
                            case "i":
                            case "o":
                            case "u":
                            case "y":
                            case "A":
                            case "E":
                            case "I":
                            case "O":
                            case "U":
                            case "Y":
                                count1 += 1;
                                counter += 1;

                        }
                    }
                }
                System.out.println(word + " - count: " + count1);
                words.add(word);
            }
        }
        System.out.println(words + " \n counter: " + counter);
    }
}
