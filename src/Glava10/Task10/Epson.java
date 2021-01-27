package Glava10.Task10;

public class Epson {
    public String name;
    public int price;
    public String color;

    public Epson(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Epson name = " + name + ", price = " + price + ", color =  " + color;

    }

    public Print print(final String d) {
        return new Print() {
            String start = " Start print";
            String end = "print is end";

            public void start() {
                System.out.println(start);
            }

            public void end() {
                System.out.println(end);
            }

            String s = d;

            @Override
            public void printed() {
                start();
                end();
                System.out.println(s);
            }
        };
    }

    public static void main(String[] args) {
        Epson epson = new Epson("Epson", 234, "color");
        Print p = epson.print("Philipp");
        p.printed();
        System.out.println(epson);


    }
}
