package DefiningClassesExercise.A02;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Department> emplooye = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String pos = input[2];
            String departmen = input[3];
            int age;
            String email;
            Employee employee;

            if (input.length == 6) {
                email = input[4];
                age = Integer.parseInt(input[5]);
                employee = new Employee(name, salary, pos, departmen, email, age);
                emplooye.putIfAbsent(departmen, new Department(departmen));
                Department department = emplooye.get(departmen);
                department.employees.add(employee);



            } else if (input.length == 4) {
                employee = new Employee(name, salary, pos, departmen);
                emplooye.putIfAbsent(departmen, new Department(departmen));
                Department department = emplooye.get(departmen);
                department.employees.add(employee);

            } else if (input.length == 5) {
                String unbekannt = input[4];
                if (unbekannt.length() != 2) {
                    employee = new Employee(name, salary, pos, departmen, unbekannt);
                    emplooye.putIfAbsent(departmen, new Department(departmen));
                    Department department = emplooye.get(departmen);
                    department.employees.add(employee);

                } else {
                    age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, pos, departmen, age);
                    emplooye.putIfAbsent(departmen, new Department(departmen));
                    Department department = emplooye.get(departmen);
                    department.employees.add(employee);
                }


            }

        }
        System.out.println();
        //Highest Average Salary: Development
        Optional<Map.Entry<String, Department>> max = emplooye.entrySet().stream().max(Comparator.comparing(e -> e.getValue().getAverageSalary()));
        String key = max.get().getKey();
        System.out.println("Highest Average Salary: "+ key);
       emplooye.get(key).getEmployees()
               .stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
               .forEach(a -> System.out.printf("%s %.2f %s %d%n", a.getName(), a.getSalary(), a.getEmail(), a.getAge()));



    }
}
