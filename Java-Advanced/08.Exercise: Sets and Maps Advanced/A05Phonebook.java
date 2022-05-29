package SetsandMapsAdvancedExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("-");

        Map<String, String> daten = new HashMap<>();

        while (!input[0].equals("search")){

            daten.putIfAbsent(input[0], "");
            daten.put(input[0],input[1]);


            input = scanner.nextLine().split("-");
        }


        String line = scanner.nextLine();

        while (!line.equals("stop")){

            if (daten.containsKey(line)){
                System.out.printf("%s -> %s%n", line, daten.get(line));
            } else {
                System.out.printf("Contact %s does not exist.%n", line);
            }

            line = scanner.nextLine();
        }
    }
}
