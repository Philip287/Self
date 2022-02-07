package GlavaFunctionalProgramming;

import java.util.function.Function;

@FunctionalInterface
interface Functional{
    String goodBye(String arg);
}

interface FunctionalNoAnn{
    String goodBye(String arg);
}

/*
@FunctionalInterface
interface NotFunctional {
String goodbye(String arg);
String hello(String arg);
}
Produces error message:
NotFunctional is not a functional interface
multiple non-overriding abstract methods
found in interface NotFunctional
*/

public class FunctionalAnnotation {
    public String goodBye(String arg){
        return "Goodbye" + arg;
    }

    public static void main(String[] args) {
        FunctionalAnnotation fa = new FunctionalAnnotation();
        Functional f = fa::goodBye;
        FunctionalNoAnn fna = fa::goodBye;
        //Functional fac = fa;  //Incompatible
        Function fl = a -> "Goodbye, " + a;
        FunctionalNoAnn fnal = a -> "Goodbye, " + a;
    }
}
