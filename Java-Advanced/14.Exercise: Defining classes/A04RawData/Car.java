package DefiningClassesExercise.A04;

import java.util.List;

public class Car {
  private   Model model;
   private Engine engine;
   private Cargo cargo;

    public Model getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public Car(Model model, Engine engine, Cargo cargo, List<Tire> tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    private List<Tire> tires;
}
