package Glava10.Exz14;

import Glava10.Exz7.Destination;

public class Parcel10 {
    public Destination destination(final String dest, final float price){
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if(cost<100)
                    System.out.println("Превышение бюджета!");
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tanzania",101.395F);
    }
}
