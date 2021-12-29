package Test;

public class Test {

    static void method() throws IllegalAccessException
    {
        try {
            System.out.println("inside method");
            throw new IllegalAccessException (
                    "Exception in method");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[])
    {
        try {
            method();
        } catch(IllegalAccessException  e) {
            System.out.println("Catch inside main : " +
                    e.getMessage());
        }
    }
}
