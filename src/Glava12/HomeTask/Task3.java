package Glava12.HomeTask;

public class Task3 {
    public Exception f() {
        throw new ArrayIndexOutOfBoundsException("Point 1");
    }

    public static void main(String[] args) {
        Task3 t = new Task3();
        try {
            t.f();
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace(System.out);
        }
    }
}
