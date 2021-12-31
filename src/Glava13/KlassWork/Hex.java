package Glava13.KlassWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Hex {
    public static String format(byte[] data) {
        StringBuilder rezult = new StringBuilder();
        int n = 0;
        for (byte b : data) {
            if (n % 16 == 0)
                rezult.append(String.format("%05x: ", n));
            rezult.append(String.format("%02x: ", b));
            n++;
            if (n % 16 == 0) rezult.append("\n");
        }
        rezult.append("\n");
        return rezult.toString();
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0)
            //тестирование на примере файла класса:
            System.out.println(format(Files.readAllBytes(Paths.get(
                    "build/classes/java/main/Glava13/KlassWork/Hex.class"))));
        else
            System.out.println(format(
                    Files.readAllBytes(Paths.get(args[0]))));
    }
}
