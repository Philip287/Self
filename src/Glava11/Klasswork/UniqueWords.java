package Glava11.Klasswork;

import java.io.IOException;
import java.util.*;
import java.nio.file.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;
public class UniqueWords {
    public static void main(String[] args) throws IOException {
        Stream<String> stream = Files.lines(Paths.get("C:\\Users\\hp\\SetOperations.java"));
        List<String> lines = stream.collect(Collectors.toList());
        Set<String> words = new TreeSet<>();
        for (String line : lines)
            for (String word : line.split("\\W+"))
                if (word.trim().length() > 0)
                    words.add(word);
        System.out.println(words);

    }
}
