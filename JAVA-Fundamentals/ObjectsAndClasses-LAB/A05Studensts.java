package ObjekteUndKlassenLAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A05Studensts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String stadt = data[3];

            Student student = new Student();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setHomeTown(stadt);
            if (isStudentExisting(students, firstName, lastName)) {
                Student student1 = getStudent(students, firstName, lastName);
                   student1.setFirstName(firstName);
                   student1.setLastName(lastName);
                   student1.setAge(age);
                   student1.setHomeTown(stadt);

            } else {
                students.add(student);
            }

            input = scanner.nextLine();
        }

        String stadt = scanner.nextLine();
        for (Student student : students) {
            if (student.getHomeTown().equals(stadt)) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + " is " + student.getAge() + " years old");
            }
        }
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;
        for (Student student: students){
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                existingStudent = student;
            }
        } return existingStudent;
    }

    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }

        }
        return false;
    }



static class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getHomeTown() {
        return homeTown;
    }

}
    }
