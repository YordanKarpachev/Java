package MethodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class A04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (passwordLength(input) && least2Digit(input) && passLettersOrDigits(input)) {
            System.out.println("Password is valid");
        } else {
            if (!passwordLength(input)) {
                System.out.println("Password must be between 6 and 10 characters");
            } if (!passLettersOrDigits(input)) {
                System.out.println("Password must consist only of letters and digits");
            } if (!least2Digit(input)) {
                System.out.println("Password must have at least 2 digits");
            }
        }
    }


    private static boolean passwordLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean passLettersOrDigits(String password) {
        password = password.toLowerCase();
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if ((symbol < 97 || symbol > 122) && (symbol < 48 || symbol > 57)) {
                return false;
            }
        }
        return true;
    }

    private static boolean least2Digit(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {

            char symbol = password.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                counter++;
                if (counter >= 2) {
                    return true;
                }
            }
        }
        return false;

    }
}
