package Glava11.Klasswork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ReversibleArrayList<T> extends ArrayList<T> {

    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }

                    @Override
                    public void remove() {//not realise
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}


class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("To be o not to be".split(" ")));
        //получение обычного итератора при помощи iterator()
        for (String s : ral)
            System.out.print(s + " ");
        System.out.println();
        //Передача реализация Iterable по нашему выбору
        for (String s : ral.reversed())
            System.out.print(s +" ");
    }
}