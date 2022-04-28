package RegularExpressionLAB;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(?<day>\\b\\d{2})([\\/\\.\\-])(?<Monat>[A-Z]{1}[a-z]{2})\\2(?<Jahr>[0-9]{4})\\b";
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher dates = pattern.matcher(input);

        while (dates.find()){

            String day = dates.group("day");
            String monat = dates.group("Monat");
            String Jahr = dates.group("Jahr");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, monat, Jahr);
        }
    }
}
