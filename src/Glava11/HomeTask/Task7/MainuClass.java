package Glava11.HomeTask.Task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainuClass {
    public static void main(String[] args) {
        List<ClassTask7> lst = new LinkedList<>(Arrays.asList(creator(10, "Pitor")));
        System.out.println(lst.toString());
        List sub = lst.subList(0,5);
        System.out.println(sub.toString());
        sub.add(new ClassTask7("vasmz", 11, 47));
        System.out.println(sub.toString());
        List<ClassTask7> copy = new ArrayList<>(sub);
        lst.removeAll(copy);
        System.out.println(lst.toString());

    }

    public static ClassTask7[] creator(int i, String d){
        ClassTask7[] mass = new ClassTask7[i];
        for (int j = 0; j < i; j++) {
            ClassTask7 classe = new ClassTask7("Name" + d,i+j,i+j);
            mass[j] = classe;
        }
        return mass;
    }
}
