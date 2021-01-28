package Glava10.Task11;

public class Laptop {
    String name;
    String model;
    int coast;

    public Laptop(String name, String model, int coast) {
        this.name = name;
        this.model = model;
        this.coast = coast;
        System.out.println("Laptop name = " + name + ", model = " + model + ", coast = " + coast + " is inicializi");
    }

    @Override
    public String toString() {
        return "Laptop name = " + name + ", model = " + model + ", coast = " + coast;
    }

    public Monitor monitor(String label) {
        return new Monitor("lG", "gf1876", 123) {
            String setName(){
                return name = label;
            }

            @Override
            void on() {
                super.on();
                System.out.println(name + " in new position");
                waiting();
            }

            @Override
            void off() {
                super.off();
                System.out.println(name + " in new position");
            }

            @Override
            public String toString() {
                return super.toString();
            }

            void waiting() {
                System.out.println(name + " is waiting");
            }
        };
    }

    public static void main(String[] args) {
        Laptop hp = new Laptop("HP", "Zbook 2", 2334);
        Monitor lg = hp.monitor(" lg");
        lg.on();
        lg.off();
    }
}
