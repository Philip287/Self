package Glava10.Exz15;

public class Implementation2 implements Service {
    @Override
    public void method1() {
        System.out.println("Implementation2 method1()");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2()");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                @Override
                public Service getService() {
                    return new Implementation2();
                }
            };
}
