package solid;

import solid.products.*;

import java.util.List;

public class CalorieCalculator {

    private static final String SUM_FORMAT = "Sum: %f";
    private static final String AVERAGE_FORMAT = "Average: %f";
    Printer print;

    public CalorieCalculator() {
        this.print = new Printer();
    }

    public double sum(List<Product> products) {
        return products.stream()
                .map(Product::amountOfCalories)
                .reduce(0.0, Double::sum);
    }

    public double average(List<Product> products) {

        return sum(products) / products.size();
    }

    public void print(String format, double sum) {
        print.print(format, sum);
    }
}