package MethodsExercise;

import java.util.Scanner;

public class A06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        midd(input);
    }



    private static void midd (String input) {
        if (input.length() % 2 == 1) {
            char symbol = input.charAt(input.length() / 2 );
            System.out.println(symbol);
        } else {
            char symbol = input.charAt(input.length() / 2 - 1);
            System.out.print(symbol);
            char symbol2 = input.charAt(input.length() / 2);
            System.out.print(symbol2);
        }


    }


}
