package A03;

import java.text.DecimalFormat;

public abstract class Mammal  extends  Animal{
    String livingRegion;

    public Mammal(String animalName, String animalType, Double fnimalWeight, String livingRegion) {
        super(animalName, animalType, fnimalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]",getAnimalType(), getAnimalName(),decimalFormat.format(getAnimalWeight()), this.livingRegion, getFoodEaten());
    }
}
