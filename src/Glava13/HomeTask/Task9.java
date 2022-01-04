package Glava13.HomeTask;

import Glava13.KlassWork.Splitting;

import java.util.LinkedList;
import java.util.List;

public class Task9 {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        List<String> lst = new LinkedList<>();
        String d = s.replaceAll("[eyuoaiEYUIOA]", "\\_");
        System.out.println(d);
    }

}
