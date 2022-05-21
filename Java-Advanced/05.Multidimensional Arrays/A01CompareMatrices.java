package MultidimensionalArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class A01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean equal = true;
        int[] rowsUndCols = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] first = new int[rowsUndCols[0]][rowsUndCols[1]];
        int firstR = rowsUndCols[0];
        int firstCols = rowsUndCols[1];
        for (int i = 0; i < firstR; i++) {
            int[] current = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            first[i] = current;
        }
        rowsUndCols = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int secondR = rowsUndCols[0];
        int secondCols = rowsUndCols[1];
        int[][] second = new int[rowsUndCols[0]][rowsUndCols[1]];
        for (int i = 0; i < secondR; i++) {
            int[] current = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            second[i] = current;
        }
        if (firstR != secondR || firstCols != secondCols) {
            equal = false;
        } else {
            for (int i = 0; i < firstR; i++) {
                for (int j = 0; j < firstCols; j++) {
                    if (first[i][j] != second[i][j]) {
                        equal = false;
                        break;
                    }
                }
            }
        }

        System.out.println(equal ? "equal" : "not equal");

    }
}
