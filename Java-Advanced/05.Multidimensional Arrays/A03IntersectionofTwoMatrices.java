package MultidimensionalArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class A03IntersectionofTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        char[][] firstMatrix = new char[r][c];
        char[][] secondMatrix = new char[r][c];

        for (int i = 0; i < r; i++) {
            char[] current = scanner.nextLine().replaceAll(" ", "").toCharArray();
            firstMatrix[i] = current;
        }

        for (int i = 0; i < r; i++) {
            String input = scanner.nextLine();
            char[] current = input.replaceAll(" ", "").toCharArray();
            secondMatrix[i] = current;
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (firstMatrix[i][j] == secondMatrix[i][j]) {
                    System.out.print(firstMatrix[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }
}
