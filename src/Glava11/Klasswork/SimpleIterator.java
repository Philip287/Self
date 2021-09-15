package Glava11.Klasswork;

import Glava11.Klasswork.Pet.Pet;
import Glava11.Klasswork.Pet.PetCreator;

import java.util.Iterator;
import java.util.List;

public class SimpleIterator {
    public static void main(String[] args) {
        List<Pet> pets = new PetCreator().list(12);
        Iterator<Pet> it = pets.iterator();
        while(it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id() + ": " + p + " ");
        }
        System.out.println();
        //более простой синтаксис (там где возможно):
        for(Pet p : pets)
            System.out.print(p.id() + ". " + p + " ");
        System.out.println();
        //тератор также позволяет удалять элементы:
        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
