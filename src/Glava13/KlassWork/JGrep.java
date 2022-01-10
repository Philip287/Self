package Glava13.KlassWork;
// :strings/JGrep.java
// Очень простая версия программы "JGrep"
// {Args: JGrep.java "\\b[Ssct]\\w+"}


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
    public static void
    main(String[] args) throws Exception {
        if(args.length < 2) {
            System.out.println(
                    "Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        Matcher m = p.matcher("");
        // Iterate through the lines of the input file:
        Files.readAllLines(Paths.get(args[0])).forEach(
                line -> {
                    m.reset(line);
                    while(m.find())
                        System.out.println(
                                m.group() + ": " + m.start());
                }
        );
    }
}