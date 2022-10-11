package org.example;

public class Game {
    private int loss;
    private int win;
    private int push;
    private Deck deck;
    private Deck discarded;
    private Dealer dealer;
    private Player player;

    public Game(){
        loss = 0;
        win = 0;
        push = 0;
        
        deck = new Deck();
        deck.createFullDeck();
        
        discarded = new Deck();
        
        dealer = new Dealer();
        player = new Player();
        
        deck.shuffleDeck();
        startRound();
    }

    private void startRound() {
        dealer.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);

        player.getHand().takeCardFromDeck(deck);
        player.getHand().takeCardFromDeck(deck);

        dealer.printFirstHand();
        player.printHand();
    }
}
