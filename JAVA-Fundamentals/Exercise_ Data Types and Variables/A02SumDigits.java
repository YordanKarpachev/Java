package DataTypeUndVarianlenExercise09;

import java.util.Scanner;

public class A02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int currentNumber = 0;

        while (n > 0) {
            currentNumber += n % 10;
            n /= 10;
        }
        System.out.println(currentNumber);
    }
}
