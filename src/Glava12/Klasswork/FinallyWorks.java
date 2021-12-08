package Glava12.Klasswork;

class ThreeException extends Exception{}

public class FinallyWorks {
    static int count = 0;
    public static void main(String[] args){
        while (true){
            try {
                //Постфиксный инкримент, при первом выполнении 0:
                if (count++ == 0)
                    throw new ThreeException();
                System.out.println("No exception");
            }catch (ThreeException e){
                System.out.println("ThreeException");
            } finally {
                System.out.println("In block finally");
                if (count == 2) break; // exit from while
            }
        }
    }
}
