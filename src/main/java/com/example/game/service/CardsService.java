package com.example.game.service;

import com.example.game.entities.Deck;
import com.example.game.entities.Players;

public interface CardsService {

    Deck initializeDeck(Deck deck);

    Players initializePlayers(int noOfPlayers);

    Deck shuffle(Deck deck);

    void  giveCards(Deck deck, Players players, int noOfCardsToGive);

    int declareWinner(Players players);

    void showCards(Players players);
    void showCards(Deck deck);
}
