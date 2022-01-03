package Test;

public class Test {}

    interface SomeInterface {
        String COMPANY = "Рога и копыта";

        void methodName();
    }

    class SomeClass implements SomeInterface {

        @Override
        public void methodName() {
            System.out.println("SomeClass.methodName() ...");
        }
    }

