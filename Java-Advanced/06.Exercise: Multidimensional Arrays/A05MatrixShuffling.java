package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class A05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rolUndCol = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int r = rolUndCol[0];
        int c = rolUndCol[1];

        String[][] matrix = new String[r][];

        for (int i = 0; i < r; i++) {
           String[] current = scanner.nextLine().split(" ");
            matrix[i] = current;
        }

        String[] command = scanner.nextLine().split(" ");

        //swap row1 col1 row2c col2"
        while (!command[0].equals("END")){

            if(command[0].equals("swap") && command.length == 5) {
                int row1 = Integer.parseInt(command[1]);
                int col1 = Integer.parseInt(command[2]);
                int row2 = Integer.parseInt(command[3]);
                int col2 = Integer.parseInt(command[4]);
                if(row1 < 0 || row1 > r || row2 < 0 || row2 > r || col1 < 0 || col1 > c  || col2 < 0 || col2 > c) {
                    System.out.println("Invalid input!");
                    command = scanner.nextLine().split(" ");
                    continue;
                }

                String el1 = matrix[row1][col1];
                String el2 = matrix[row2][col2];
                matrix[row1][col1] = el2;
                matrix[row2][col2] = el1;

                for (String[] strings : matrix) {
                    for (String s : strings) {
                        System.out.print(s+ " ");
                    }
                    System.out.println();
                }



            } else {
                System.out.println("Invalid input!");
                command = scanner.nextLine().split(" ");
                continue;
            }







            command = scanner.nextLine().split(" ");
        }


        System.out.println();
    }
}
