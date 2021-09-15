package Glava11.Klasswork;

import Glava11.Klasswork.Pet.Pet;
import Glava11.Klasswork.Pet.PetCreator;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class ClassContainerIteration {
     public static void display(Iterator<Pet> it){
         while (it.hasNext()){
             Pet p = it.next();
             System.out.println(p.id() + ":" + p + " ");
         }
         System.out.println();
     }

    public static void main(String[] args) {
        List<Pet> pets = new PetCreator().list(12);
        LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
        HashSet<Pet> petsHS = new HashSet<Pet>(pets);
        TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
