package FunctionalProgramingLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class A02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        Function<String[], Integer> countInt = str -> str.length;
        Function<String[], Integer> sumAllInt = str -> Arrays.stream(input).mapToInt(Integer::parseInt).sum();

         System.out.println("Count = " + countInt.apply(input));
         System.out.println("Sum = " + sumAllInt.apply(input));
    }
}
