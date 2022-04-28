package MethodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class A02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int vowelsCount = vowels(input);
        System.out.println(vowelsCount);
    }


    private static int vowels (String input ) {
        input = input.toLowerCase();
        int counter = 0;
        for (int i = 0; i <input.length() ; i++) {
            char symbol = input.charAt(i);
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'y' || symbol == 'o' || symbol == 'u') {
                counter++;
            }

        }

        return counter;
    }
}
