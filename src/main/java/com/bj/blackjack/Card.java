package com.bj.blackjack;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return this.rank.ordinal() + 1;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    static void main(String[] args) {
        Card card1 = new Card(Suit.CLUBS, Rank.ACE);
        Card card2 = new Card(Suit.SPADES, Rank.TEN);
        
    }
}
