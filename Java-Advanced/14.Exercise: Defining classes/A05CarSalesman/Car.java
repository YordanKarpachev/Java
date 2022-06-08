package DefiningClassesExercise.A05;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public Car(String model, Engine engine, int weight) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = "n/a";
    }

    public int getWeight() {
        return this.weight;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(
                this.model + ":%n" +
                engine.getModel() + ":%n" +
                "Power: " + engine.getPower() +
                "%nDisplacement: " + (engine.getDisplacement() != 0 ? engine.getDisplacement() : "n/a") +
                "%nEfficiency: " + engine.getEfficiency() +
                "%nWeight: " + (weight > 0 ? weight : "n/a") +
                "%nColor: " + color);



    }
}