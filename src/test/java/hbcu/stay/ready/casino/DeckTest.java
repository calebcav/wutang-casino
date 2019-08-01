package hbcu.stay.ready.casino;
import hbcu.stay.ready.casino.carddeck.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeckTest {

    private Deck deck;
    @Before
    public void setUp(){
        deck = new Deck();
    }

    @Test
    public void getCardsTest(){
        Integer expected = 52;
        Integer actual = deck.getCards().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shuffleCardsTest(){
        Card firstCard = deck.peekAtTopCard();
        deck.shuffleCards();
        Card secondCard = deck.peekAtTopCard();

        Assert.assertNotEquals(firstCard, secondCard);
    }

    @Test
    public void takeTopCardTest(){
        Card firstCard = deck.takeTopCard();
        Card secondCard = deck.takeTopCard();

        Assert.assertNotEquals(firstCard, secondCard);
    }



}
