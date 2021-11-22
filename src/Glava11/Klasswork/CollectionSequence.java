package Glava11.Klasswork;

import Glava11.Klasswork.Pet.Pet;
import Glava11.Klasswork.Pet.PetCreator;

import java.util.Iterator;

public class CollectionSequence {
    Pet[] pets = new PetCreator().array(40);

    public int size() {
        return pets.length;
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() { // not realised
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c.iterator());

    }
}
