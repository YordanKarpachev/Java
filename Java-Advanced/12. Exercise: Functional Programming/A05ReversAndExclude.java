package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class A05ReversAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

                int n = Integer.parseInt(scanner.nextLine());

                Predicate<Integer> div = numb -> numb % n == 0;

                numbers.removeIf(div);
        Collections.reverse(numbers);


        numbers.forEach(a -> System.out.printf("%d ", a));
    }
}
