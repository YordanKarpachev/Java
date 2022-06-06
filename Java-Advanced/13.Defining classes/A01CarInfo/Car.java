package A01;

public class Car {
   private String Brand;
    private String Model;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getHorsepower() {
        return Horsepower;
    }

    public void setHorsepower(int horsepower) {
        Horsepower = horsepower;
    }

    private int Horsepower;

    public String carInfo(){
        return String.format("The car is: %s %s - %d HP.", getBrand(),getModel(), getHorsepower() );
    }
}
