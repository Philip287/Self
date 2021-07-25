package JavaVideo.List.collectionClass;

import java.util.*;

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
        printOutput(deckOfCards);
        Collections.shuffle(deckOfCards);
        Collections.sort(deckOfCards);
        Collections.reverse(deckOfCards);

        Card card = new Card(Card.Suit.SPADES, Card.Face.Queen);
        int i = Collections.binarySearch(deckOfCards, card);
        if (i>0){
            System.out.println("Card was found at position: " + i);
        } else {
            System.out.println("Card was not found");

        }

        List<Card> cardList = new ArrayList<>(deckOfCards);
        Collections.fill(cardList, card);
        printOutput(cardList);

        Collections.addAll(cardList, card, card, card);
        printOutput(cardList);

        Collections.copy(cardList, deckOfCards);
        printOutput(cardList);

        int frequency = Collections.frequency(cardList, card);
        System.out.println("Frequency of " + card + "  is "+ frequency);

        System.out.println("Min: " + Collections.min(cardList));
        System.out.println("Max: " + Collections.max(cardList));

        System.out.println("\n \n Cards after shuffle");
        printOutput((List<Card>) deckOfCards);

        Collections.sort(deckOfCards, new CardComparator() {
        });
        System.out.println("\n \n Cards after sort");
        printOutput(deckOfCards);
    }

    private static void printOutput(List<Card> deckOfCards) {
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
    }

}