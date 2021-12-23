package Glava12.Klasswork;

class Annoyance extends RuntimeException{};
class Sneeze extends Annoyance{};

public class Human {
    public static void main(String[] args) {
        //Перехват точного типа:
        try{
            throw new Sneeze();
        } catch (Sneeze s){
            try {
                s.getCause();
            }catch (Annoyance e){
                System.out.println("Перехвачено Annoyance" + e);
            }catch (RuntimeException e){
                System.out.println("Перехвачено" + e);
            }

        }

        // Перехват базового типа
        try{
            throw new Sneeze();
        } catch (Annoyance a){
            System.out.println("Перехвачено Annoyance 2");
        }
    }
}
