package Glava11.Klasswork;

import Glava11.Klasswork.Pet.Hamster;
import Glava11.Klasswork.Pet.Pet;
import Glava11.Klasswork.Pet.PetCreator;
import Glava11.Klasswork.Pet.Rat;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(new PetCreator().list(5));
        System.out.println(pets);
        //Идентично:
        System.out.println("pets.getFirst(): " + pets.getFirst());
        System.out.println("pets.element(): " + pets.element());
        // Отличается только поведением для пустого списка:
        System.out.println("pets.peek(): " + pets.peek());
        //Идентично; удаление и возвращение первого элемента:
        System.out.println("pets.remove(): " +  pets.remove());
        System.out.println("pets.removeFirst(): " + pets.removeFirst());
        // отличается только поведением  для пустого списка:
        System.out.println("pets.poll(): " + pets.poll());
        System.out.println(pets);
        pets.addFirst(new Rat());
        System.out.println("После addFirst(): " + pets);
        pets.offer(new PetCreator().get());
        System.out.println("После offer(): " + pets);
        pets.add(new PetCreator().get());
        System.out.println("После add(): " + pets);
        pets.addLast(new Hamster());
        System.out.println("After addLst(): " + pets);
        System.out.println("pets.removeLast(): " + pets.removeLast());
    }
}

