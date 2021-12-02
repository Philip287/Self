package Glava12.HomeTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean counter = true;
        do {
            try {
                Double numerator, denumerator;
                System.out.println("Enter numerator");
                numerator = scanner.nextDouble();
                System.out.println("Enter Denumerator");
                denumerator = scanner.nextDouble();
                System.out.println(calc(numerator,denumerator));
                counter = false;
            } catch (ArithmeticException | InputMismatchException e) {
                e.printStackTrace(System.out);
                scanner.nextLine();
            }

        } while (counter);

    }

    public static Double calc(Double numerator, Double denumerator) {
        double rezult;
        rezult = numerator / denumerator;
        return rezult;
    }
}
