package RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[STARstar]";
        Pattern pattern = Pattern.compile(regex);
        String regexDecrypt = "^([^@\\-!:>]*)@(?<planet>[A-Za-z]+)([^@\\-!:>]*):(?<population>\\d+)([^@\\-!:>]*)!(?<attack>[AD])!([^@\\-!:>]*)->(?<soldier>\\d+)([^@\\-!:>]*)$";
        Pattern pattern1 = Pattern.compile(regexDecrypt);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attacked = new ArrayList<>();
        List<String> des = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            int counter = 0;
            while (matcher.find()) {
                counter++;
            }


            StringBuilder stringBuilder = new StringBuilder();

            for (int j = 0; j < input.length(); j++) {
                char symbol = input.charAt(j);
                symbol -= counter;
                stringBuilder.append(symbol);
            }


            Matcher matcher1 = pattern1.matcher(stringBuilder.toString());

            while (matcher1.find()) {
                String planet = matcher1.group("planet");
                int population = Integer.parseInt(matcher1.group("population"));
                String attackOrDefens = matcher1.group("attack");
                int soldier = Integer.parseInt(matcher1.group("soldier"));
                if (attackOrDefens.equals("A")) {
                    attacked.add( planet);
                } else {
                    des.add( planet);
                }
            }

        }


        System.out.println("Attacked planets: " + attacked.size());
 /*
        Collections.sort(attacked);
        attacked.forEach(a -> System.out.println("-> " + a));
*/
        attacked.stream().sorted(String::compareTo).forEach(a -> System.out.println("-> " + a));
        System.out.println("Destroyed planets: " + des.size());


      /*  Collections.sort(des);
        des.forEach(b -> System.out.println("-> " + b)); */
        des.stream().sorted(String::compareTo).forEach(b -> System.out.println("-> " + b));
    }
}
