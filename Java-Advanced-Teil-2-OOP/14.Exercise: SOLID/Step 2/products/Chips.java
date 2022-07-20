package solid.products;

public class Chips extends Food implements Product {
    public static final double CALORIES_PER_100_GRAMS = 529.0;

    public Chips(double gram) {
        super(gram);

    }



    @Override
    public double amountOfCalories() {
        return (CALORIES_PER_100_GRAMS / 100) * getGram();
    }
}
