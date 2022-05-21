package MultidimensionalArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class A04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsCols = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsCols[0];
        int columns = rowsCols[1];
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            rowsCols = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int number : rowsCols) {
                sum += number;
            }
        }

        System.out.println(rows);
        System.out.println(columns);
        System.out.println(sum);
    }
}
