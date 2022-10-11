package org.example;

public enum Suit {
    HEART("Hearts"),
    CLUB("Clubs"),
    DIAMOND("Diamonds"),
    SPADE("Spades");

    public String getSuitName() {
        return suitName;
    }

    final String suitName;

    Suit(String suitName){
        this.suitName = suitName;
    }


}
