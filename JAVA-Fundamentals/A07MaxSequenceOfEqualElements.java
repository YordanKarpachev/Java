package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class A07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] atkuelleLange = new int[input.length - 1];
        int aktuellecounter = 0;
        int counter = 0;
        for (int i = 0; i < input.length - 1; i++) {

            if ( input[i] == input[i + 1] ) {
                counter++;
                if (counter > aktuellecounter) {
                    aktuellecounter = counter;
                    int[] langezahl = new int[counter+1 ];
                    for (int j = 0; j <= counter; j++) {
                        langezahl[j] += input[i];

                    }
                    atkuelleLange = langezahl;
                }
            } else {counter = 0;}
        }
        for (int n :atkuelleLange) {
            System.out.print(n + " ");
        }
    }
}
