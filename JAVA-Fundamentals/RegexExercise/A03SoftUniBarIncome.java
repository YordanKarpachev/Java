package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String regex = "%(?<name>[A-Z][a-z]+)%[^|$.]*?<(?<product>\\w+)>[^|$.]*?\\|(?<count>\\d+)\\|[^|$.]*?(?<price>\\d+\\.?\\d+)\\$";
        Pattern pattern = Pattern.compile(regex);

        double totalSum = 0;
        String input = scanner.nextLine();
        while (!input.equals("end of shift")) {

            Matcher matcher = pattern.matcher(input);


            while (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                double currentIncome = count * price;
                totalSum += currentIncome;

                System.out.printf("%s: %s - %.2f%n", name, product, currentIncome);
            }


            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalSum);
    }
}
