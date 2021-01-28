package Glava10.Task14;

import java.util.Scanner;

public class RearrangeInput implements Processor {

    public String name() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str1 = in.nextLine();
        return str1;
    }

    @Override
    public Object process(Object input) {
        String str = (String) input;
        char[] array = str.toCharArray();
        String result = "";
        for (int i = 0; i < array.length; i+=2) {
            result = result + array[i + 1];
            result = result + array[i];
        }
        System.out.println(result);
        return result;
    }

    public static RearrangeFactory factory =
            new RearrangeFactory() {
                @Override
                public Processor getProcessor() {
                    return new RearrangeInput();
                }
            };
}
