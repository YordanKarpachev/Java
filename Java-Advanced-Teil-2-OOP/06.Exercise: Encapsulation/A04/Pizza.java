package A04;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
    setName(name);
    setToppings(numberOfToppings);
    }

    public String getName() {
        return name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setName(String name) {
      if(name.isEmpty() || name.trim().isEmpty() ||  name.length() >= 15){
          throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
      } else {
          this.name = name;
      }
    }

    private void setToppings(int toppings){
        if(toppings >= 0 && toppings <= 10){
           this.toppings = new ArrayList<>();
        } else {
            throw  new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public void addTopping (Topping topping) {

        toppings.add(topping);
    }
    public double getOverallCalories () {
        double sum = toppings.stream().mapToDouble(value -> value.calculateCalories()).sum();

        return dough.calculateCalories() + sum;
    }
}
