package RegularExpressionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        List<String> output = new ArrayList<>();


    }
}
