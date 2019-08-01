package hbcu.stay.ready.casino.games;
import hbcu.stay.ready.casino.Player;
import hbcu.stay.ready.casino.carddeck.*;
import hbcu.stay.ready.casino.utilities.Console;

import java.util.*;

public class GoFish extends CardGame {

    private Deck deck = new Deck();
    private Player playerOne;
    private Player playerTwo;
    private Player dealer = new Player("Dealer");

    public GoFish(Console console, Player playerOne){

        super(console, playerOne);
    }


    public void playGame() {
        deck = new Deck();
        deck.shuffleCards();
        playerOne = new Player();
        playerTwo = new Player();


        console.println("Welcome to Go Fish");
        console.println("You just drew seven cards");
        playerOne.printHand();

        for(int i = 0; i < 7; i ++){
            playerOne.addHand(deck.takeTopCard());
        }
        while (deck.getCards().size() > 0){
            if (checkDictionary(createDictionary(playerOne.getHand()))){
                playerOne.addToSet();
            }
            String input = console.getStringInput("Do you have any...");
            playerOne.addAllToHand(ask(askValue(input), playerOne));





        }



    }

    public String info() {

        return "Go Fish!";
    }



    private static HashMap<String, Integer> createDictionary(ArrayList<Card> hand){

        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();

        for (int i = 0; i < hand.size(); i ++){
            String card = hand.get(i).getCardValueEnum().toString();
            if(!dictionary.containsKey(card)){
                dictionary.put(card, 1);
            }
            else{
                dictionary.put(card, dictionary.get(card) + 1);
            }
        }
        return dictionary;
    }


    private static boolean checkDictionary(HashMap<String, Integer> map){

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getValue() == 4){
                return true;
            }
        }
        return false;
    }


    public ArrayList<Card> ask(CardValueEnum value, Player player){

        ArrayList<Card> list = player.getHand();
        ArrayList<Card> expectedList = new ArrayList<Card>();

        for (int i = 0; i < list.size(); i ++){
            if (list.get(i).getCardValueEnum() == value){
                expectedList.add(list.get(i));
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
        return null;

    }










}