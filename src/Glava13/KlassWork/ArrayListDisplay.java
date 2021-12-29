package Glava13.KlassWork;

import Glava15.Coffe.Coffee;
import Glava15.Coffe.CoffeeSupplier;

import java.util.ArrayList;

public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<>();
        for (Coffee c : new CoffeeSupplier(10)) {
            coffees.add(c);
        }
        System.out.println(coffees);
    }
}
