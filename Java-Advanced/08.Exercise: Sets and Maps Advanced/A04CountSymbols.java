package SetsandMapsAdvancedExercises;

import java.util.*;

public class A04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character, Integer> chars = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
           chars.putIfAbsent(current, 0);
           chars.put(current, chars.get(current) + 1);

        }

       chars.forEach((key, value) -> {
           System.out.printf("%c: %d time/s%n", key, value);
       });
    }
}
