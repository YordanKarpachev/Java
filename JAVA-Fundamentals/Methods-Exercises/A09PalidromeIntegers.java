package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class A09PalidromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            // int zahl = Integer.parseInt(input);

            palidromeIntegers(input);

            if (!palidromeIntegers(input)) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }


            input = scanner.nextLine();
        }
    }

    private static boolean palidromeIntegers(String zahl) {
        int[] zahlArr = Arrays.stream(zahl.split("")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int index = zahlArr.length / 2;
        if (zahlArr.length % 2 == 1) {

            for (int i = 0; i < index; i++) {

                if (zahlArr[i] != zahlArr[zahlArr.length - 1 - i]) {
                    return false;
                }
            }

        } else {
            if (index == 1) {
                for (int i = 0; i < index ; i++) {
                    if (zahlArr[i] != zahlArr[zahlArr.length - 1 - i]) {
                        return false;
                    }}
                }
                for (int i = 0; i < index - 1; i++) {
                    if (zahlArr[i] != zahlArr[zahlArr.length - 1 - i]) {
                        return false;
                    }
                }

            }
            return true;
        }

    }
