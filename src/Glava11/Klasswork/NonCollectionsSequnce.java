package Glava11.Klasswork;

import Glava11.Klasswork.Pet.Pet;

import java.util.Iterator;

public class NonCollectionsSequnce extends  PetSequence{
    public Iterator<Pet> iterator(){
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

            public void remove(){ // not implemented
                throw  new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args){
        NonCollectionsSequnce nc =new NonCollectionsSequnce();
        InterfaceVsIterator.display(nc.iterator());
    }
}
