package Glava12.Klasswork;

//За созданием каждого объекта, нуждающегося взавершении, должна следовать конструкция try-finally

public class NeedsCleanup {//При конструировании ошибок быть не может
    private static long counter = 1;
    private final long id = counter++;
    public void dispose(){
        System.out.println("NeedsCleanup" + id + "is free");
    }
}

class ConstructionException extends  Exception{}

class NeedsCleanup2 extends NeedsCleanup{
    // возможны ошибки при конструировании
    public NeedsCleanup2() throws ConstructionException{}
}

class CleanupIdiom{
    public static void main(String[] args) {
        //part 1
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
            //...
        } finally {
            nc1.dispose();
        }

        //part2
        // Усли ошибки конструирования невозможны, объекты можно группировать:
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try{
            //...
        } finally {
            nc3.dispose(); // обратный порядок конструирования
            nc2.dispose();
        }

        //part3
        //Если при конструировании возможны ошибки, необходимо защитить каждую операцию:
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {
                    //..
                } finally {
                    nc5.dispose();
                }
            }catch (ConstructionException e) { //конструктор nc5
                System.out.println(e);
            }finally {
                nc4.dispose();
            }
        }catch (ConstructionException e){
            System.out.println(e); //Constructor nc4
        }
    }
}
