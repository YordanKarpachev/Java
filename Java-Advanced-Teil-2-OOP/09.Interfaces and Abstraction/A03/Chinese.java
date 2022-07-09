package A03;

public class Chinese implements Person{

    public Chinese(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
