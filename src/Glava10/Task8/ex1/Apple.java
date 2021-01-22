package Glava10.Task8.ex1;

public class Apple {
    public Fruit fruit(String name) {
        class Bone implements Fruit {
            private String name;

            private Bone(String name) {
                this.name = name;
            }

            public String readName() {
                return name;
            }

            @Override
            public Fruit print(String name) {
                return new Bone(name);
            }
        }
        return new Bone(name);
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.fruit("Name"));

    }
}
