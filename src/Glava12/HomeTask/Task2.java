package Glava12.HomeTask;

public class Task2 {
    public static void main(String[] args) {
        Task2 s = new Task2();
        s = null;
        try {
            s.printW(s);
        } catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
    public static void printW(Task2 s) throws Exception{
        System.out.println(s);
    }
}
