package A03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");

        List<Birthable> birthables = new ArrayList<>();
        while (!tokens[0].equals("End")) {

            switch (tokens[0]) {
                case "Citizen":
                    //"Citizen {name} {age} {id} {birthdate}"
                    birthables.add(new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]));
                    break;

                case "Pet":
                    //"Pet {name} {birthdate}"
                    birthables.add(new Pet(tokens[1], tokens[2]));
                    break;
            }


            tokens = scanner.nextLine().split(" ");
        }

        String datum = scanner.nextLine();

        birthables.stream()
                .map(Birthable::getBirthDate)
                .filter(a -> a.endsWith(datum))
                .forEach(System.out::println);
    }


}
