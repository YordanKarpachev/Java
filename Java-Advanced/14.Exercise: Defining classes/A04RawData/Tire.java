package DefiningClassesExercise.A04;

public class Tire {
    private double pressure;
    private int age;

    public double getPressure() {
        return pressure;
    }

    public Tire(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;
    }
}
