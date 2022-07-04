package A04;

public class RaceMotorcycle extends Motorcycle {
    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
    private  final static double DEFAULT_FUEL_CONSUMPTION = 8;
}
