package IntroductionToJavaOnline.JavaFundamentals;

//3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Random;
import java.util.Scanner;

public class MainTask3 {
    public static void main(String[] args) {
        MainTask3 m = new MainTask3();
        run();
    }

    private static void run() {
        Random random = new Random();
        int[] arrayOfRandomNumber = choice1(random);
        choice2(arrayOfRandomNumber);
    }

    private static void choice2(int[] arrayOfRandomNumber) {
        System.out.print("Enter 1 - if you wont print number in one string.\n" +
                "Enter 2 - if you wont print number in different string.\n" +
                "Enter you choice: ");
        int secondChoice = scanner();
        if (secondChoice == 1) {
            for (int i = 0; i < arrayOfRandomNumber.length; i++) {
                System.out.print(arrayOfRandomNumber[i] + ", ");
            }
        }
        else if (secondChoice == 2) {
            for (int i = 0; i < arrayOfRandomNumber.length; i++) {
                System.out.println("Number " + (i+1) + " - " + arrayOfRandomNumber[i] + ";");
            }
        } else {
            System.out.println("Please try again");
            choice2(arrayOfRandomNumber);
        }
    }

    private static int[] choice1(Random random) {
        System.out.print("Please enter how many number do you need:");
        int numberOfNumbers = scanner();
        int[] arrayOfRandomNumber = new int[numberOfNumbers];
        for (int i = 0; i < arrayOfRandomNumber.length; i++) {
            arrayOfRandomNumber[i] = random.nextInt();
            //System.out.print(arrayOfRandomNumber[i] + " ");
        }
        return arrayOfRandomNumber;
    }

    private static int scanner() {
        int n = 5;
        Scanner scanner = new Scanner(System.in);
        try {
            n = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Something is wrong, try again");
            scanner();
        }
        return n;
    }
}
