package Glava11.HomeTask.Task28and29;

import Glava11.Klasswork.QueueDemo;

import java.util.PriorityQueue;
import java.util.Random;

public class DoublePriorityQueue {
    public static void main(String[] args) {
        Random random = new Random(47);
        PriorityQueue <Double> doublePriorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 20; i++) {
            doublePriorityQueue.offer(random.nextDouble());
        }
        /* QueueDemo q = new QueueDemo();
        q.printQ(doublePriorityQueue);

        PriorityQueue<Secondclass> s = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            s.offer(new Secondclass());
        } */
    }
}
class Secondclass extends Object{

}
