package IntroductionToJavaOnline.JavaFundamentals;

//2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some words or number");
        scanner.close();
        char[] charFirst = scanner.nextLine().toCharArray();
        for (int i = charFirst.length; i > 0 ; i--) {
            System.out.print(charFirst[i-1]);
        }

    }
}
