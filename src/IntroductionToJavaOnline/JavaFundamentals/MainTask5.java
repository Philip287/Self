package IntroductionToJavaOnline.JavaFundamentals;

// 5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
//      Осуществить проверку корректности ввода чисел.

import java.util.Scanner;

public class MainTask5 {
    public static void main(String[] args) {
        run();
    }

    private  static  void  run(){
        System.out.println("Please enter number of muns what do you want need (From 1 to 12)");
        int numberOfMonth = scanner();
        if (numberOfMonth == 1){
            System.out.println("1 - January");
        } else if (numberOfMonth == 2){
            System.out.println("2 - February");
        }else if (numberOfMonth == 3){
            System.out.println("3 - March");
        }else if (numberOfMonth == 4){
            System.out.println("4 - April");
        }else if (numberOfMonth == 5){
            System.out.println("5 - May");
        }else if (numberOfMonth == 6){
            System.out.println("6 - June");
        }else if (numberOfMonth == 7){
            System.out.println("7 - July");
        }else if (numberOfMonth == 8){
            System.out.println("8 - August");
        }else if (numberOfMonth == 9){
            System.out.println("9 - September ");
        }else if (numberOfMonth == 10){
            System.out.println("10 - October");
        }else if (numberOfMonth == 11){
            System.out.println("11 - November");
        }else if (numberOfMonth == 12){
            System.out.println("12 - December");
        }else {
            System.out.println("Try again! Something is wrong");
            run();
        }

    }

    private static int scanner() {
        int n = 5;
        Scanner scanner = new Scanner(System.in);
        try {
            n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Something is wrong, try again");
            scanner();
        }
        return n;
    }
}
