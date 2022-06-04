package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class A06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Predicate<String> check = str -> str.length() <= n;
        Arrays.stream(scanner.nextLine().split(" ")).filter(check).forEach(System.out::println);
    }
}
