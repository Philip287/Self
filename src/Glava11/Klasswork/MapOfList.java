package Glava11.Klasswork;

import Glava11.Klasswork.Pet.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople =
            new HashMap<>();

    static {
        petPeople.put(new Person("Dawn"),
                Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"),
                Arrays.asList(new Cat("Shackleton"), new Cat("Elsie May"), new Dog("Margaret")));
        petPeople.put(new Person("Marilyn"),
                Arrays.asList(
                        new Pug("Louie aka Louis Snorkelstein Dupree"),
                        new Cat("Stanford aka Stinky el Negro"),
                        new Dog("Pinkola")));
        petPeople.put(new Person("Luke"),
                Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
        petPeople.put(new Person("Isaac"),
                Arrays.asList(new Rat("Freckly")));
    }

    public static void main(String[] args) {
        System.out.println("People: " + petPeople.keySet());
        System.out.println("Pets: " + petPeople.values());
        System.out.println();
        for (Person person : petPeople.keySet()) {
            System.out.println(person + " has: ");
            for (Pet pet : petPeople.get(person)) {
                System.out.println("  " + pet);
            }
        }
    }
}