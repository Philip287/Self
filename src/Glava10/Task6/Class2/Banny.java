package Glava10.Task6.Class2;

import Glava10.Task6.Class.Box1;
import Glava10.Task6.Interfase.Action;

public class Banny extends Box1 {
    Action toDo() {
        Box1 box = new Box1();
        Action act1 = this.new BoxChocolate(" pospdofspd");
        return act1;

    }

    public static void main(String[] args) {
        Banny b = new Banny();
        System.out.println(b.toDo());


    }

}
