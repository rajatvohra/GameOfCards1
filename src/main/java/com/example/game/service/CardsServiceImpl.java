package com.example.game.service;

import static java.lang.Integer.MIN_VALUE;
import com.example.game.entities.Deck;
import com.example.game.entities.Player;
import com.example.game.entities.Players;
import java.util.Collections;
import java.util.List;


public class CardsServiceImpl implements CardsService {
    @Override
    public Deck initializeDeck(Deck deck) {
        for(int i=0;i<4*deck.getNoOfDecks();i++){
            for(int j=1;j<=deck.getMaxCardValue();j++){
                deck.getDeck().add(j);
            }
        }
        for(int j=0;j<deck.getNoOfJokers();j++){
            deck.getDeck().add(deck.getJokerValue());
        }
        return deck;
    }
    @Override
    public Players initializePlayers(int noOfPlayers){
        Players players = new Players();
        List<Integer> sum = players.getSum();
        List<Player>playerList = players.getPlayers();
        for(int j =0;j<noOfPlayers;j++){
            sum.add(0);
            playerList.add(new Player());
        }
        players.setPlayers(playerList);
        players.setSum(sum);
        return players;
    }

    @Override
    public Deck shuffle(Deck deck) {
        Collections.shuffle(deck.getDeck());
        return deck;
    }

    @Override
    public void  giveCards(Deck deck, Players players, int noOfCardsToGive) {
        List<Integer>deckOfCards= deck.getDeck();
        int noOfPlayers = players.getNoOfPlayers();
        for(int i=0;i<noOfPlayers;i++){
            for(int j=0;j<noOfCardsToGive;j++){
                int cardValue = deckOfCards.get(deckOfCards.size()-1);
                deckOfCards.remove(deckOfCards.size()-1);
                players.getSum().set(i,players.getSum().get(i)+cardValue);
                players.getPlayers().get(i).getCards().add(cardValue);
            }
        }


    }



    @Override
    public int declareWinner(Players players) {
        int winner = MIN_VALUE;
        int ans=0,cnt=0;
        List<Integer> sums = players.getSum();
        for(int x:sums){
            if(winner<x){
                winner=x;
                ans=cnt;
            }
            cnt++;
        }
        return ans;
    }

    @Override
    public void showCards(Players players){
        for(int i=0;i<players.getNoOfPlayers();i++){
            System.out.println("Cards for Player " + (i+1)+  " are : \n");
            System.out.println(players.getPlayers().get(i).getCards());
        }
    }
    @Override
    public void showCards(Deck deck){
        System.out.println(deck.getDeck());
    }
}
