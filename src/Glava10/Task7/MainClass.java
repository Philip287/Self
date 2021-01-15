package Glava10.Task7;

public class MainClass {
    private String s = "the first initialize";

    @Override
    public String toString() {
        return "MainClass s= " + s;
    }

    private String getString(){
        System.out.println( s);
        return s;
    }
    private void marshal() {
        SecondClass sec = new SecondClass();
        sec.change("Change");
    }


    class SecondClass {
        private String big = "Second class string";
        private void print(){
            System.out.println(big);
        }
        public void change(String d) {
            MainClass.this.s = d;
            MainClass.this.getString();
        }
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        MainClass.SecondClass sec1 = mainClass.new SecondClass();
        mainClass.marshal();
        System.out.println(mainClass);

    }
}
