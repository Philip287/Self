package Glava11.Klasswork;

import java.util.Arrays;

public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib){
        for (T t : ib)
            System.out.print(t + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        //массив работает в foreach, но не является Iterable
        //! test(strings);
        //Его необходимо явно преобразовать в Iterable:
        test(Arrays.asList(strings));
    }
}
