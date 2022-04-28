package DataTypeUndVarianlenExercise09;

import java.util.Scanner;

public class A05PrintPartofTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start  = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());

        for (int i = start;i <= stop ; i++) {
      char symbol = (char) i;


            System.out.print(symbol + " ");
        }

    }
}
