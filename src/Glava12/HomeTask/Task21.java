package Glava12.HomeTask;

import java.net.Socket;

public class Task21 extends Exception {
    private String s;
    private int i;

    public Task21(String s, int i) throws Exception{
        try {
            this.s = s;
            try {
                this.i = i;
            }catch (Exception e){
                System.out.println(i = 0);
                i = 0;
            }
        } catch (Exception e){
            System.out.println(s = null);
            this.s = null;
        }
    }

}

class SecondClass extends Task21{
    private String s2;
    private int i2;

    public SecondClass(String s, int i, String s2, int i2) throws Exception {
        super(s, i);
        try {
            this.s2 = s2;
            throw new Exception();
        } catch (Exception e){
            System.out.println(e = null);
        }
        try {
            this.i2 = i2;
            throw new Exception();
        } catch (Exception e){
            System.out.println(i = 0);
        }
    }

    public static void main(String[] args) {
        try {
            SecondClass sec = new SecondClass("Nord", 3, null, 4);
        } catch (Exception e ){
            e.printStackTrace(System.out);
        }
    }
}