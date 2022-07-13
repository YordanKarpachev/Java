package A03;

import java.text.DecimalFormat;

public class Cat extends Felime{
    String bread;

    public Cat(String animalName, String animalType, Double fnimalWeight,  String livingRegion, String bread) {
        super(animalName, animalType, fnimalWeight, livingRegion);
        this.bread = bread;
        this.foodEaten = 0;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }
    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %s, %d]",getAnimalType(), getAnimalName(), this.bread,decimalFormat.format(getAnimalWeight()), this.livingRegion, getFoodEaten());
    }

}
