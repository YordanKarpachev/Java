package DefiningClassesExercise.A07;

public class Car {
    String model;
    int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return this.model+  " " + this.speed ;
    }
}
