package A04;

public class SportCar extends Car{
    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
    private  final static double DEFAULT_FUEL_CONSUMPTION = 10;
}
