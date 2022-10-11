package org.example;

public abstract class Person {
    private Hand hand;
    private String name;

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(){
        this.hand = new Hand();
        this.name = "";
    }

    public boolean hasBlack(){
        if(this.getHand().calculateValue() == 21){
            return true;
        }else {
            return false;
        }
    }

    public void printHand(){
        System.out.println(this.name + " hand looks like this:");
        System.out.println(this.hand + " value at: " + this.hand.calculateValue());
    }
}
