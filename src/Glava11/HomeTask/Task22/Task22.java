package Glava11.HomeTask.Task22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Task22 {
    public static void main(String[] args) throws IOException {
        List<String> list1 = Files.readAllLines(Paths.get("C:\\Users\\hp\\SetOperations.java"));
        Set<KlassSave> words = new HashSet<>();
        for (String line : list1) {
            for (String word : line.split("\\W+")) {
                    boolean count = words.add(new KlassSave(word, 1));
                    if (count == false) {
                        int counter = getInt(words.iterator(), word);
                        if(words.remove(new KlassSave(word, counter))==true){
                            System.out.println(word + " " + counter + " Exelent");
                        } else {
                            System.out.println(word  + counter + " not exellent");
                        };
                        words.add(new KlassSave(word, counter + 1));
                    } else {
                        System.out.println("iteration " + "-"   );
                    }
            }
        }
        System.out.println(words);

    }


    public static int getInt(Iterator<KlassSave> c, String words) {
        int i;
        while (c.hasNext()) {
            KlassSave p = c.next();
            if (p.getStr1().equals(words)) {
                i = p.getCount();
                System.out.println( p.getStr1()+ " i " +i);
                return i;
            }
        }
        return 0;
    }
}
