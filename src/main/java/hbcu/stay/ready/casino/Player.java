package hbcu.stay.ready.casino;
import hbcu.stay.ready.casino.carddeck.*;

import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        hand = new ArrayList<Card>();
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
}
