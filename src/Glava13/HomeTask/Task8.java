package Glava13.HomeTask;

import Glava13.KlassWork.Splitting;

import java.util.LinkedList;
import java.util.List;

public class Task8 {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        List<String> lst = new LinkedList<>();
        for (String str1 : s.split("the | you")) {
            lst.add(str1);
            System.out.println(str1);
        }
    }
}
