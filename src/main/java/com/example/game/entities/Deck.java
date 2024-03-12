package com.example.game.entities;

import java.util.ArrayList;
import java.util.List;

public class Deck {


    private List<Integer> deck;
    private Integer noOfDecks;
    private Integer noOfJokers;
    private Integer jokerValue;

    private final Integer maxCardValue=13;


    public List<Integer> getDeck() {
        return deck;
    }

    public void setDeck(List<Integer> deck) {
        this.deck = deck;
    }
    public Integer getMaxCardValue() {
        return maxCardValue;
    }


    public Integer getNoOfDecks() {
        return noOfDecks;
    }

    public void setNoOfDecks(Integer noOfDecks) {
        this.noOfDecks = noOfDecks;
    }

    public Integer getNoOfJokers() {
        return noOfJokers;
    }

    public void setNoOfJokers(Integer noOfJokers) {
        this.noOfJokers = noOfJokers;
    }

    public Integer getJokerValue() {
        return jokerValue;
    }

    public void setJokerValue(Integer jokerValue) {
        this.jokerValue = jokerValue;
    }

    public Deck(){
        this.noOfDecks=1;
        this.noOfJokers=0;
        this.jokerValue=0;
        this.deck=new ArrayList<>();
    }

    public Deck(List<Integer> deck, Integer noOfDecks, Integer noOfJokers) {
        this.deck = deck;
        this.noOfDecks = noOfDecks;
        this.noOfJokers = noOfJokers;
    }
}
