package Glava11.HomeTask.Task10;

public class Rat extends Rodent{
    private int age;
    private String name;
    private String sound;

    public Rat(int age, String name, String sound, int age1, String name1, String sound1) {
        super(age, name, sound);
        this.age = age1;
        this.name = name1;
        this.sound = sound1;
    }

    private void voiсe(Rat r){
        System.out.println(r.name + "says: " + r.sound + " they are " + r.age + " y.o.");
    }
    private void move(Rat r){
        System.out.println("The " + r.sound + "move to the end");
    }
    private int getOld(Rat r){
        r.age =+ 2;
        return r.age;
    }

    @Override
    public String toString() {
        return "Rat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
