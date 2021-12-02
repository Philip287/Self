package Glava12.Klasswork;

public class ExceptionMethods {
    public static void main(String[] args) {
        try{
            throw new Exception("My Exceptions");
        } catch (Exception e){
            System.out.println("Find");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.getLocalizedMessage() " + e.getLocalizedMessage());
            System.out.println("toString() " + e);
            System.out.println("e.printStackTrace() :" );
            e.printStackTrace();
        }
    }
}
