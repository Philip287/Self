package Glava10.Exz3;

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    public class SomeString {
        private String s;

        public SomeString(String s) {
            this.s = s;
        }

        @Override
        public String toString() {
            return "SomeString s = " + s;
        }


    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length)
                i++;
        }

        public Sequence other() {
            return Sequence.this;
        }

    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public SomeString someString(String d) {
        return new SomeString(d);
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 5; i++) {
            sequence.add((sequence.someString("number " + i)).toString());
            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
        Sequence.SequenceSelector c = sequence.new SequenceSelector();
        System.out.println(c.other());

    }

}
