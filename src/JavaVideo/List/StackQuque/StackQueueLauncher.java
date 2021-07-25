package JavaVideo.List.StackQuque;

import JavaVideo.List.collectionClass.Card;
import JavaVideo.List.collectionClass.CardComparator;

import java.util.*;

public class StackQueueLauncher {
    public static void main(String[] args) {
     /*   passengerProcessing();
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(4);
        q.offer(5);
        q.offer(23);
        q.offer(1);
        System.out.println(q.poll());
        System.out.println(q.poll());*/

        Queue<Card> cardDeck = new PriorityQueue<>(52, new CardComparator());

        for (JavaVideo.List.collectionClass.Card.Face face : JavaVideo.List.collectionClass.Card.Face.values()) {
            for (JavaVideo.List.collectionClass.Card.Suit suit : JavaVideo.List.collectionClass.Card.Suit.values()) {
                cardDeck.offer(new JavaVideo.List.collectionClass.Card(suit, face));
            }
        }
       /* for (int i = 0; i < 10; i++) {
            System.out.println(cardDeck.poll());
            System.out.println("Deck size is: " + cardDeck.size());
        }
        System.out.println(cardDeck);
       *//* Iterator<Card> iterator = cardDeck.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());*//*
        System.out.println(cardDeck.peek());
        System.out.println("Deck size is: " + cardDeck.size());
        System.out.println(cardDeck.peek());
        System.out.println("Deck size is: " + cardDeck.size());
        cardDeck.clear();
        System.out.println("Deck size is: " + cardDeck.size());*/

        Deque<Card> cards = new ArrayDeque<>();
        for (int i = 0; i <20 ; i++) {
            cards.offerLast(cardDeck.poll());
        }

        /*for (int i = 0; i < 10; i++) {
            System.out.println(cards.pollLast());

        }*/
        Card card = new Card(Card.Suit.SPADES, Card.Face.Ten);
        System.out.println(cards);
        cards.removeFirstOccurrence(card);
        System.out.println(cards);
        cards.removeLastOccurrence(card);
        System.out.println(cards);
    }


    private static void passengerProcessing() {
        Stack<Passenger> bus = new Stack<>();
        Passenger passenger = new Passenger("Katerina", "Ivanova");
        bus.push(new Passenger("Alex", "Vasko"));
        bus.push(new Passenger("Victor", "Mikhailov"));
        bus.push(new Passenger("Dmitrii", "Petrov"));
        bus.push(passenger);
        bus.push(new Passenger("Ivan", "Ivanov"));
        System.out.println("Passenger found at position: " + bus.search(passenger));
        System.out.println("Last entered passenger is: " + bus.peek());
        while (!bus.empty()) {
            System.out.println("Passenger: " + bus.pop());
        }

    }

    private static class Passenger {
        private static int number = 1;
        private String name;
        private String surname;

        public Passenger(String name, String surname) {
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