package Glava10.Exz10;

import Glava10.Exz7.Contents;
interface  gg{
    public int print();
}
public class Parcel7 {
    public void test(gg h){
        System.out.println(h.print());
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        parcel7.test(new gg(){
            public int print(){
                return 44;
            }
        });

        parcel7.test(new gg(){
            public int print(){
                return 54;
            }
        });
    }
}
