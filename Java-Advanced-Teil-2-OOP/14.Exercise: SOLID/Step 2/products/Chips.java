package solid.products;

public class Chips implements Product {
    public static final double CALORIES_PER_100_GRAMS = 529.0;
    private double grams;

    public Chips(double gram) {
        this.grams = gram;
    }

    public double getGram() {
        return grams;
    }

    @Override
    public double amountOfCalories() {
        return (CALORIES_PER_100_GRAMS / 100) * grams;
    }
}
