package Glava13.HomeTask;

import Glava13.KlassWork.Splitting;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        List<String> lst = new LinkedList<>();
        for (String str1 : s.split(" ")) {
            lst.add(str1);
        }
        String regex = "\\b([A-Z]\\w+.)";
        Pattern pattern = Pattern.compile(regex);
        for (String f : lst) {
            Matcher matcher = pattern.matcher(f);
            System.out.println(f);
            System.out.println(matcher.matches());
            System.out.println(f.matches("\\b([A-Z]\\w+.)"));
            while (matcher.find())
                System.out.println("Found match at: " + matcher.start() + " to " + matcher.end());
            System.out.println(f.matches("\\b[a-z]\\w+!+"));
            System.out.println();
        }
        Matcher matcher2 = pattern.matcher(s);
        System.out.println(matcher2.matches());

    }
}