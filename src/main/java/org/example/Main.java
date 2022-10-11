package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("THE BLACKJACK GAME");

//        Deck deck = new Deck();
//        Card cardA = new Card(Suit.CLUB, Rank.QUEEN);
//        Card cardB = new Card(Suit.DIAMOND, Rank.ACE);
//        Card cardC = new Card(Suit.SPADE, Rank.SIX);


//        deck.addCard(cardA);
//        deck.addCard(cardB);
//        deck.addCard(cardC);
//        deck.createFullDeck();
//        deck.shuffleDeck();
//        System.out.println(deck);

        Dealer dealer = new Dealer();
        System.out.println("The dealers name is: " + dealer.getName());
        Deck deck = new Deck();
        deck.createFullDeck();
        Hand hand = new Hand();
        hand.takeCardFromDeck(deck);
        hand.takeCardFromDeck(deck);
        hand.takeCardFromDeck(deck);
        System.out.println("Calculate hand: " + hand.calculateValue());
        System.out.println("Testing hand");
        System.out.println(deck);
        System.out.println("Now sharing cards");
        System.out.println(deck);

    }
}