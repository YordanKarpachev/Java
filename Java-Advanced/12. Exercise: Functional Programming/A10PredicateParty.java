package FunctionalProgrammingExercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class A10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listOfGuest = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");


        while (!command[0].equals("Party!")) {
            Predicate<String> predicate = getPredicat(command);

            if (command[0].equals("Double")) {

                List<String> peopleToAdd = new ArrayList<>();
                listOfGuest.stream().filter(predicate).forEach(person -> peopleToAdd.add(person));
                listOfGuest.addAll(peopleToAdd);

            } else if (command[0].equals("Remove")) {

                listOfGuest.removeIf(predicate);
            }

            command = scanner.nextLine().split(" ");
        }

        if (listOfGuest.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(listOfGuest);
            System.out.println(String.join(", ", listOfGuest) +" are going to the party!" );
        }
    }



    public static Predicate<String> getPredicat(String[] commandPart) {
        String filterName = commandPart[1];
        String filterKriteria = commandPart[2];
        Predicate<String> predicate = null;
        switch (filterName) {
            case "StartsWith":
                predicate = name -> name.startsWith(filterKriteria);
                break;
            case "EndsWith":
                predicate = name -> name.endsWith(filterKriteria);
                break;
            case "Length":
                predicate = name -> name.length() == Integer.parseInt(filterKriteria);
                break;
        }
        return predicate;
    }
}
