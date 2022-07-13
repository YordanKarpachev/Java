package A03;

public class Tiger extends Felime{
    public Tiger(String animalName, String animalType, Double fnimalWeight,  String livingRegion) {
        super(animalName, animalType, fnimalWeight, livingRegion);
        this.foodEaten = 0;
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eat(food);
    }
}
