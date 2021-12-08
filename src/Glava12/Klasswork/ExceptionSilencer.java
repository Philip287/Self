package Glava12.Klasswork;

public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            //ИСпользование return в блоке finally подавляет любое исключение
            return;
        }
    }
}
