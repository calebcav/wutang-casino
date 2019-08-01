package hbcu.stay.ready.casino.games;
import hbcu.stay.ready.casino.Player;
import hbcu.stay.ready.casino.carddeck.*;
import hbcu.stay.ready.casino.utilities.Console;

import java.util.*;
import java.util.logging.Logger;

public class GoFish extends CardGame {

    private Deck deck = new Deck();
    private Player playerOne = new Player();
    private Player playerTwo = new Player();


    public GoFish(Console console, Player playerOne){

        super(console, playerOne);
    }


    public void playGame() {
        deck = new Deck();
        deck.shuffleCards();
        playerTwo = new Player();


        console.println("Welcome to Go Fish");
        console.println("You just drew seven cards");

        for(int i = 0; i < 7; i ++){
            playerOne.addHand(deck.takeTopCard());
            playerTwo.addHand(deck.takeTopCard());
        }
        while (deck.getCards().size() > 0){
            if (checkDictionary(createDictionary(playerOne.getHand()))){
                playerOne.addToBooks();
            }

            if (checkDictionary(createDictionary(playerTwo.getHand()))){
                playerTwo.addToBooks();
            }
            playerOne.printHand();
            playerTwo.printHand();
            String input = console.getStringInput("Do you have any...");

            ArrayList<Card> cardRequest = ask(askValue(input), playerTwo);
            System.out.println(cardRequest + " is what you wanted");



            if (cardRequest.size() > 0){
                playerOne.addAllToHand(cardRequest);
            }
            else{
                console.println("Go Fish Pussy");
                playerOne.addHand(deck.takeTopCard());
            }



            CardValueEnum playerTwoInput = lookingForCard(createDictionary(playerTwo.getHand()));


            ArrayList<Card> playerTwoCardRequest = ask(playerTwoInput, playerOne);



            if (playerTwoCardRequest.size() > 0){
                playerTwo.addAllToHand(playerTwoCardRequest);
            }
            else{
                console.println("Player Two draws Card");
                playerTwo.addHand(deck.takeTopCard());
            }
        }

        if (playerOne.getBooks() > playerTwo.getBooks()){
            console.println("Player One wins!");
        }
        else if (playerTwo.getBooks() > playerOne.getBooks()){
            console.println("Player Two wins!");
        }
        else{
            console.println("Tie");
        }
    }

    public String info() {

        return "Go Fish!";
    }

    private static HashMap<CardValueEnum, Integer> createDictionary(ArrayList<Card> hand){

        HashMap<CardValueEnum, Integer> dictionary = new HashMap<CardValueEnum, Integer>();

        for (int i = 0; i < hand.size(); i ++){
            CardValueEnum card = hand.get(i).getCardValueEnum();
            if(!dictionary.containsKey(card)){
                dictionary.put(card, 1);
            }
            else{
                dictionary.put(card, dictionary.get(card) + 1);
            }
        }
        return dictionary;
    }


    private static boolean checkDictionary(HashMap<CardValueEnum, Integer> map){

        for (Map.Entry<CardValueEnum, Integer> entry: map.entrySet()){
            if (entry.getValue() == 4){
                return true;
            }
        }
        return false;
    }

    private static CardValueEnum lookingForCard(HashMap<CardValueEnum, Integer> map){
        int greatestValue = 0;
        CardValueEnum greatestCard = null;
        for(Map.Entry<CardValueEnum, Integer> entry: map.entrySet()){
            if (entry.getValue() > greatestValue){
                greatestCard = entry.getKey();
                greatestValue = entry.getValue();
            }
        }
        return greatestCard;
    }


    public ArrayList<Card> ask(CardValueEnum value, Player player){

        ArrayList<Card> expectedList = new ArrayList<Card>();

        for (int i = 0; i < player.getHand().size(); i ++){
            if (player.getHand().get(i).getCardValueEnum() == value){
                expectedList.add(player.getHand().get(i));
                player.getHand().remove(i);
            }
        }

        return expectedList;
    }


    public CardValueEnum askValue(String value){

        if(value == "2"){
            return CardValueEnum.TWO;
        }
        else if (value == "3"){
            return CardValueEnum.THREE;
        }
        else if (value == "4"){
            return CardValueEnum.FOUR;
        }
        else if (value == "5"){
            return CardValueEnum.FIVE;
        }
        else if (value == "6"){
            return CardValueEnum.SIX;
        }
        else if (value == "7"){
            return CardValueEnum.SEVEN;
        }
        else if (value == "8"){
            return CardValueEnum.EIGHT;
        }
        else if (value == "9"){
            return CardValueEnum.NINE;
        }
        else if (value == "10"){
            return CardValueEnum.TEN;
        }
        else if (value == "Jack"){
            return CardValueEnum.JACK;
        }
        else if (value == "Queen"){
            return CardValueEnum.QUEEN;
        }
        else if (value == "King"){
            return CardValueEnum.KING;
        }
        else if (value == "Ace"){
            return CardValueEnum.ACE;
        }
        return null;

    }










}