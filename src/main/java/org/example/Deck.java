package org.example;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<Card>();
    }

    public void addCard(Card card){
        deck.add(card);
    }

    public void createFullDeck(){
        for (Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                deck.add(new Card(suit, rank));
            }
        }
    }

    public void shuffleDeck(){
        ArrayList<Card> shuffledDeck = new ArrayList<Card>();
        while (deck.size() > 0){
            int randomCardIndex = (int)(Math.random()*(deck.size()-1));
            shuffledDeck.add(deck.get(randomCardIndex));
            deck.remove(randomCardIndex);
        }
        deck = shuffledDeck;
    }


    public String toString(){
        String out = "";
        for (Card card : deck){
            out += card;
            out += "\n";
        }
        return out;
    }

    public Card takeCard() {
        Card cardToTake = new Card(deck.get(0));
        deck.remove(0);
        return cardToTake;
    }
}
