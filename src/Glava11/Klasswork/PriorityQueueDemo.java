package Glava11.Klasswork;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i + 10));
        }
        q.printQ(priorityQueue);
        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<Integer>(ints);

        q.printQ(priorityQueue);
        priorityQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        q.printQ(priorityQueue);

        String fact = "Education should eschew obfuscation";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
        q.printQ(stringPQ);
        stringPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        q.printQ(stringPQ);

        Set<Character> charSet = new HashSet<>();
        for (char c : fact.toCharArray()) {
            charSet.add(c);
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
        q.printQ(characterPQ);
    }
}