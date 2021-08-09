package Glava11.Klasswork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<Integer>();
        for(int i = 0;i<10;i++){
                c.add(i); //автоматическая упаковка
            }
        for(Integer i:c){
                System.out.println("i = " + (i + 1));
            }
        }

}
