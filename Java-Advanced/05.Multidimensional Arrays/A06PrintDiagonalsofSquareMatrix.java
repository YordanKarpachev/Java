package MultidimensionalArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class A06PrintDiagonalsofSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int n = Integer.parseInt(scanner.nextLine());

                int[][] matrix = new int[n][];
        for (int i = 0; i < n; i++) {
            int[] current = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = current;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        int current = n - 1 ;
        for (int i = 0; i < n  ; i++) {
            System.out.print(matrix[current][i] + " ");
            current --;

        }

    }
}
