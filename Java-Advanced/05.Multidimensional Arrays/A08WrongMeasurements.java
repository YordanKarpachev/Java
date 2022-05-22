package MultidimensionalArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class A08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] numbers = new int[n][];
        for (int i = 0; i < n; i++) {
            int[] current = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            numbers[i] = current;
        }

        int[] wrongIndex = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int wrongNumber = numbers[wrongIndex[0]][wrongIndex[1]];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] == wrongNumber) {
                    int sum = 0;
                    if (i - 1 >= 0 && numbers[i - 1][j] != wrongNumber) {
                        sum += numbers[i - 1][j];
                    }
                    if (i + 1 < n && numbers[i + 1][j] != wrongNumber) {
                        sum += numbers[i + 1][j];
                    }
                    if (j - 1 >= 0 && numbers[i][j - 1] != wrongNumber) {
                        sum += numbers[i][j - 1];
                    }
                    if (j + 1 < numbers[i].length && numbers[i][j + 1] != wrongNumber) {
                        sum += numbers[i][j + 1];
                    }
                    System.out.print(sum + " ");
                    continue;

                }
                System.out.print(numbers[i][j] + " ");


            }

            System.out.println();
        }
    }
}
