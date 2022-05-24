package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class A04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int r = input[0];
        int c = input[1];

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            int[] current = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = current;

        }
        int sum = Integer.MIN_VALUE;
        int maxRowIndex = -1;
        int maxColIndex = -1;

        for (int i = 0; i < r- 2; i++) {
            for (int j = 0; j < c - 2; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1] +matrix[i ][j +2]+
                                 matrix[i + 1][j] +matrix[i+ 1][j + 1 ] +matrix[i+ 1][j + 2] +
                        matrix[i + 2][j] +matrix[i+ 2][j + 1 ] +matrix[i+ 2][j + 2];
                if (currentSum > sum){
                    maxRowIndex = i;
                    maxColIndex = j;
                    sum = currentSum;
                }
            }
        }


        System.out.println("Sum = "+ sum);

        for (int i = maxRowIndex; i < maxRowIndex + 3; i++) {
            for (int j = maxColIndex; j < maxColIndex + 3 ; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
