package FunctionalProgramingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        numbers.removeIf(n -> n % 2 != 0);
        Function<Stream<Integer>, String> mutator = x -> x.map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(mutator.apply(numbers.stream()));
        System.out.println(mutator.apply(numbers.stream().sorted()));
    }
}
