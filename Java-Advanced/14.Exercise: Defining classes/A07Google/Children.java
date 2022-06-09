package DefiningClassesExercise.A07;

public class Children {
    String name;
    String birthday;

    @Override
    public String toString() {
        return name + " " + birthday;
    }

    public Children(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
