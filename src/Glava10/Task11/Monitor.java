package Glava10.Task11;

public class Monitor {
    String name;
    String model;
    int coast;

    void on(){
        System.out.println("Monitor is on");
    }
    void off(){
        System.out.println("Monitor is off");
    }

    public Monitor(String name, String model, int coast) {
        this.name = name;
        this.model = model;
        this.coast = coast;
        System.out.println("Monitor name = " + name + ", model = " + model + ", coast = " + coast + " is inicialisi");
    }

    @Override
    public String toString() {
        return "Monitor name = " + name + ", model = " + model + ", coast = " + coast;
    }
}
