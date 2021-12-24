package Glava13;

public class SimpleFormat {
    public static void main(String[] args) {
        int x = 5;
        double y = 5.332542;
        //Старый способ
        System.out.println("Row 1: [" + x + " " + y + "]");
        //Новый способ
        System.out.format("Row 1: [%d %f]\n", x,y);
        //или
        System.out.printf("Row 1: [%d %f]\n", x,y);
    }
}
