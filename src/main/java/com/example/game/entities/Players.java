package com.example.game.entities;

import java.util.ArrayList;
import java.util.List;

public class Players {

    public Players() {
        this.players=new ArrayList<>();
        this.sum=new ArrayList<>();
        this.noOfPlayers=0;
    }

    public Integer getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(Integer noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    private Integer noOfPlayers;
    private List<Player> players;
    private List<Integer> sum;



    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Integer> getSum() {
        return sum;
    }

    public void setSum(List<Integer> sum) {
        this.sum = sum;
    }
}
