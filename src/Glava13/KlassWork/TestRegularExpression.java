package Glava13.KlassWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
    public static void main(String[] args) {
        String[][] args2 = {{"abcabcabcdefabc"}, {"abc+"}, {"(abc)+"}};

        System.out.println("Input: \"" + args2[0] + "\"");
        for (String[] arg : args2) {
            for (String arg1 : arg) {
                System.out.println(
                        "Regular expression: \"" + arg + "\"");
                Pattern p = Pattern.compile(arg1);
                Matcher m = p.matcher(arg[0]);
                while (m.find()) {
                    System.out.println(
                            "Match \"" + m.group() + "\" at positions " +
                                    m.start() + "-" + (m.end() - 1));
                }
            }

        }
    }
}
