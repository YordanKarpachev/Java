package RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class A02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> persons = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String regexName = "[A-Za-z]+";
        String regexKM = "[0-9]";

        Pattern patternName = Pattern.compile(regexName);
        Pattern patternKM = Pattern.compile(regexKM);


        Map<String, Integer> race = new LinkedHashMap<>();
        persons.forEach(a -> race.put(a, 0));


        String input = scanner.nextLine();
        while (!input.equals("end of race")) {

            Matcher matcherName = patternName.matcher(input);
            String aktuelleName = "";
            while (matcherName.find()) {
                aktuelleName += matcherName.group();
            }

            if (race.containsKey(aktuelleName)) {

                Matcher km = patternKM.matcher(input);
                while (km.find()) {
                    int distance = Integer.parseInt(km.group());
                    race.put(aktuelleName, race.get(aktuelleName) + distance);
                }
            }


            input = scanner.nextLine();
        }

        List<String> outpu = race.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(3)
                                .map(entry -> entry.getKey())
                                        .collect(Collectors.toList());
        System.out.println("1st place: " + outpu.get(0));
        System.out.println("2nd place: " + outpu.get(1));
        System.out.println("3rd place: " + outpu.get(2));
    }
}
