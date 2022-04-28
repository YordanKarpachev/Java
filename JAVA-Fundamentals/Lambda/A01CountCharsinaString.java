package AssociaciveArrExerice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A01CountCharsinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String word = input[i];

            for (int j = 0; j < word.length(); j++) {
                char symbol = word.charAt(j);
                chars.putIfAbsent(symbol, 0);
                chars.put(symbol, chars.get(symbol) + 1);
            }

        }
     chars.forEach((k ,v) -> System.out.println(k+" -> "+v));
    }
}
