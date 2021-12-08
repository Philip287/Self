package Glava12.HomeTask;

interface Selector {
    boolean end();
    Object current();
    void next();
}

class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() { return i == items.length; }
        @Override
        public Object current() { return items[i]; }
        @Override
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        boolean marker = true;
        while (marker){
            try {
                for(int i = 0; i < 35; i++) {
                    sequence.add(Integer.toString(i));
                    if (i > 10){
                        throw new IndexOutOfBoundsException("Massiv is full");
                    }
                }
            } catch (IndexOutOfBoundsException e){
                e.printStackTrace(System.out);
                System.out.println("try again");
            }
            marker = false;
        }
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}

public class Task12 {

}
