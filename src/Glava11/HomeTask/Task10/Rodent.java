package Glava11.HomeTask.Task10;

public class Rodent {
    private int age;
    private String name;
    private String sound;

    public Rodent(int age, String name, String sound) {
        this.age = age;
        this.name = name;
        this.sound = sound;
    }

    private void voiсe(Rodent r){
        System.out.println(r.name + "says: " + r.sound + " they are " + r.age + " y.o.");
    }
    private void move(Rodent r){
        System.out.println("The " + r.sound + "move to the end");
    }
    private int getOld(Rodent r){
        r.age =+ 1;
        return r.age;
    }

    @Override
    public String toString() {
        return "Rodent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
