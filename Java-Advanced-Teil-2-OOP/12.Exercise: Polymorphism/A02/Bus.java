package A02;

import java.text.DecimalFormat;

public class Bus extends vehiclesImpl{
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.4, tankCapacity);
    }
    public String drivingEmpty(double km) {
        double fuelNeed = (fuelConsumption - 1.4) * km;
        if (fuelNeed <= fuelQuantity) {
            this.fuelQuantity -= fuelNeed;
            DecimalFormat decimalFormat = new DecimalFormat("##.##");


            return String.format("%s travelled %s km", getClass().getSimpleName(), decimalFormat.format(km));
        }
        return getClass().getSimpleName() + " needs refueling";

    }
}
