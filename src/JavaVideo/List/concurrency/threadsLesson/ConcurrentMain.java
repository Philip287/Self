package JavaVideo.List.concurrency.threadsLesson;

import static JavaVideo.List.concurrency.threadsLesson.ColorScheme.*;

public class ConcurrentMain {
    public static void main(String[] args) {

        SimpleThread th1 = new SimpleThread();
        th1.start();

        System.out.println(BLUE + "Hello from main");

        SimpleThread th2 = new SimpleThread();
        th2.start();

        th2.interrupt();

        Thread th3 = new Thread(new SimpleRunner());
        th3.start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from Lambda");
            }
        }).start();
    }
}


class SimpleThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(YELLOW + "Warn - " + currentThread().getName() + " was interrupted ");
                return;
            }
            System.out.println(GREEN + "Info - " + currentThread().getName() + " - " + i);
        }
    }
}

class SimpleRunner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(YELLOW + "Warn - Runnable -" + Thread.currentThread().getName() + " was interrupted ");
            }
            System.out.println(RED + "Info - Runnable - " + Thread.currentThread().getName() + " - " + i);
        }

    }
}
