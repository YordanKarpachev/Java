package A03;

public class European implements Person{

    public European(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public String sayHello() {
        return "Hello";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
