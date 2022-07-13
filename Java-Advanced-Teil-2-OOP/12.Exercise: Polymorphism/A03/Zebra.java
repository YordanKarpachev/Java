package A03;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, Double fnimalWeight,String livingRegion) {
        super(animalName, animalType, fnimalWeight,  livingRegion);
        this.foodEaten = 0;
    }

    @Override
    void makeSound() {

        System.out.println("Zs");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        super.eat(food);
    }
}

