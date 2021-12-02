package Glava12.HomeTask;

public class Task9 extends NullPointerException {
    int x;

    public Task9() {

    }

    public Task9(String msg, int x) {
        super(msg);
        this.x = x;
    }

    public int val() {
        return x;
    }

    public String msg() {
        return "Message " + super.getMessage();
    }

}

class ExceptionNull extends IndexOutOfBoundsException {
    public ExceptionNull() {
        throw new IndexOutOfBoundsException("Nobodi");
    }
}

class MainClass1 {
    public static void f() {
        throw new Task9("New msg", 30);
    }
    public static void g(){
        throw new ExceptionNull();
    }

    public static void h(){
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cath1");
        } catch (Exception e) {
            e.printStackTrace(System.out);
            e.getMessage();
            e.getLocalizedMessage();
        }

        try {
            g();
        } catch (Error e) {
            System.out.println("Catch 1");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch (Error e) {
            System.out.println("Catch 1");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
