package ispit;

import java.util.Scanner;

public class A02 {
    private static int currentIndexRow = -1;
    private static int currentIndexCol = -1;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] kommand = scanner.nextLine().split(",");

        char[][] arr = new char[n][n];

        int gestohlenesGeld = 0;


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine().replaceAll(" ", "");

            for (int j = 0; j < input.length(); j++) {

                char current = input.charAt(j);
                arr[i][j] = current;
                if (current == 'D') {
                    currentIndexRow = i;
                    currentIndexCol = j;

                }
            }
        }


        boolean knast = false;


        for (int i = 0; i < kommand.length; i++) {
            if (knast) {
                break;
            }

            String currentKommed = kommand[i];

            arr[currentIndexRow][currentIndexCol] = '+';
            switch (currentKommed) {
                case "up":

                    if (indexValidation(arr, -1, 0)) {
                        System.out.println("You cannot leave the town, there is police outside!");
                        arr[currentIndexRow][currentIndexCol] = 'D';
                        continue;
                    } else if (arr[currentIndexRow - 1][currentIndexCol] == '$') {
                        currentIndexRow--;
                        arr[currentIndexRow][currentIndexCol] = 'D';
                        int sum = currentIndexRow * currentIndexCol;
                        System.out.println("You successfully stole " + sum + "$.");
                        gestohlenesGeld += sum;

                    } else if (arr[currentIndexRow - 1][currentIndexCol] == 'P') {

                        System.out.println("You got caught with " + gestohlenesGeld + "$, and you are going to jail.");
                        arr[currentIndexRow - 1][currentIndexCol] = '#';
                        knast = true;
                    } else {
                        currentIndexRow--;
                        arr[currentIndexRow][currentIndexCol] = 'D';
                    }


                    break;

                case "down":

                    if (indexValidation(arr, +1, 0)) {
                        System.out.println("You cannot leave the town, there is police outside!");
                        arr[currentIndexRow][currentIndexCol] = 'D';
                        continue;
                    } else if (arr[currentIndexRow + 1][currentIndexCol] == '$') {
                        currentIndexRow++;
                        arr[currentIndexRow][currentIndexCol] = 'D';
                        int sum = currentIndexRow * currentIndexCol;
                        System.out.println("You successfully stole " + sum + "$.");
                        gestohlenesGeld += sum;

                    } else if (arr[currentIndexRow + 1][currentIndexCol] == 'P') {

                        System.out.println("You got caught with " + gestohlenesGeld + "$, and you are going to jail.");
                        arr[currentIndexRow + 1][currentIndexCol] = '#';
                        knast = true;
                    } else {

                    currentIndexRow++;
                    arr[currentIndexRow][currentIndexCol] = 'D';
                }


                break;

                case "left":

                    if (indexValidation(arr, 0, -1)) {
                        System.out.println("You cannot leave the town, there is police outside!");
                        arr[currentIndexRow][currentIndexCol] = 'D';
                        continue;
                    } else if (arr[currentIndexRow][currentIndexCol - 1] == '$') {
                        currentIndexCol--;
                        arr[currentIndexRow][currentIndexCol] = 'D';
                        int sum = currentIndexRow * currentIndexCol;
                        System.out.println("You successfully stole " + sum + "$.");
                        gestohlenesGeld += sum;

                    } else if (arr[currentIndexRow][currentIndexCol - 1] == 'P') {

                        System.out.println("You got caught with " + gestohlenesGeld + "$, and you are going to jail.");
                        arr[currentIndexRow][currentIndexCol - 1] = '#';
                        knast = true;
                    } else {

                    currentIndexCol--;
                    arr[currentIndexRow][currentIndexCol] = 'D';
                }


                break;

                case "right":

                    if (indexValidation(arr, 0, +1)) {
                        System.out.println("You cannot leave the town, there is police outside!");
                        arr[currentIndexRow][currentIndexCol] = 'D';
                        continue;
                    } else if (arr[currentIndexRow][currentIndexCol + 1] == '$') {
                        currentIndexCol++;
                        arr[currentIndexRow][currentIndexCol] = 'D';
                        int sum = currentIndexRow * currentIndexCol;
                        System.out.println("You successfully stole " + sum + "$.");
                        gestohlenesGeld += sum;

                    } else if (arr[currentIndexRow][currentIndexCol + 1] == 'P') {

                        System.out.println("You got caught with " + gestohlenesGeld + "$, and you are going to jail.");
                        arr[currentIndexRow + 1][currentIndexCol] = '#';
                        knast = true;
                    } else {
                        currentIndexCol++;
                        arr[currentIndexRow][currentIndexCol] = 'D';
                    }


                    break;


            }
        }

        if(!knast){
            String output = String.format("Your last theft has finished successfully with %d$ in your pocket.", gestohlenesGeld);
            System.out.println(output);
        }
        print2DArray(arr);

    }

    private static boolean indexValidation(char[][] arr, int nextRow, int nextCol) {
        nextRow = currentIndexRow + nextRow;
        nextCol = currentIndexCol + nextCol;
        return nextRow >= arr.length || nextRow < 0 || nextCol >= arr[nextRow].length || nextCol < 0;

    }


    private static void print2DArray(char[][] arr) {
        for (char[] current : arr) {
            for (int i = 0; i < current.length; i++) {
                if(i == current.length - 1){
                    System.out.print(current[i]);
                } else {
                    System.out.print(current[i] + " ");
                }
            }
            System.out.println();
        }
    }


}
