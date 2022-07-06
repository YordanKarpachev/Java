package T09InterfacesandAbstraction.A02;

public class Audi extends CarImpl implements  Rentable {

    private Integer minRentDay;
    private double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer rentminday, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.pricePerDay = pricePerDay;
        this.minRentDay = rentminday;
    }


    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        String result = String.format("%s%nMinimum rental period of %d days. Price per day %f",
                super.toString(),
                this.getMinRentDay(),
                this.getPricePerDay());
        return result;
    }
}
