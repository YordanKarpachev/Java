package FunctionalProgramingLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        Predicate<String> isUpper = str -> Character.isUpperCase(str.charAt(0));

        List<String> onlyUpper = Arrays.stream(input).filter(isUpper).collect(Collectors.toList());
        System.out.println(onlyUpper.size());
        System.out.println(String.join(System.lineSeparator(),onlyUpper));
    }
}
