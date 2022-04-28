package ObjekteUndKLassenExercisse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A05Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            Student student = new Student(data[0], data[1], Double.parseDouble(data[2]));
            students.add(student);


        }
        students.stream().sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade())).forEach(a -> System.out.println(a.toString()));
    }


    static class Student {
        String name;
        String lastName;
        double grade;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }

        public Student(String name, String lastName, double grade) {
            this.name = name;
            this.lastName = lastName;
            this.grade = grade;

        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", getName(), getLastName(), getGrade());
        }
    }

}
