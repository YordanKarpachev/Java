package FunctionalProgramingLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] radius = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int start = radius[0];
        int stop = radius[1];
        String command = scanner.nextLine();


        Predicate<Integer> isEven = i -> i % 2 == 0;
        Predicate<Integer> isOdd = i ->i % 2 != 0;

        if (command.equals("odd")){
            System.out.println(IntStream.range(start, stop + 1).boxed().filter(isOdd)
                    .map(String::valueOf)
                    .collect(Collectors.joining(" ")));
        } else {
            System.out.println(IntStream.range(start, stop + 1 ).boxed().filter(isEven)
                    .map(String::valueOf)
                    .collect(Collectors.joining(" ")));
        }

        }
    }



