package com.example.game;

import com.example.game.entities.Deck;
import com.example.game.entities.Players;
import com.example.game.service.CardsService;
import com.example.game.service.CardsServiceImpl;
import java.util.Scanner;


class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Game  ");
        CardsService cardService = new CardsServiceImpl();
        Deck deck = new Deck();
        int noOfPlayers=0;
        Players players = new Players();


        outer : while(true){

            System.out.println("Please choose from the following options : \n");
            System.out.println("1 : Start the Game \n");
            System.out.println("2 : Shuffle the com.example.game.entities.Deck\n");
            System.out.println("3 : Give Cards\n");
            System.out.println("4 : Declare a Winner\n");
            System.out.println("5 : Display Cards of Players \n");
            System.out.println("6 : Display Deck \n");
            System.out.println("7 : Exit\n");
            switch(sc.nextInt()){
                case 1:
                    System.out.println("You selected to start the Game ");


                    //validate

                    System.out.println("Select no of com.example.game.entities.Players : ");
                    noOfPlayers =sc.nextInt();
                    if(noOfPlayers<0){
                        //throw error
                    }
                    else{
                        players = cardService.initializePlayers(noOfPlayers);
                        players.setNoOfPlayers(noOfPlayers);
                    }
                    System.out.println("Select no of Jokers : ");
                    int noOfJokers =sc.nextInt();
                    deck.setNoOfJokers(noOfJokers);
                    if(noOfJokers>0){
                        System.out.println("Select a value for Joker : ");
                        int jokerValue =sc.nextInt();
                        deck.setJokerValue(jokerValue);
                    }
                    deck = cardService.initializeDeck(deck);

                    //do logic
                    break;
                case 2:
                    System.out.println("You selected to Shuffle the com.example.game.entities.Deck ");
                    deck = cardService.shuffle(deck);
                    //do logic
                    break;
                case 3:
                    System.out.println("You selected to Give Cards ");
                    System.out.println("Select no Of Cards to give ");
                    int noOfCardsToGive = sc.nextInt();
                    if(noOfCardsToGive*noOfPlayers>deck.getDeck().size()){
                        //throw error
                    }
                    else{
                        cardService.giveCards(deck,players,noOfCardsToGive);
                    }
                    //do logic
                    break;
                case 4:
                    System.out.println("You selected to Declare a Winner ");
                    int ind = cardService.declareWinner(players);
                    ind++;
                    System.out.println("The Winner is com.example.game.entities.Player"+ind);
                    //do logic
                    break ;
                case 5:
                    System.out.println("You selected to Show Cards of Players \n");
                    cardService.showCards(players);
                    break ;
                case 6:
                    System.out.println("You selected to Show Cards");
                    cardService.showCards(deck);
                    break ;
                case 7:
                    System.out.println("You selected to Exit the Game ");
                    //do logic
                    break outer;
                default:
                    System.out.println("Your selection was incorrect, please choose again ");
                    break;

            }
        }

    }
}