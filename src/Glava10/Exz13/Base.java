package Glava10.Exz13;

abstract class Base {
    public Base (int i){
        System.out.println("Basic constructor, i = " + i);
    }
    public abstract void f();
}
class AnonymousConstructor{
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println(" in inicialisation");
            }

            public void f() {
                System.out.println("in anonimaus F()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
