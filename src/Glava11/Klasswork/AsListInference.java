package Glava11.Klasswork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow {
}

class Powder extends Snow {
    String str1 = "Powder";

    @Override
    public String toString() {
        return "Powder ";
    }
}

class Light extends Powder {
    String str1 = "Light";

    @Override
    public String toString() {
        return "Light ";
    }
}

class Heavy extends Powder {
    String str1 = "Heavy";
    @Override
    public String toString() {
        return "Heavy ";
    }
}

class Crusty extends Snow {
    String str1 = "Crusty";
    @Override
    public String toString() {
        return "Crusty ";
    }
}

class Slush extends Snow {
    String str1 = "Slush";
    @Override
    public String toString() {
        return "Slush ";
    }
}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow2 = Arrays.asList(
                new Crusty(), new Slush(), new Powder());

        //Не компилируется:
        List<Snow> snows = Arrays.asList(
                new Light(), new Heavy());
        // Компилятор сообщает:
        // получено : java.util.List<Powder>
        // имеется : java.util.List<Snow>
        // У Collections.addAll() проблем нет:
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());
        // Подсказка с явно указанным аргументом типа:
        List<Snow> snow4 = Arrays.<Snow>asList(
                new Light(), new Heavy());

        System.out.println(snow2.toString());
        System.out.println(snows.toString());
        System.out.println(snow3.toString());
        System.out.println(snow4.toString());
    }
}
