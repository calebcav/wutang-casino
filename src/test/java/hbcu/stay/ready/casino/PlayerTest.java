package hbcu.stay.ready.casino;
import hbcu.stay.ready.casino.carddeck.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PlayerTest {

    private Deck deck;
    private Player player;

    @Before


    public void setUp(){
        deck = new Deck();
        player = new Player("Caleb");
    }

    @Test
    public void getStringTest(){

        String actual = player.getString();
        String expected = "Caleb";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setStringTest(){

        player.setName("George");

        String actual = player.getString();
        String expected = "George";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHandTest(){

        player.addHand(deck.takeTopCard());
        player.addHand(deck.takeTopCard());

        Integer actual = player.getHand().size();
        Integer expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setHandTest(){

        ArrayList<Card> randomHand = new ArrayList<Card>();

        randomHand.add(deck.takeTopCard());
        randomHand.add(deck.takeTopCard());
        player.setHand(randomHand);

        Integer actual = player.getHand().size();
        Integer expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addHandTest(){

        player.addHand(deck.takeTopCard());

        Integer actual = player.getHand().size();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAllHandToTest(){

        ArrayList<Card> randomHand = new ArrayList<Card>();

        randomHand.add(deck.takeTopCard());
        randomHand.add(deck.takeTopCard());
        player.addAllToHand(randomHand);

        Integer actual = player.getHand().size();
        Integer expected = 2;

        Assert.assertEquals(expected, actual);


    }


}
