package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class A06EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        boolean isTrue = true;

        for (int i = 0; i <= input.length - 1; i++) {

            int sumLinks = 0;
            int sumRechts = 0;

            for (int rechts = i+ 1; rechts <= input.length - 1; rechts++) {
                sumRechts += input[rechts];
            }

            if (i > 0) {
                for (int links = i - 1; links >= 0; links--) {
                    sumLinks += input[links];
                }
            }

            if (sumLinks == sumRechts)

            {
                System.out.println(i);
                isTrue = false;
                break;
            }
        }
        if (isTrue) {
            System.out.println("no");
        }
    }
}
