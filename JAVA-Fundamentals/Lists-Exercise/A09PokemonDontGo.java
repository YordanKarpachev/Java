package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputArray = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        while (inputArray.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());


            if (index >= 0 && index <= inputArray.size() - 1) {
                int removedElement = inputArray.get(index);
                sum += removedElement;
                inputArray.remove(index);

                pokemonChange(inputArray, removedElement);

            } else if (index < 0) {
                int lastElement = inputArray.get(inputArray.size() - 1);
                int removedelement = inputArray.get(0);
                sum += removedelement;

                inputArray.set(0, lastElement);
              pokemonChange(inputArray, removedelement);

            } else if (index > inputArray.size() - 1) {
                int removedElement = inputArray.get(inputArray.size() - 1);
                sum += removedElement;
                int firstElement = inputArray.get(0);

                inputArray.set(inputArray.size() - 1, firstElement);
                pokemonChange(inputArray, removedElement);
            }

        }

        System.out.println(sum);
    }

    private static void pokemonChange(List<Integer> inputArray, int removedElement) {
        for (int i = 0; i <= inputArray.size() - 1; i++) {
            int currentNubmer = inputArray.get(i);
            if (currentNubmer <= removedElement) {
               currentNubmer += removedElement;
            } else {
                currentNubmer -= removedElement;
            }
            inputArray.set(i, currentNubmer);

        }
    }
}
