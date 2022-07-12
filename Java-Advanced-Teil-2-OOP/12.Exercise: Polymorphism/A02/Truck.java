package A02;

public class Truck extends vehiclesImpl {

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {

        super(fuelQuantity, fuelConsumption + 1.6, tankCapacity);
    }

    @Override
    public void refueling(double liter) {
        super.refueling(liter * 0.95);
    }
}
