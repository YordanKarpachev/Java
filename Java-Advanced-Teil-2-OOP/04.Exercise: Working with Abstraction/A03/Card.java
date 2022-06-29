package A03CardsWithPower;

public class Card {
    CardSuit cardSuit;
    CardRanks cardRanks;
    int power;

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public CardRanks getCardRanks() {
        return cardRanks;
    }

    public void setCardRanks(CardRanks cardRanks) {
        this.cardRanks = cardRanks;
    }

    public int getPower() {
        return this.cardSuit.suidPower + this.cardRanks.cardPower;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Card(CardSuit cardSuit, CardRanks cardRanks) {
        this.cardSuit = cardSuit;
        this.cardRanks = cardRanks;

    }
}
