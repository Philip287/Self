package Glava12.Klasswork;

import java.net.Socket;

class FourException extends Exception{}

public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Входим в первый блок try");
        try{
            System.out.println("Входим во второй блок TRY");
            try {
                throw new FourException();
            }finally {
                System.out.println("Finally in second block try");
            }
        }catch (FourException e){
            System.out.println("Перехвачено FourException in first block try");
        }finally {
            System.out.println("Finally in first block try");
        }
    }
}
