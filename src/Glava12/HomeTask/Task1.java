package Glava12.HomeTask;

public class Task1 {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException("Class Exception ");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Catch IndexOutOfBoundsException");
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Finally block");
        }
    }
}
