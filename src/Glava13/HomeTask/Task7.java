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
        String regex2 = ("\\b[a-z]\\w+!+");
        Pattern pattern = Pattern.compile(regex);
        Pattern pattern2 = Pattern.compile(regex2);
        for (String f : lst) {
            Matcher matcher = pattern.matcher(f);
            System.out.println(f);
            while (matcher.find())
                System.out.println("Found match " + matcher.group() +  "at: " + matcher.start() + " to " + (matcher.end()-1));
            Matcher matcher2 = pattern2.matcher(f);
            System.out.println();
            while (matcher2.find())
                System.out.println("Found match2 " + matcher2.group() +  "at: " + matcher2.start() + " to " + (matcher2.end() -1));
        }
    }
}