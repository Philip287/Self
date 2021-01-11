package Glava10.Exz6;

public class ParcelI3 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String wereTo) {
            label = wereTo;
        }

        String readLabel() {
            return label;
        }

    }

    public static void main(String[] args) {
        ParcelI3 p = new ParcelI3();
        // Must use instance of outer class
        // to create an instance of the inner class:
        ParcelI3.Contents c = p.new Contents();
        ParcelI3.Destination d = p.new Destination("Tanzania");
    }
}
