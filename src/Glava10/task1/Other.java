package Glava10;

public class Other {
    inner returnited() {
        return new inner("Inner is done");

    }

    class inner {
        String inner;

        public inner(String inner) {
            this.inner = inner;
            System.out.println(inner);
        }
    }

    public static void main(String[] args) {
        Other other = new Other();
        System.out.println(other.returnited());
    }

}
