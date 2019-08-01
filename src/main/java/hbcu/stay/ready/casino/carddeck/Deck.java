package hbcu.stay.ready.casino.carddeck;

import java.util.Collections;
import java.util.Stack;

public class Deck {
    private Stack<Card> cards;

    public Deck(){
       cards = new Stack<Card>();
       buildDeck();
    }

    private void buildDeck(){
        for(SuitEnum suit: SuitEnum.values()){
            Stack<Card> suitCards = buildCardsBySuitValue(suit);
            cards.addAll(suitCards);
        }
    }

    private Stack<Card> buildCardsBySuitValue(SuitEnum suitEnum){
        Stack<Card> cards = new Stack<Card>();
        for (CardValueEnum cardValueEnum: CardValueEnum.values()){
            Card card = new Card(cardValueEnum, suitEnum);
            cards.add(card);
        }
        return cards;
    }

    public Stack<Card> getCards(){
        return cards;
    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }

    public Card peekAtTopCard(){
        return cards.get(0);
    }

    public Card takeTopCard(){
        return cards.pop();
    }

}
