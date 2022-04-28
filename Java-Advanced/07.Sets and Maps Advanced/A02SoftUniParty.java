package SetsAndMapsAdvancedLAB;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class A02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String > data = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")){

            data.add(input);
            input = scanner.nextLine();
        }

        while (!input.equals("END")){
            data.remove(input);

            input = scanner.nextLine();
        }

        System.out.println(data.size());
        System.out.println(String.join(System.lineSeparator(), data));
    }
}
