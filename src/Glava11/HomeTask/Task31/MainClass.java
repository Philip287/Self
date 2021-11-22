package Glava11.HomeTask.Task31;

import java.util.Iterator;

public class MainClass implements Iterable<Shape> {
    Shape[] shapes1 = new RandomShapeGenerator().array(8);

    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < shapes1.length;
            }

            @Override
            public Shape next() {
                return shapes1[index++];
            }

            @Override
            public void remove() {//not implements
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (Shape s : new MainClass())
            System.out.print(s.toString() + " ");
    }
}
