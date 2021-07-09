package Glava11;

import java.util.ArrayList;

public class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {
}

class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 4; i++)
            apples.add(new Apple());
        // не мешает добавить orange в apples
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++)
        System.out.println(((Apple) apples.get(i)).id());
    }
}