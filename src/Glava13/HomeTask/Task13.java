package Glava13.HomeTask;

import Glava13.KlassWork.Groups;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Glava13.KlassWork.StartEnd.input;

public class Task13 {
    private static class Display {
        private boolean regexPrinted = false;
        private String regex;
        Display(String regex) {
            this.regex = regex;
        }

        void display(String message) {
            if (!regexPrinted) {
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }
    }

    static void examine(String s, String regex) {
        Task13.Display d = new Task13.Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find())
            d.display("find() '" + m.group() +
                    "' start = " + m.start() + " end = " + m.end());
        if (m.lookingAt()) // No reset() necessary
            d.display("lookingAt() start = "
                    + m.start() + " end = " + m.end());
        if (m.matches()) // No reset() necessary
            d.display("matches() start = "
                    + m.start() + " end = " + m.end());
    }

    public static void main(String[] args) {
        for (String in : input.split("\n")) {
            System.out.println("input : " + in);
            for (String regex : new String[]{"[^A-Z](?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$"})
                examine(Groups.POEM, regex);
        }
    }
}