package A03;

public class Mouse extends Mammal{
    public Mouse(String animalName, String animalType, Double fnimalWeight, String livingRegion) {
        super(animalName, animalType, fnimalWeight,  livingRegion);
        this.foodEaten = 0;
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    void eat(Food food) {

        if(food instanceof Meat){
            throw  new IllegalArgumentException("Mice are not eating that type of food!");
        }
        super.eat(food);
    }
}
