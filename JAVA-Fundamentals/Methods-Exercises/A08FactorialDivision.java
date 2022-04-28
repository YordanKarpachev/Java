package MethodsExercise;

import java.util.Scanner;

public class A08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        
        long number1 = facturial(n);
        long number2 = facturial(n2);
        double sum = number1 * 1.0 / number2;
        System.out.printf("%.2f", sum);
    }
    
    
    private static long facturial (int number) {
        long sum = 1;
        for (int i = 0; i < number; i++) {
            sum += sum * i;
            
        }
        return sum;
    }
}
