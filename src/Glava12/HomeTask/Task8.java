package Glava12.HomeTask;

public class Task8 {
    public static void f() {
       new Task4Exception("msg");
    }

    public static void main(String[] args) {
        try {
            f();
            throw new Task4Exception("Masseg");
        } catch (Task4Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
