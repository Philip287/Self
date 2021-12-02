package Glava12.Klasswork;

public class SimpleExceptions extends Exception {
}

class InheritingExceptions {
    public void f() throws SimpleExceptions {
        System.out.println("Возбуждаем SimpleExceptions из f()");
        throw new SimpleExceptions();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleExceptions e) {
            System.out.println("Перехвачено");
        }
    }
}

