package A05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        List<Identifiable> identifiables = new ArrayList<>();

        while (!tokens[0].equals("End")) {

            Identifiable identifiable = tokens.length == 2 ?
                    new Robot(tokens[1], tokens[0]) :
                    new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            identifiables.add(identifiable);

            tokens = scanner.nextLine().split("\\s+");
        }


        String nummer = scanner.nextLine();

        identifiables.stream()
                .map(Identifiable::getId)
                .filter(a -> a.endsWith(nummer))
                .forEach(System.out::println);
    }
}
