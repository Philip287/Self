package IntroductionToJavaOnline.JavaFundamentals;

/*
1.     Приветствовать любого пользователя при вводе его имени через командную строку.
*/


import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
        getStartProject();
    }

    private static void getStartProject() {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!!! What is you name? Enter in next line: \n");
        name = scanner.nextLine();
        System.out.printf("Hello %s", name);
    }
}
