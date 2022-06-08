package DefiningClassesExercise.A05;

public class Engine {
    private String model;
    int power;
    private int displacement;  //Leistung
    private String efficiency = "n/a";

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;


    }

    public Engine(String model, int power, int displacement) {
        this(model, power);
        this.displacement = displacement;

    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int  getDisplacement() {

 return this.displacement;
    }

    public String getEfficiency() {
        return this.efficiency;
    }

    public Engine(String model, int power, String efficiency) {
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;

    }
}
