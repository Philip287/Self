package Glava12.Klasswork;

public class MultipleReturns {
    private static void f(int i){
        System.out.println("Инициализация требующая завершения");
        try {
            System.out.println("point 1");
            if(i==1) return;
            System.out.println("point 2");
            if (i==2) return;
            System.out.println("point 3");
            if(i==3) return;
            System.out.println("The end");
            return;
        } finally {
            System.out.println("The real end");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <=4 ; i++) {
            f(i);
        }
    }
}
