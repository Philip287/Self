package IntroductionToJavaOnline.JavaFundamentals;

//4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму
//       (произведение) и вывести результат на консоль.

import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        System.out.print("Please enter you first number: ");
        double x = scanner();
        System.out.print("Please enter you second number: ");
        double y = scanner();
        System.out.println("Sum of this number = " + sum(x,y));
        System.out.println("Product of this number = " + productOfTwoNumbers(x,y));

    }

    private static double scanner() {
        double n = 5;
        Scanner scanner = new Scanner(System.in);
        try {
            n = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Something is wrong, try again");
            scanner();
        }
        return n;
    }

    private static double sum(double x, double y) {
        return x + y;
    }

    private static double productOfTwoNumbers(double x, double y) {
        return x * y;
    }
}
