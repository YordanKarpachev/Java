package DefiningClassesExercise.A02;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Department {
    String name;
    List<Employee> employees;

    public String getName() {
        return name;
    }

    public Department(String name) {
        this.name = name;
       this.employees = new ArrayList<>();

    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public double getAverageSalary () {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    }
}
