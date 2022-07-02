package T06ExerciseEncapsulation.A03ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    private void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    @Override
    public String toString() {

        return products.isEmpty() ? getName() + " – Nothing bought" :
                getName()  + " – " + String.join(", ", products.toString()).replaceAll("\\[", "").replaceAll("]", "");
    }

    public String getName() {
        return name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.money = money;
        }
    }

    public void buyProduct(Product product) {
        if (this.money >= product.getCost()) {
            products.add(product);
            money -= product.getCost();
            System.out.printf("%s bought %s%n", getName(), product.getName());

        } else {
            String message = String.format("%s can't afford %s%n", getName(), product.getName());
            throw new IllegalArgumentException(message);
        }
    }

}

