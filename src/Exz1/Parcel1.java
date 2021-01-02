package Exz1;

import javax.print.attribute.standard.Destination;

public class Parcel1 {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }
        //использование внутренних класов  очень похоже на использование любых других классов, в пределах Parcel1
        public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
            System.out.println(d.readLabel());
        }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Танзания");
    }

}
