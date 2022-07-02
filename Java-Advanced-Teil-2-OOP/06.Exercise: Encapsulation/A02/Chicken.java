package A02;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    private void setAge(int age) {
        if (age >= 0 && age <= 15) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", getName(), getAge(), calculateProductPerDay());
    }

    private double calculateProductPerDay() {
        // • First 6 years it produces 2 eggs per day [0 - 5].
        // • Next 6 years it produces 1 egg per day [6 - 11].
        // • And after that, it produces 0.75 eggs per day.
        if (getAge() >= 0 && getAge() <= 5) {
            return 2;
        } else if (getAge() >= 6 && getAge() <= 11) {
            return 1;
        } else if (getAge() > 11) {
            return 0.75;
        }
        return 0;
    }
}
