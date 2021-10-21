package Glava11.Klasswork;

import Glava11.Klasswork.Pet.*;
import java.util.*;

public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        System.out.println(petMap);
        Pet Dog = petMap.get("My Dog");
        System.out.println(Dog);
        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue(Dog));
    }
}
