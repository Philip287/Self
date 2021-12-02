package Glava11.HomeTask.Task32;

import Glava11.Klasswork.InterfaceVsIterator;
import Glava11.Klasswork.NonCollectionsSequnce;
import Glava11.Klasswork.Pet.Pet;
import Glava11.Klasswork.Pet.PetCreator;
import Glava11.Klasswork.PetSequence;

import java.util.*;

public class NonCollectionsSequnceModern extends PetSequence implements Iterable<Pet> {
     public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            public void remove() { // not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current = pets.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > 1;
                    }

                    @Override
                    public Pet next() {
                        return pets[current--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionsSequnceModern nc = new NonCollectionsSequnceModern();
        InterfaceVsIterator.display(nc.iterator());
        for (Pet p : nc.randomized())
            System.out.print(p + " ");
        System.out.println();
        for (Pet p : nc.reversed())
            System.out.print(p + " ");
    }
}
