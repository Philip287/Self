package JavaVideo.List.collectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class collectionRunner {
    public static void main(String[] args) {
//        List<String> color = new ArrayList<>();
//
//        color.add("yellow");
//        color.add("blue");
//        color.add("black");
//        color.add("green");
//        color.add("red");
//
//        System.out.println("List before sorting: " + color);
//        Collections.sort(color);
//        System.out.println("List after sorting: " + color);

         List<Card> deckOfCards = new ArrayList<>();
         for (Card.Face face : Card.Face.values()){
             for(Card.Suit suit : Card.Suit.values()){
                 deckOfCards.add(new Card(suit,face));
             }
         }
        System.out.println("Original deck of cards");
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf();
        }
    }

    public static class Card implements Comparable<Card> {

        private enum Suit {SPADES, HEARTS, CLUBS, DIMONDS}

        private enum Face {Ace, Deuce, Three, Four, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

        private final Suit suit;

        private final Face face;

        public Card(Suit suit, Face face) {
            this.suit = suit;
            this.face = face;
        }

        public Suit getSuit() {
            return suit;
        }

        public Face getFace() {
            return face;
        }

        @Override
        public int compareTo(Card card) {
            Face[] values = Face.values();
            List<Face> faces = Arrays.asList(values);

            if (faces.indexOf(this.face) < faces.indexOf(card.getFace())) {
                return -1;
            } else if (faces.indexOf(this.face) > faces.indexOf(card.getFace())) {
                return +1;
            }else if (faces.indexOf(this.face) == faces.indexOf(card.getFace())) {
                return String.valueOf(suit).compareTo(String.valueOf(card.suit));
            }
            return 0;
        }

        @Override
        public String toString() {
            return face + " of " + suit;
        }
    }
}
