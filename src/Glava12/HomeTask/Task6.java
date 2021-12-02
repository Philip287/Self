package Glava12.HomeTask;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Task6 extends Exception{
    private static Logger logger = Logger.getLogger("Tsk 6 Exception");


    public  Task6(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
class ExceptionTest2 extends Exception{
    int x;
    public ExceptionTest2(){

    }
    public ExceptionTest2(String msg){
        super(msg);
    }

    public ExceptionTest2(String msg, int x){
        super(msg);
        this.x = x;
    }

    public int val(){
        return x;
    }

    public String getMsg(){
        return "Message " + x + " " + super.getMessage();
    }
}

class MainClass{
    public static void f() throws ExceptionTest2{
        System.out.println("Build in f()");
        throw  new ExceptionTest2();

    }public static void g() throws ExceptionTest2{
        System.out.println("Build in g()");
        throw  new ExceptionTest2("Message new ");

    }public static void h() throws ExceptionTest2{
        System.out.println("Build in h()");
        throw  new ExceptionTest2("Second Message", 47);
    }
    public static void k() throws Task6{
        System.out.println("Build in k()");
        throw  new Task6();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (ExceptionTest2 e){
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (ExceptionTest2 e){
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (ExceptionTest2 e){
            e.printStackTrace(System.out);
            System.out.println("e.val = " + e.val());
        }
        try {
            k();
        } catch (Task6 e){
            e.printStackTrace(System.out);
        }

    }
}

