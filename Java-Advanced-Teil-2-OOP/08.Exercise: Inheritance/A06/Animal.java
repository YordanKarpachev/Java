package animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String produceSound() {
        return null;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(System.lineSeparator()).append(this.name);
        sb.append(" ");
        sb.append(this.age).append(" ").append(this.gender).append(System.lineSeparator()).append(produceSound());
        return sb.toString();
    }

    public void setGender(String gender) {
        if (gender.equals("Female") || gender.equals("Male")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }

    }
}

