package MultidimensionalArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class A02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] rowCol = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int r = rowCol[0];
        int c = rowCol[1];
        boolean notFound = false;

        int[][] matrix = new int[r][];

        for (int i = 0; i < r; i++) {
            int [] current = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = current;
        }

                int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c ; j++) {
                if (n == matrix[i][j]){
                    System.out.println(i + " " + j);
                    notFound = true;
                }
            }

        }


        if (!notFound){
            System.out.println("not found");
        }
    }
}
