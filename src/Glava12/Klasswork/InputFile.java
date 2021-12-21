package Glava12.Klasswork;

import java.io.*;

public class InputFile {
    private BufferedReader in;
    public InputFile(String fname) throws Exception{
        try{
            File file;
            in = new BufferedReader(new FileReader(fname));
            // остальной код способный вызывать исключениея
        } catch (FileNotFoundException e){
            System.out.println("Could not open " + fname);
            // файл не был открыит, закрывать не нужно
            throw e;
        } catch (Exception e){
            // при дугих исключениях необходимо закрыть файл
            try {
                in.close();
                System.out.println("in close");
            }catch (IOException e2){
                System.out.println("Ошибка при выполнении in.close()");
            }
            throw e; // Rethrow
        } finally {
            //Здесь файл не закрывается!!!
        }
    }

    public String getLine(){
        String s;
        try {
            s = in.readLine();
        }catch (IOException e){
            throw  new RuntimeException("Ошибка при выполнении readLine()");
        }
        return s;
    }

    public void dispose(){
        try {
            in.close();
            System.out.println("dispose() успешен");
        } catch (IOException e2){
            throw new RuntimeException("Ошибка при выполнении in.close");
        }
    }
}
