package A02;

public class Car extends vehiclesImpl{

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {

        super(fuelQuantity, fuelConsumption + 0.9, tankCapacity);
    }



}
