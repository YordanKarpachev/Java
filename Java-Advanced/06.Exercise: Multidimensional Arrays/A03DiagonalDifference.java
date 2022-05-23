package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class A03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int n = Integer.parseInt(scanner.nextLine());

                int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int [] current = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = current;

        }

       int sum1 = 0;

        for (int i = 0; i < n; i++) {

           sum1+=  matrix[i][i];
        }

        int sum2 = 0;
        int current = n - 1;
        for (int i = 0; i < n; i++) {
            sum2 += matrix[i][current];
            current--;
        }
       if (sum1 > sum2){
           System.out.println(sum1- sum2);
       } else {
           System.out.println(sum2 - sum1);
       }
    }
}
