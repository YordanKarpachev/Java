package A04;

public class Topping {

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }


    private void setToppingType(String toppingType) {


        if (toppingType.equals("Meat") || toppingType.equals("Veggies") ||
                toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    private void setWeight(double weight) {

        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(this.toppingType +" weight should be in the range [1..50].");
        }

    }

    public double calculateCalories() {
        double multiply = wertBerechnen();
        double sum =( weight * 2) * multiply;
        return sum;
    }

    private double wertBerechnen() {

        switch (toppingType) {
            case "Meat":
                return 1.2;

                case "Veggies":
                    return 0.8;

            case "Sauce":
                return 0.9;

            case "Cheese":

                return 1.1;

            case "Homemade":

                return 1.0;

        } return 0;
    }

}
