package Glava13.HomeTask;

public class Task6 {
    int numerI;
    long numerL;
    float numerF;
    double numerD;

    public Task6(int numeriI, long numerL, float numerF, double numerD) {
        this.numerI = numeriI;
        this.numerL = numerL;
        this.numerF = numerF;
        this.numerD = numerD;
    }

    public String toString() {
        try {
            System.out.println(String.format("%s %5s %6s %10f\n", numerI, numerL, numerF, numerD));
        } catch (Exception e){
            e.printStackTrace(System.out);
        }
       return "done";
    }

    public static void main(String[] args) {
        Task6 task = new Task6(2, 3, 4, 5.5);
        task.toString();
    }
}
