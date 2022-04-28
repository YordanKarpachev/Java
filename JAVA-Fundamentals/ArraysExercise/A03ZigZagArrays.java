package ArraysExercise;

import java.util.Scanner;

public class A03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[n];
        String[] arr2 = new String[n];


        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            if (i % 2 == 1) {
                arr[i - 1] = input.split(" ") [0];
                arr2[i - 1] = input.split(" ") [1];

            } else {
                arr[i - 1] = input.split(" ") [1];
                arr2[i - 1] = input.split(" ") [0];
            }
        }
        System.out.println(String.join(" ", arr));
        System.out.println(String.join(" ", arr2));
    }
}
