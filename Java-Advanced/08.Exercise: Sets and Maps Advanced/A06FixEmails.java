package SetsandMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> daten = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")){

            String email = scanner.nextLine();

            if (!email.contains("us") && !email.contains("uk") && !email.contains("com")) {

                daten.put(input, email);
            }


            input = scanner.nextLine();
        }


        daten.forEach((key, value) -> {
            System.out.printf("%s -> %s%n", key, value);
        });
    }
}
