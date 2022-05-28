package SetsandMapsAdvancedExercises;

import java.util.*;

public class A03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int n = Integer.parseInt(scanner.nextLine());

        Set<String> elements = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            elements.addAll(Arrays.asList(input));
        }

        for (String element : elements) {
            System.out.print(element+ " ");
        }
    }
}
