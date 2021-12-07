package Glava12.Klasswork;

public class WhoCalled {
    static void f() {
        // Produce exceptions for load trace of stack
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace())
                System.out.println(ste.getMethodName());
        }
    }
    static void g(){
        f();
    }
    static void h(){
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("________________________________________________________-");
        g();
        System.out.println("________________________________________________________-");
        h();
        System.out.println("________________________________________________________-");
    }
}
