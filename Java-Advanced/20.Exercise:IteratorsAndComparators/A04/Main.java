package ExercisesIteratorsAndComparators.A04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Lake lake = new Lake(input);
List<String> result = new ArrayList<>();
        for (Object o : lake) {
           result.add(o.toString());
        }
        System.out.println(String.join(", ", result));

    }
}
