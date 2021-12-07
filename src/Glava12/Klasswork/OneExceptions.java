package Glava12.Klasswork;

import java.io.IOException;

public class OneExceptions extends Exception{
    public OneExceptions(String s){
        super(s);
    }
}
class TwoExceptions extends Exception{
    public TwoExceptions(String s){
        super(s);
    }
}

class RethrowNew{
    public static void f() throws OneExceptions{
        System.out.println("Made exceptions in f()");
        throw new OneExceptions("from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            }catch (OneExceptions e){
                System.out.println(" Перхвачено во внутреннем блоке try, e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new IOException("Из внутреннего блока try");
            }
        }catch (IOException e){
            System.out.println("Перехвачено во внешнем блоке try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}