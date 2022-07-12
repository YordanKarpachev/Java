package A01;

import java.text.DecimalFormat;

public abstract class vehiclesImpl  implements vehicles {
    double fuelQuantity;
    double fuelConsumption;

    public vehiclesImpl(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String driving(double km) {
        double fuelNeed = fuelConsumption * km;
        if(fuelNeed <= fuelQuantity){
            this.fuelQuantity -= fuelNeed;
            DecimalFormat decimalFormat = new DecimalFormat("##.##");


            return String.format("%s travelled %s km",getClass().getSimpleName(), decimalFormat.format(km));
        }
        return getClass().getSimpleName()+ " needs refueling";

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
        this.fuelQuantity += liter;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
