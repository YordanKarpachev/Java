package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class A05TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e))
                .toArray();


        for (int i = 0; i <= input.length - 1; i++) {

            int currentnumber = input[i];
            if (i == input.length - 1) {
                System.out.print(input[i]);
                continue;
            }

            boolean isTrue = false;

            for (int j = i + 1; j <= input.length - 1; j++) {


                if (currentnumber > input[j]) {
                    isTrue = true;

                } else {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {

                System.out.print(input[i] + " ");
            }
        }
    }
}
