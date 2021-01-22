package Glava10.Task8.exz2;

public class Home {
    public Сonsole1 clc(String s) {
        class TV implements Сonsole1 {
            @Override
            public Сonsole1 pusch() {
                return this;
            }
        }
        return (new TV().pusch());
    }

    public static void main(String[] args) {
        Home home = new Home();
        System.out.println(home.clc("f"));

    }


}
