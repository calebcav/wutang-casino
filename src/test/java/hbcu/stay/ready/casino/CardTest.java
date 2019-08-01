package hbcu.stay.ready.casino;
import hbcu.stay.ready.casino.carddeck.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CardTest {




    @Test
    public void getCardValueEnumTest(){
        Card card = new Card(CardValueEnum.ACE, SuitEnum.DIAMONDS);

        Assert.assertEquals(CardValueEnum.ACE, card.getCardValueEnum());
    }

    @Test
    public void setCardValueEnumTest(){
        Card card = new Card(CardValueEnum.ACE, SuitEnum.DIAMONDS);
        card.setCardValueEnum(CardValueEnum.KING);

        Assert.assertEquals(CardValueEnum.KING, card.getCardValueEnum());
    }

    @Test
    public void getCardSuitEnumTest(){
        Card card = new Card(CardValueEnum.ACE, SuitEnum.DIAMONDS);

        Assert.assertEquals(SuitEnum.DIAMONDS, card.getSuitEnum());
    }

    @Test
    public void setCardSuiteEnumTest(){
        Card card = new Card(CardValueEnum.ACE, SuitEnum.DIAMONDS);
        card.setSuitEnum(SuitEnum.HEARTS);

        Assert.assertEquals(SuitEnum.HEARTS, card.getSuitEnum());
    }


}
