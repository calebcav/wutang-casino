package hbcu.stay.ready.casino;

import hbcu.stay.ready.casino.carddeck.CardValueEnum;
import hbcu.stay.ready.casino.games.GoFish;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.casino.utilities.Console;
import hbcu.stay.ready.casino.carddeck.*;
import java.util.*;

public class GoFishTest {

    private Player playerOne = new Player("Chief");
    private Console console = new Console(System.in, System.out);
    private GoFish goFish = new GoFish(console, playerOne);
    private Player dealer = new Player("Dealer");


    @Test
    public void infoTest(){
        GoFish goFish = new GoFish(console, playerOne);
        String actual = goFish.info();
        String expected = "Go Fish!";

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void askValueTest(){
        GoFish goFish = new GoFish(console, playerOne);
        CardValueEnum actual = goFish.askValue("3");

        CardValueEnum expected = CardValueEnum.THREE;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void askTest(){

        Deck deck = new Deck();
        playerOne.addHand(deck.takeTopCard());
        playerOne.addHand(deck.takeTopCard());
        playerOne.addHand(deck.takeTopCard());
        playerOne.addHand(deck.takeTopCard());

        Integer actual = goFish.ask(CardValueEnum.JACK, playerOne).size();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAllToHandTest(){

        Deck deck = new Deck();

        dealer.addHand(deck.takeTopCard());
        dealer.addHand(deck.takeTopCard());
        dealer.addHand(deck.takeTopCard());
        dealer.addHand(deck.takeTopCard());

        playerOne.addAllToHand(dealer.getHand());

        Integer actual = playerOne.getHand().size();
        Integer expected = 4;

        Assert.assertEquals(expected, actual);
    }




}
