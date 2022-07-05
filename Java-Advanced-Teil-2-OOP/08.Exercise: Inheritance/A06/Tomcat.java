package animals;

public class Tomcat extends Cat{
    private static final String     gendern = "Male";
    public Tomcat(String name, int age) {
        super(name, age, gendern);
    }

    public Tomcat(String name, int age, String gender) {
        super(name, age, gendern);
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
