package SetsandMapsAdvanced;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class A08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int n = Integer.parseInt(scanner.nextLine());

        Map<String , double[]> students = new TreeMap<>();
        for (int i = 0; i <n  ; i++) {
            String name = scanner.nextLine();

            double[] grades = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            students.put(name , grades);
        }

        students.forEach((key, value) -> {
            double sum = 0;
            for (Double d : value){
                sum += d;
            }
            System.out.printf("%s is graduated with %s%n", key, sum / value.length);
        })  ;
    }
}
