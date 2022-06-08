package DefiningClassesExercise.A04;

public class Cargo {
    private String type;

    public String getType() {
        return type;
    }

    private int weight ;

    public Cargo(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }
}
