package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class A09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        Predicate<Integer> check = a -> {
            for (int i = 0; i < numbers.length; i++) {
                if (a % numbers[i] != 0)
                {
                    return false;
                }
            }
            return true;
        };


        for (int i = 1; i <= n; i++) {
            if (check.test(i))
                System.out.print(i + " ");
        }

    }
}
