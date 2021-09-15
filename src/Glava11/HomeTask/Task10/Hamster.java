package Glava11.HomeTask.Task10;

public class Hamster extends Rodent{
    private int age;
    private String name;
    private String sound;

    public Hamster(int age, String name, String sound, int age1, String name1, String sound1) {
        super(age, name, sound);
        this.age = age1;
        this.name = name1;
        this.sound = sound1;
    }

    private void voiсe(Hamster r){
        System.out.println(r.name + "says: " + r.sound + " they are " + r.age + " y.o.");
    }
    private void move(Hamster r){
        System.out.println("The " + r.sound + "move to the end");
    }
    private int getOld(Hamster r){
        r.age =+ 4;
        return r.age;
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
