package Glava10.Exz7;

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p =new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tanzania");
        // обращение к закрытому классу невозможно
        // !Parcel4.PContents pc = p.new PContents();
    }
}
