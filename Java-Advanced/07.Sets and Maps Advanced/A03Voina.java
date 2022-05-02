package SetsAndMapsAdvancedLAB;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A03Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondPlayer  = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        int round = 50;

        while (round-- > 0 && !firstPlayer.isEmpty() && !secondPlayer.isEmpty()){

            int firsNumber = firstPlayer.iterator().next();
            firstPlayer.remove(firsNumber);

            int secondNumber = secondPlayer.iterator().next();
            secondPlayer.remove(secondNumber);


            if ( firsNumber > secondNumber) {
                firstPlayer.add(firsNumber);
                firstPlayer.add(secondNumber);
            } else if (secondNumber > firsNumber) {
                secondPlayer.add(firsNumber);
                secondPlayer.add(secondNumber);
            }

        }

        if(firstPlayer.size() > secondPlayer.size()){
            System.out.println("First player win!");
        } else if (secondPlayer.size() > firstPlayer.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
