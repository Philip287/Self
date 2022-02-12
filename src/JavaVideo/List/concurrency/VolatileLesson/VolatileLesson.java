package JavaVideo.List.concurrency.VolatileLesson;

import static JavaVideo.List.concurrency.threadsLesson.ColorScheme.*;

public class VolatileLesson {
    private static volatile int counter;

    public static void main(String[] args) {
        new SimpleWriter().start();
        new SimpleReader().start();


    }

    private static class SimpleWriter extends Thread {

        @Override
        public void run() {
            int localCounter = counter;
            for (int i = 0; i < 10; i++) {
                System.out.println(GREEN +  "Writer increments counter " + (localCounter + 1));
                counter = ++localCounter;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class SimpleReader extends Thread {

        @Override
        public void run() {
            int localCounter = counter;
            while (localCounter < 10) {
                if (localCounter != counter) {
                    System.out.println(RED + "Reader reads counter " + counter);
                    localCounter = counter;
                }
            }
        }
    }


}
