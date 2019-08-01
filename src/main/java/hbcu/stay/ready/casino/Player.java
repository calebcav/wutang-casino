package hbcu.stay.ready.casino;
import hbcu.stay.ready.casino.carddeck.*;

import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;
    private Integer sets;

    public Player(String name){
        this.name = name;
        hand = new ArrayList<Card>();
    }

    public Player(){
        this.name = "Steve";
    }

    public String getString(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Card> getHand(){
        return hand;
    }

    public void setHand(ArrayList<Card> hand){
        this.hand = hand;
    }

    public void addHand(Card card){
        hand.add(card);
    }

    public void printHand(){
        System.out.println("----------");
        for (int i = 0; i < hand.size(); i ++){
            System.out.println("[" + hand.get(i).getCardValueEnum() + " of " + hand.get(i).getSuitEnum() + "]");
        }
        System.out.println("----------");
    }

    public void addToSet(){
        sets ++;
    }

    public void addAllToHand(ArrayList<Card> cards){
        hand.addAll(cards);
    }




}
