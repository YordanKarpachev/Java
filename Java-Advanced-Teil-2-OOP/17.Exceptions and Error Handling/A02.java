package T17ExceptionsAndErrorHandling;

import java.util.Scanner;

public class A02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = -1;
        String input = scanner.nextLine();

        try {
            number = sqrt(Integer.parseInt(input));
        } catch (IllegalArgumentException e) {

            System.out.println("Invalid");
        }

        if(number != -1 ){
            System.out.printf("%.2f%n", number);
        }
        System.out.println("Goodbye");
    }

    public static double sqrt(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Invalid number");
        }

        return Math.sqrt(num);
    }
}
