package JavaVideo.List.StackQuque;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQueueLauncher {
    public static void main(String[] args) {
     //   passengerProcessing();
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(4);
        q.offer(5);
        q.offer(23);
        q.offer(1);
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
    private static void passengerProcessing(){
        Stack<Passenger> bus = new Stack<>();
        Passenger passenger = new Passenger("Katerina", "Ivanova");
        bus.push(new Passenger("Alex", "Vasko"));
        bus.push(new Passenger("Victor", "Mikhailov"));
        bus.push(new Passenger("Dmitrii", "Petrov"));
        bus.push(passenger);
        bus.push(new Passenger("Ivan", "Ivanov"));
        System.out.println("Passenger found at position: " + bus.search(passenger));
        System.out.println("Last entered passenger is: " + bus.peek());
        while (!bus.empty()){
            System.out.println("Passenger: " + bus.pop());
        }

    }
    private static class Passenger{
        private static int number = 1;
        private String name;
        private String surname;

        public Passenger(String name, String surname){
            number++;
            this.name = name;
            this.surname = surname;
        }

        public static int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return "Passenger " + number +
                    " name " + name + " " + surname;
        }
    }
}