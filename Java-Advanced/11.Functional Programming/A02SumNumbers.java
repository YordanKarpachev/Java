package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class A02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        Function<String[], Integer> countIntegerInString = str -> str.length;
        Function<String[], Integer> sumIntegersInString = str -> Arrays.stream(input)
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println("Count = "+ countIntegerInString.apply(input));
        System.out.println("Sum = " + sumIntegersInString.apply(input));

    }
}
