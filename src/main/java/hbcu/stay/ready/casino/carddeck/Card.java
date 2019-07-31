package hbcu.stay.ready.casino.carddeck;

public class Card {
    private CardValueEnum cardValueEnum;
    private SuitEnum suitEnum;

    public Card(CardValueEnum cardValueEnum, SuitEnum suitEnum){
        this.cardValueEnum = cardValueEnum;
        this.suitEnum = suitEnum;
    }

    public CardValueEnum getCardValueEnum() {
        return cardValueEnum;
    }

    public void setCardValueEnum(CardValueEnum cardValueEnum) {
        this.cardValueEnum = cardValueEnum;
    }

    public SuitEnum getSuitEnum() {
        return suitEnum;
    }

    public void setSuitEnum(SuitEnum suitEnum) {
        this.suitEnum = suitEnum;
    }
}
