package solid;

import solid.products.Chocolate;
import solid.products.Coke;
import solid.products.Lemonade;
import solid.products.Printer;

import java.util.List;

public class CalorieCalculator {

    private static final String SUM_FORMAT = "Sum: %f";
    private static final String AVERAGE_FORMAT = "Average: %f";
    Printer print;

    public CalorieCalculator() {
        this.print = new Printer();
    }

    public double sum(List<Object> products) {
        double sum = 0;

        for (Object product : products) {
            if (product instanceof Coke) {
                double grams = ((Coke) product).getMilliliters() * Coke.DENSITY;
                sum += (Coke.CALORIES_PER_100_GRAMS / 100) * grams;
            }

            if (product instanceof Lemonade) {
                double grams = ((Lemonade) product).getMilliliters() * Lemonade.DENSITY;
                sum += (Lemonade.CALORIES_PER_100_GRAMS / 100) * grams;
            }

            if (product instanceof Chocolate) {
                sum += (Chocolate.CALORIES_PER_100_GRAMS / 100) * ((Chocolate) product).getGrams();
            }
        }


        return sum;
    }

    public double average(List<Object> products) {

        return sum(products) / products.size();
    }

    public void print(String format, double sum) {
        print.print(format, sum);
    }
}