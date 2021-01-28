package Glava10.Task14;

import java.util.Scanner;

public class MainClass {
    public static void serviceConsumer(RearrangeFactory factory) {
        Processor s = factory.getProcessor();
        String str2 = s.name();
        s.process(str2);
    }

    public static void main(String[] args) {
        Scanner im = new Scanner(System.in);
        System.out.println("Enter you choice: \n" +
                "if you want to enter test programmer, pleas enter 1 \n" +
                "if you want to enter your string, pleas enter 2 \n" +
                "if you want to exit, pleas enter 3");
        Integer num = im.nextInt();

        while (num > 0 && num <= 2) {
            if (num == 1) {
                serviceConsumer(RearrangeStatic.factory);
            } else {
                serviceConsumer(RearrangeInput.factory);
            }
        }
    }
}
