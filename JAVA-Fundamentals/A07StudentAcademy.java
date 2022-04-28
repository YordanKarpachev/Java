package AssociaciveArraysExercise;

import java.util.*;

public class A07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());

        //studen -> spisuk s ocenki
        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 0; i < countStudents; i++) {
            String studentname = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            //Studentut go nqma v spisaka
            if (!studentGrades.containsKey(studentname)) {
               studentGrades.put(studentname, new ArrayList<>());

            }
            studentGrades.get(studentname).add(grade);   //ako studenta e v spisaka
        }
        //studen -> sredna ocenka
        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();  // studentite sas sredna ocenka >= 4.50


        //tursim srednata ocenka na vsi4ki studenti
        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            //entry -> ime (string) + spisak s ocenki (list<double>)

            String studentName = entry.getKey();

            //vzimame spisaka s ocenki ot uchenika
            List<Double> grades = entry.getValue();

            double averageGrade = getAverageGrade (grades);
            if (averageGrade >= 4.50) {
                studentAverageGrade.put(studentName, averageGrade);
            }


        }
        //razmenqmae zapisite ako na vtoriq ocenkata e po goliama ot ocenkata na purviq
        studentAverageGrade.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> grades) {
        double sumGrades = 0;
        for (double grade : grades) {
            sumGrades += grade;

        }
        return  sumGrades / grades.size();
    }
}
