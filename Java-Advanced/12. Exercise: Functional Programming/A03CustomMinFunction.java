package FunctionalProgrammingExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class A03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> smalltest = a  ->  Arrays.stream(numbers).min().getAsInt();

        Integer small = smalltest.apply(numbers);
        System.out.println(small);

    }
}
