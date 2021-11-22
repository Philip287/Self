package Glava11.Klasswork;

import Glava11.Klasswork.Pet.Pet;
import Glava11.Klasswork.Pet.PetCreator;

import java.util.*;

public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + " : " + p + " " + " 1 ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets) {
        for (Pet p : pets) {
            System.out.print(p.id() + " : " + p + " " + " 2" );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> petList = new PetCreator().list(8);
        Set<Pet> petSet = new HashSet<>(petList);
        Map<String, Pet> petMap = new LinkedHashMap<>();
        String[] names = ("Ralph, Eric, Robin, lacey, Britney, Sam, Spot, Fluffy ").split(", ");
        for (int i = 0; i < names.length; i++) {
            petMap.put(names[i], petList.get(i));
        }
        display(petList);
        display(petSet);
        display(petList.iterator());
        display(petSet.iterator ());
        System.out.println(petMap);
        System.out.println(petMap.keySet());
        System.out.println(petMap.values());
        System.out.println(petMap.values().iterator());

    }

}
