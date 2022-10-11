package org.example;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<Card>();
    }

    public void takeCardFromDeck(Deck deck){
        hand.add(deck.takeCard());
    }

    public int calculateValue(){
        int value = 0;
        int accCount = 0;

        for(Card card : hand){
            value += card.getValue();
            if(card.getValue() == 11){
                accCount++;
            }
        }

        if(value > 21 && accCount > 0){
            while (accCount > 0 && value > 21){
                accCount--;
                value -= 10;
            }
        }
        return value;
    }

    public Card getCard(int index){
        return hand.get(index);
    }

    public String toString(){
        String out = "";
        for (Card card : hand){
            out += card + " - ";
        }
        return out;
    }
}
