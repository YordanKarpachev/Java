package A04;

public class Citizen implements Person,  Identifiable, Buyer {
    private String name;
    private int age;

    private String id;

    private String birthDate;

    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }



    @Override
    public String getId() {
        return this.id;
    }

    public int getFood() {
        return food;
    }

    public void buyFood(){
    this.food += 10;

    }


}
