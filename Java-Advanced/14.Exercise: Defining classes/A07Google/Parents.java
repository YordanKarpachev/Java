package DefiningClassesExercise.A07;

public class Parents {
    String name;
    String birthday;

    @Override
    public String toString() {
        return  name +" " + birthday;
    }

    public Parents(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
