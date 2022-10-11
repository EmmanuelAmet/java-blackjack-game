package org.example;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Card card) {
        this.rank = card.rank;
        this.suit = card.suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Card(Suit suit, Rank rank){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card {" + rank + " of " + suit + " " + this.getValue() + " }";
    }

    public int getValue(){
        return rank.rankValue;
    }
}
