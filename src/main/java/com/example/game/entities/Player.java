package com.example.game.entities;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private Integer score;
    private List<Integer>cards;

    public Player(Integer score, List<Integer> cards) {
        this.score = score;
        this.cards = cards;
    }

    public Player() {
        this.score = 0;
        this.cards = new ArrayList<>();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public List<Integer> getCards() {
        return cards;
    }

    public void setCards(List<Integer> cards) {
        this.cards = cards;
    }
}
