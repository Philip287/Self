package Glava11.HomeTask.Task27;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Command2 extends  Command{
    public Command2(String str) {
        super(str);
    }

    public Queue<Command> addedQueue() {
        Queue<Command> queue = new LinkedList<>();
        Random random1 = new Random(47);
        for (int i = 0; i < 10; i++) {
            int h = (random1.nextInt(i + 10));
            queue.offer(new Command("Line"+ h)) ;
        }
        System.out.println(queue.toString());
            System.out.println(queue.peek());
        return queue;
    }
}
