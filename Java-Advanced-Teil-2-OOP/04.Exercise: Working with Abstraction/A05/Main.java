package A05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsUndColsArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] petersRowsUndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] evilRowsUndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        int arrayFuel = 0;
        int[][] galaxy = new int[rowsUndColsArray[0]][rowsUndColsArray[1]];
        for (int i = 0; i < rowsUndColsArray[0]; i++) {
            for (int j = 0; j < rowsUndColsArray[1]; j++) {
                galaxy[i][j] = arrayFuel++;
            }
        }

        int evilRows = evilRowsUndCols[0];
        int evilCols = evilRowsUndCols[1];
        while (evilRows-- > 0 && evilCols-- > 0) {
            galaxy[evilRows][evilCols] = 0;
        }


        int petersRows = petersRowsUndCols[0];
        int petersCols = petersRowsUndCols[1];

        int sum = 0;
        while (petersRows-- > 0 && petersCols++ < rowsUndColsArray[1]) {

            sum += galaxy[petersRows][petersCols];
        }
        System.out.println(sum);
    }
}
