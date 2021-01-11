package Glava10.Task1;

public class Other {
    private String s;

    public Other(String s) {
        this.s = s;
    }

    inner returnited() {
        return new inner("Inner is done");

    }

    class inner {
        String inner;

        @Override
        public String toString() {
            return "Other inner = " + s;
        }

        public inner(String inner) {
            this.inner = inner;
            System.out.println(inner);
        }
    }

    public static void main(String[] args) {
        Other other = new Other( "Bird");
        System.out.println(other.returnited());
        other.toString();
    }

}
