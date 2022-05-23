package MultidimensionalArraysExercises;

import java.util.Scanner;

public class A01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
                int n = Integer.parseInt(input[0]);

                int[][] matrix = new int[n][n];

                if(input[1].equals("A")){

                    int number = 1;
                    for (int i = 0; i < n; i++) {

                        for (int j = 0; j < n; j++) {
                            matrix[j][i] = number;
                            number++;

                        }

                    }
                } else if (input[1].equals("B")){
                    int number = 1;
                    for (int i = 0; i < n; i++) {

                        if(i % 2 == 0){
                            for (int j = 0; j < n; j++) {

                                matrix[j][i] = number++;

                            }
                        } else {
                            for (int j = n - 1; j >= 0 ; j--) {
                                matrix[j][i] = number++;

                            }
                        }


                    }

                }


        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}
