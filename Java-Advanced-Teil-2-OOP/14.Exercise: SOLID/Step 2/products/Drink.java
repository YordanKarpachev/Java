package solid.products;

public class Drink {

    private final double DENSYTY;

    public double getDENSYTY() {
        return DENSYTY;
    }

    private double milliliters;

    public double getMilliliters() {
        return milliliters;
    }

    public Drink(double densyty, double mililiters) {
        DENSYTY = densyty;
        this.milliliters = mililiters;

    }
    public double getDrinkAmountLiter(){
        return (1000 /this.getMilliliters()) * DENSYTY;
    }
}
