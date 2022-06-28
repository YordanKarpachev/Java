
import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentMap;

    public StudentSystem() {
        this.studentMap = new HashMap<>();
    }

    public Map<String, Student> getStudentMap() {
        return this.studentMap;
    }

    public void ParseCommand(String[] input) {

        String name = input[1];
        String commmand = input[0];
        switch (commmand) {
            case "Create":

                int age = Integer.parseInt(input[2]);
                double grade = Double.parseDouble(input[3]);
                if (!studentMap.containsKey(name)) {
                    Student student = new Student(name, age, grade);
                    studentMap.put(name, student);
                }
                break;

            case "Show":


                if (studentMap.containsKey(name)) {
                    Student student = studentMap.get(name);
                    String view = String.format("%s is %s years old.", student.getName(), student.getAge());

                    if (student.getGrade() >= 5.00) {
                        view += " Excellent student.";
                    } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                        view += " Average student.";
                    } else {
                        view += " Very nice person.";
                    }

                    System.out.println(view);
                }
                break;
        }
    }
}

