package JavaVideo.List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(Integer.valueOf(1));

        Integer integ = 56;
        int n = integ.intValue();
        Double doubl = 56.576;
        double m = doubl.doubleValue();

        String[] colors = {"yellow, green, blue"};
        LinkedList<String> lin = new LinkedList<>(Arrays.asList(colors));
        lin.add("Black");

        colors = lin.toArray(new String[lin.size()]);
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);

        }



    }
}
