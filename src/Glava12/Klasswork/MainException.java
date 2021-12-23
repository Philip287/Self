package Glava12.Klasswork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MainException {
    // Передаём все исключения на консоль
    public static void main(String[] args) throws Exception {
        // открываем файл
        List<String> lines = Files.readAllLines(
                Paths.get("MainException.java"));
        // используем файл
        // закрываем файл

    }
}
