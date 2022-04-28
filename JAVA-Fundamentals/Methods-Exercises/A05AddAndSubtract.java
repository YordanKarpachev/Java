package MethodsExercise;

import java.util.Scanner;

public class A05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        int sum = addAndSubtract(n, n1, n2);
        System.out.println(sum);
    }

    private static int addAndSubtract (int n1, int n2, int n3) {
        int sum = n1 + n2 - n3;
        return sum;
    }
}
