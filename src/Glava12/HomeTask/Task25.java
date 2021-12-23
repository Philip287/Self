package Glava12.HomeTask;

class firstException extends Exception{;
public void metod() throws Exception{
        throw new Exception();
        }
}
class secondException extends firstException{
    public void metod() throws firstException{
        throw new firstException();
    }
};

class thirdException extends secondException{
    public void metod() throws secondException{
        throw new secondException();
    }
};

public class Task25 {
    public static void main(String[] args) throws Exception {
       try {
           firstException except = new thirdException();
           except.metod();
       }catch (thirdException exs){
           System.out.println("Third");
       }catch (secondException e){
           System.out.println("SecondException");
       }catch (firstException e){
           System.out.println("firstException");
       }
    }

}
