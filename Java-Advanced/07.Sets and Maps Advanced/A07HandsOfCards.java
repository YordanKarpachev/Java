package SetsandMapsAdvancedExercises;

import java.util.*;

public class A07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, HashSet<String>> daten = new LinkedHashMap<>();


        String[] input = scanner.nextLine().split(": ");

        while (!input[0].equals("JOKER")) {


            String[] karten = input[1].split(", ");

            daten.putIfAbsent(input[0], new HashSet<>() );

            for (String s : karten) {
                daten.get(input[0]).add(s);
            }


            input = scanner.nextLine().split(": ");
        }

        daten.entrySet().forEach(entry -> {

            HashSet<String> value = entry.getValue();
            int sum = 0 ;
            for (String s : value) {
                String power = s.substring(0, s.length() - 1);
                char type = s.charAt(s.length() - 1);
                int current = 0;

                switch (power.charAt(0))
                {
                    case 'J':
                        current += 11;
                        break;
                    case 'Q':
                        current += 12;
                        break;
                    case 'K':
                        current += 13;
                        break;
                    case 'A':
                        current += 14;
                        break;
                    default:
                        current += Integer.parseInt(power);
                }

                switch (type){
                    case 'S':
                       current *= 4;
                        break;
                    case 'H':
                        current *= 3;

                        break;
                    case 'D':
                        current *=2;
                        break;
                    case 'C':
                     current *= 1;
                        break;
                }

                sum += current;

            }




            System.out.printf("%s: %d%n", entry.getKey(), sum);
        });
    }
}
