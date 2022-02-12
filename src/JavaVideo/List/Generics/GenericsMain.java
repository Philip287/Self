package JavaVideo.List.Generics;

public class GenericsMain {
    public static void main(String[] args) {
        Container box = new Container(1);

        System.out.println((Integer) box.getObject1()*2);
    }
}
