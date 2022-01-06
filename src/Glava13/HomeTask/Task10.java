package Glava13.HomeTask;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {

    public static void move(String str) {
        Pattern p = Pattern.compile(str);
        System.out.println(str);
        Matcher m = p.matcher("Java now regular expressions");
        while (m.find()){
            System.out.println("Match: " + m.group() + " at positions: " + m.start() + " - " + (m.end() - 1));
        }
    }

    public static void main(String[] args) {
        String[] str2 = {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}", "s{0,3}"};
        List<String> lst = new LinkedList<>();
        for (String s : str2) {
            System.out.println(s);
            lst.add(s);
            System.out.println(lst);
        }

        for (String str : lst) {
            Task10.move(str);
        }

        Pattern p = Pattern.compile("^Java");
        Matcher m = p.matcher("Java now regular expressions");
        System.out.println(m.matches());
        while (m.find()){
            System.out.println("Match: " + m.group() + " at positions: " + m.start() + " - " + (m.end() - 1));
        }

    }
}
