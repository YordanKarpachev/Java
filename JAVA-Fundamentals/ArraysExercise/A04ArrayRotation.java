package ArraysExercise;

import java.util.Scanner;

public class A04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String pos0 = input[0];

            for (int j = 0; j < input.length - 1; j++) {
                   input [j] = input[j+1];

            }
            input[input.length - 1] = pos0;

        }
        System.out.println(String.join(" ", input));
    }
}
