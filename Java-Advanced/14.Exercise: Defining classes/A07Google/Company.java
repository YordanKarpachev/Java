package DefiningClassesExercise.A07;

public class Company {

    String name;
    String department;
    Double salary;

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Company(String name, String department, Double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.name + " " + this.department + " " + String.format("%.2f", this.salary);
        // {companyName} {companyDepartment} {salary}
    }
}
