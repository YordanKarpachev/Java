package T09InterfacesandAbstraction.A01;

import java.io.Serializable;

public class Seat implements Car, Serializable{
    String model;
    String color;
    Integer horsePower;
    String countryProduced;

    public Seat(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduced;
    }

    @Override
    public String toString() {
        return (String.format(
                "%s is %s color and have %s horse power%n" +
                        "This is %s produced in %s and have %d tires",
               getModel(),
              getColor(),
               getHorsePower(), getModel(), countryProduced(), TIRES));
    }
}