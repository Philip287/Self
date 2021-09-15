package Glava11.HomeTask.Task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public interface Selector {
    boolean end();

    Object current();

    void next();
}

class Sequence {
    private Object[] items;
    private int next = 0;

    @Override
    public String toString() {
        return "Sequence{" +
                "items=" + Arrays.toString(items) +
                ", next=" + next +
                '}';
    }

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void print(Iterator<Sequence> seq){
        while (seq.hasNext()){
            Sequence s = seq.next();
            System.out.println(s.toString());
        }
    }
    public static void main(String[] args) {
        ArrayList<Sequence> sequence = new ArrayList<Sequence>();
        Sequence sequence1 = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence1.add(Integer.toString(i));
        sequence.add(sequence1);
       /* Selector selector = sequence.selector();
        while (sequence.hasNext) {
            System.out.print(selector.current() + " ");
            selector.next();
        }*/
        print(sequence.iterator());
    }
}

