package A02;

import java.text.DecimalFormat;

public  class vehiclesImpl implements vehicles {
    double fuelQuantity;
    double fuelConsumption;

    double tankCapacity;

    public vehiclesImpl(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    @Override
    public String driving(double km) {
        double fuelNeed = fuelConsumption * km;
        if (fuelNeed <= fuelQuantity) {
            this.fuelQuantity -= fuelNeed;
            DecimalFormat decimalFormat = new DecimalFormat("##.##");


            return String.format("%s travelled %s km", getClass().getSimpleName(), decimalFormat.format(km));
        }
        return getClass().getSimpleName() + " needs refueling";

    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void refueling(double liter) {
        if (liter <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        double current = liter + this.fuelQuantity;
        if (current > tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }

        this.fuelQuantity += liter;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
