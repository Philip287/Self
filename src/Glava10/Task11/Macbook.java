package Glava10.Task11;

public class Macbook {
    private String name;
    private String model;
    private int coast;

    public Macbook(String name, String model, int coast) {
        this.name = name;
        this.model = model;
        this.coast = coast;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Macbook name =  " + name + ", model = " + model + ", coast=" + coast;
    }

    public Monitor monitor(String age){
        return new Monitor("Mac", "X", 2345){
            {
                System.out.println(age);
            }

            @Override
            void on() {
                super.on();
            }

            @Override
            void off() {
                super.off();
            }

            @Override
            public String toString() {
                return super.toString();
            }
        };
    }

    public static void main(String[] args) {
        Macbook mac = new Macbook("Mac","CN45", 23456);
        Monitor mon = mac.monitor("23");

    }
}
