package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> indexSmallElement = list -> {
            int smallnumber = Integer.MAX_VALUE;
            int smallindex = -1;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) <= smallnumber) {
                    smallnumber = list.get(i);
                    smallindex = i;
                }
            }
            return smallindex;
        };


        int output = indexSmallElement.apply(input);
        System.out.println(output);
    }


}

