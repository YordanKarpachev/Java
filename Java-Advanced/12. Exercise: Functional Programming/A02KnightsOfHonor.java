package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class A02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split("\\s+");

        Consumer<String> appender = s -> System.out.printf("Sir %s%n", s);
        Arrays.stream(input).forEach(appender);




    }
}
