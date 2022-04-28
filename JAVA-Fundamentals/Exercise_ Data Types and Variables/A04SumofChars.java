package DataTypeUndVarianlenExercise09;

import java.util.Scanner;

public class A04SumofChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            String c = scanner.nextLine();
           char charra = c.charAt(0);
           sum += charra;



        }
        System.out.printf("The sum equals: %d", sum);
    }
}
