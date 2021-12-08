package Glava12.HomeTask;

import java.io.IOException;

public class Task10and11 {
    public static void f(){
        try {
            g();
        } catch (IOException e){
            e.printStackTrace(System.out);
            throw new RuntimeException();
        }
    }

    public static void g() throws IOException{
        throw new IOException();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (RuntimeException e){
            e.printStackTrace(System.out);
        }
    }
}
