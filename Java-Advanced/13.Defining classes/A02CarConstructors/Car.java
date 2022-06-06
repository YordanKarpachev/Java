package A02;

public class Car {

    public Car (String brand){
        this.Brand = brand;
        this.Horsepower = -1;
        this.Model = "unknown";
    }


    public Car(String brand, String model, int horsepower) {
        this(brand);
        Model = model;
        Horsepower = horsepower;
    }


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
