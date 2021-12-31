package Glava13.KlassWork;

public class DatabaseException extends Exception{
    public DatabaseException(int transcriptionID, int queryID, String message){
        super(String.format("(t%d, q%d) %s", transcriptionID, queryID, message));
    }

    public static void main(String[] args) {
       try {
           throw new DatabaseException(3,7, "Ошибка записи");
       }catch (Exception e){
           System.out.println(e);
       }
    }
}
