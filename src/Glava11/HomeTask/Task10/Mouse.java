package Glava11.HomeTask.Task10;

public class Mouse extends Rodent{
    private int age;
    private String name;
    private String sound;

    public Mouse(int age, String name, String sound, int age1, String name1, String sound1) {
        super(age, name, sound);
        this.age = age1;
        this.name = name1;
        this.sound = sound1;
    }

    private void voiсe(Mouse r){
        System.out.println(r.name + "says: " + r.sound + " they are " + r.age + " y.o.");
    }
    private void move(Mouse r){
        System.out.println("The " + r.sound + "move to the end");
    }
    private int getOld(Mouse r){
        r.age =+ 1;
        return r.age;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
