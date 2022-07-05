package animals;

public class Kitten extends Cat{
    private static final String     gendern = "Female";

    public Kitten(String name, int age, String gender) {
        super(name, age, gendern);
    }

    public Kitten(String name, int age) {
        super(name, age, gendern);
    }
    @Override
    public String produceSound() {
        return "Meow";
    }
}
