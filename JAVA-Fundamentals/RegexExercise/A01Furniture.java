package RegularExpressionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();


        String regex = ">>(?<name>\\b[A-Z]*[a-z]*)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)";

        Pattern pattern = Pattern.compile(regex);



        double gesamtPreis = 0;

        List<String> moebeln = new ArrayList<>();

        while (!input.equals("Purchase")){


            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int menge = Integer.parseInt(matcher.group("quantity"));
                moebeln.add(name);
                gesamtPreis += price* menge;
            }



            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
      moebeln.forEach(a -> System.out.println(a));
        System.out.printf("Total money spend: %.2f", gesamtPreis);
    }
}
