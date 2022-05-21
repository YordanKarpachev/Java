package MultidimensionalArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class A05MaximumSumof2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsCols = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows = rowsCols[0];
        int cols = rowsCols[1];

      int[][] matrix = new int[rows][cols];
      int max = Integer.MIN_VALUE;
      int[][] maxMatrix = new int[2][2];

        for (int i = 0; i < rows; i++) {
            int[] current = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix [i] = current;

        }



        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                if(matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1 ][j + 1] > max ){
                    max = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1 ][j + 1];
                    maxMatrix[0][0] = matrix[i][j];
                    maxMatrix[0][1] = matrix[i][j+ 1];
                    maxMatrix[1][0] = matrix[i+ 1][j];
                    maxMatrix[1][1] = matrix[i + 1][j + 1];

                }
            }
        }

        for (int[] ints : maxMatrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println(max);
    }
}
