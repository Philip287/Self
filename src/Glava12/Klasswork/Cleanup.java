package Glava12.Klasswork;

public class Cleanup {
    public static void main(String[] args) {
        try{
            InputFile in = new InputFile("Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null); //обработка данных по строкам
            }catch (Exception e){
                System.out.println("Перехвачено исключение Exception in main");
                e.printStackTrace(System.out);
            }finally {
                in.dispose();
            }
        }catch (Exception e){
            System.out.println("Ошибка при конструировании InputFile");
        }
    }
}
