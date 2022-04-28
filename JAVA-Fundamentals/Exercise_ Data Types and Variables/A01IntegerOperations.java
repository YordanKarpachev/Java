package DataTypeUndVarianlenExercise09;

import java.util.Scanner;

public class A01IntegerOperations {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int n = Integer.parseInt(scanner.nextLine());
     int n1 = Integer.parseInt(scanner.nextLine());
     int n2 = Integer.parseInt(scanner.nextLine());
     int n3 = Integer.parseInt(scanner.nextLine());

     long sumn1n2 = n + n1;
     long divide = sumn1n2 / n2;
     long multiply = divide * n3;
        System.out.println(multiply);

    }
}
