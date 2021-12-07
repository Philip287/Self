package Glava12.Klasswork;

public class Rethrowing {
    public static void f()throws Exception{
        System.out.println("Made exception from f() ");
        throw new Exception("Made from f()");
    }

    public static void g() throws Exception{
        try{
            f();
        } catch (Exception e){
            System.out.println("In metod g(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception{
        try {
            f();
        } catch (Exception e){
            System.out.println("In metod h(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception)e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e){
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
        try{
            h();
        } catch (Exception e){
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
