package DefiningClassesExercise.A06;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");


        Map<String, Trainer> trainerMap = new LinkedHashMap<>();
        while (!tokens[0].equals("Tournament")) {
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);
            trainerMap.putIfAbsent(trainerName, new Trainer(trainerName));
            trainerMap.get(trainerName).addPokemon(new Pokemon(pokemonName, pokemonElement, pokemonHealth));

            tokens = scanner.nextLine().split("\\s+");
        }
        String line = scanner.nextLine();
        while (!line.equals("End")) {

            String finalElement = line;
            trainerMap.values().forEach(a -> a.update(finalElement));



            line = scanner.nextLine();
        }

        trainerMap.values().stream().sorted(Comparator.comparing(Trainer::getBudge).reversed()).forEach(System.out::println);

        System.out.println();
    }
}