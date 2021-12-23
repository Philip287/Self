package Glava12.HomeTask;

public class Task3and7 {
    public Exception f() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("Point 1");
    }

    public static void main(String[] args) {
        Task3and7 t = new Task3and7();
        try {
            t.f();
        } catch (ArrayIndexOutOfBoundsException e){
           // e.printStackTrace(System.out);
            throw new RuntimeException(e);

        }
    }
}
