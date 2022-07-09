package A04;

public abstract class BasePerson implements Person {
  private   String name;
    public String getName(){
        return this.name;
    }

    protected BasePerson(String name) {
        this.name = name;
    }
}
