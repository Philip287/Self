package Glava11.HomeTask.Task27;

import java.util.Queue;

public class Command3 extends Command2{
    public Command3(String str) {
        super(str);
    }

    public static void main(String[] args) {
        Command2 com = new Command2(" ");
        printQ(com.addedQueue());

    }

    public static void printQ(Queue queue) {
        Command c = new Command(" ");
        while (queue.peek() != null)
        c.operation((Command) queue.remove());
    }
}
