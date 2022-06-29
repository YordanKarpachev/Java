package A03CardsWithPower;

public enum CardSuit {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);
    int suidPower;

    public int getSuidPower() {
        return suidPower;
    }

    CardSuit(int suidPower) {
        this.suidPower = suidPower;
    }
}
