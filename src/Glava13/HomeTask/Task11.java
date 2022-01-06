package Glava13.HomeTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
    public static void move() {
        Pattern p = Pattern.compile("(?i)((^[aeiou]) | (\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher m = p.matcher("Airline ate eight apples and one orange while Anita had not any");
        System.out.println(m.matches());
        while (m.find()) {
            System.out.println("Match: " + m.group() + " at positions: " + m.start() + " - " + (m.end() - 1));
        }
    }

    public static void main(String[] args) {
        Task11.move();
    }
}
