package Glava10.Exz11;

public class Parcel8 {
    public Wrapping wrapping(int x) {
        //вызов конструктора базового класса
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
