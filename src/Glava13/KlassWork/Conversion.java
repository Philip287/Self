package Glava13.KlassWork;

import java.math.BigInteger;
import java.util.Formatter;

public class Conversion {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        double numer = 0;
        f.format("%-5s | %1s |  %5s\n", "Parametr", "simvol", "numer");
        char u = 'a';
        System.out.println("u = 'a'");
        f.format("%-1s : %10s %10.2f\n", "s", u, numer += 1);
        // f.format("%-1s : %10d %10.2f\n", "d",u, numer+=1);
        f.format("%-1s : %10c %10.2f\n", "c", u, numer += 1);
        f.format("%-1s : %10b %10.2f\n", "b", u, numer += 1);
        //f.format("%-1s : %10f %10.2f\n", "f",u, numer+=1);
        //f.format("%-1s : %10e %10.2f\n", "e",u, numer+=1);
        //f.format("%-1s : %10x %10.2f\n", "x",u, numer+=1);
        f.format("%-1s : %10h %10.2f\n", "h", u, numer += 1);

        numer = 0;

        int v = 121;
        System.out.println("v = 121");
        f.format("%-1s : %10s %10.2f\n", "s", v, numer += 1);
        f.format("%-1s : %10d %10.2f\n", "d", v, numer += 1);
        f.format("%-1s : %10c %10.2f\n", "c", v, numer += 1);
        f.format("%-1s : %10b %10.2f\n", "b", v, numer += 1);
        //f.format("%-1s : %10f %10.2f\n", "f",v, numer+=1);
        //f.format("%-1s : %10e %10.2f\n", "e",v, numer+=1);
        f.format("%-1s : %10x %10.2f\n", "x", v, numer += 1);
        f.format("%-1s : %10h %10.2f\n", "h", v, numer += 1);

        numer = 0;

        BigInteger w = new BigInteger("50000000000000");
        System.out.println(" w = new BigInteger(\"50000000000000\")");
        f.format("%-1s : %10s %10.2f\n", "s", w, numer += 1);
        f.format("%-1s : %10d %10.2f\n", "d", w, numer += 1);
        //f.format("%-1s : %10c %10.2f\n", "c",w, numer+=1);
        f.format("%-1s : %10b %10.2f\n", "b", w, numer += 1);
        //f.format("%-1s : %10f %10.2f\n", "f",w, numer+=1);
        //f.format("%-1s : %10e %10.2f\n", "e",w, numer+=1);
        f.format("%-1s : %10x %10.2f\n", "x", w, numer += 1);
        f.format("%-1s : %10h %10.2f\n", "h", w, numer += 1);

        numer = 0;

        double x = 179.543;
        System.out.println("x = 179,543");
        f.format("%-1s : %10s %10.2f\n", "s", x, numer += 1);
        //f.format("%-1s : %10d %10.2f\n", "d", x, numer += 1);
        //f.format("%-1s : %10c %10.2f\n", "c",x, numer+=1);
        f.format("%-1s : %10b %10.2f\n", "b", x, numer += 1);
        f.format("%-1s : %10f %10.2f\n", "f",x, numer+=1);
        f.format("%-1s : %10e %10.2f\n", "e",x, numer+=1);
        //f.format("%-1s : %10x %10.2f\n", "x", x, numer += 1);
        f.format("%-1s : %10h %10.2f\n", "h", x, numer += 1);

        numer = 0;

        Conversion y = new Conversion();
        System.out.println("y = new Conversion()");
        f.format("%-1s : %10s %10.2f\n", "s", y, numer += 1);
        //f.format("%-1s : %10d %10.2f\n", "d", y, numer += 1);
        //f.format("%-1s : %10c %10.2f\n", "c",y, numer+=1);
        f.format("%-1s : %10b %10.2f\n", "b", y, numer += 1);
        //f.format("%-1s : %10f %10.2f\n", "f",y, numer+=1);
        //f.format("%-1s : %10e %10.2f\n", "e",y, numer+=1);
        //f.format("%-1s : %10x %10.2f\n", "x", y, numer += 1);
        f.format("%-1s : %10h %10.2f\n", "h", y, numer += 1);

        numer = 0;

        boolean z = false;
        System.out.println("z = false");
        f.format("%-1s : %10s %10.2f\n", "s", z, numer += 1);
        //f.format("%-1s : %10d %10.2f\n", "d", z, numer += 1);
        //f.format("%-1s : %10c %10.2f\n", "c",z, numer+=1);
        f.format("%-1s : %10b %10.2f\n", "b", z, numer += 1);
        //f.format("%-1s : %10f %10.2f\n", "f",z, numer+=1);
        //f.format("%-1s : %10e %10.2f\n", "e",z, numer+=1);
        //f.format("%-1s : %10x %10.2f\n", "x", z, numer += 1);
        f.format("%-1s : %10h %10.2f\n", "h", z, numer += 1);
    }
}
