package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class A02MatrixofPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int r = input[0];
        int c = input[1];

        String[][] matrix = new String[r][c];

        for (int i = 0; i < r; i++) {
            char current  =(char) ('a' + i);
            for (int j = 0; j < c; j++) {

                char mitte = (char) (current + j);

                matrix[i][j] = String.valueOf(current)+mitte+current;
            }
        }
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
