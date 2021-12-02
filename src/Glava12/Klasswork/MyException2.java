package Glava12.Klasswork;

public class MyException2 extends Exception {
    private int x;

    public MyException2() {
    }

    public MyException2(String msg) {
        super(msg);
    }

    public MyException2(String msg, int x) {
        super(msg);
        this.x = x;
    }

    public int val() {
        return x;
    }

    public String getMessage() {
        return "Подробное сообщение: " + x + " " + super.getMessage();
    }
}

class ExtraFeatures {
    public static void f() throws MyException2 {
        System.out.println("Возбуждаем MyExceptions2 from f()");
        throw new MyException2();
    }

    public static void g() throws MyException2 {
        System.out.println("Возбуждаем MyExceptions2 from g()");
        throw new MyException2("Made from g()");
    }

    public static void h() throws MyException2 {
        System.out.println("Возбуждаем MyExceptions2 from h()");
        throw new MyException2("Made from h()", 47);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 e){
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException2 e){
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (MyException2 e){
            e.printStackTrace(System.out);
            System.out.println("e.Val() = " + e.val());
        }
    }
}
