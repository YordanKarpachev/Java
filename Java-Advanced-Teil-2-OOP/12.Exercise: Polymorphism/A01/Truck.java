package A01;

public class Truck extends vehiclesImpl{

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 1.6);
    }

    @Override
    public void refueling(double liter) {
        super.refueling(liter * 0.95);
    }
}
