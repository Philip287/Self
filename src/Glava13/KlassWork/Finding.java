package Glava13.KlassWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {
    public static void main(String[] args) {
        CharSequence input;
        Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wing");
        while (m.find())
            System.out.println(m.group() + " ");
        System.out.println();
        int i = 0;
        while (m.find(i)) {
            System.out.println(m.group() + " ");
            i++;
        }
    }
}
