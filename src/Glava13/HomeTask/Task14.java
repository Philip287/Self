package Glava13.HomeTask;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task14 {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        //only do the first three:
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input,3)));

        String s =  "This!!unusual use!!of exclamation!!points";
        String[] rez = s.split("!!", 3);
        for (int i = 0; i < rez.length; i++) {
            System.out.println(rez[i]);
        }
        String[] rez2 = s.split("!!");
        for (int i = 0; i < rez.length; i++) {
            System.out.println(rez[i]);
        }
    }
}
