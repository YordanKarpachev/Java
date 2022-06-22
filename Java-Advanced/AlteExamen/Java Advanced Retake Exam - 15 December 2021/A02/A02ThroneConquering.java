package JavaAdvancedRetakeExam15December2021;

import java.util.Scanner;

public class A02ThroneConquering {
    private static int energy = -1;
    private static int currentIndexRowP = -1;
    private static int currentIndexColP = -1;
    private static boolean zielErreicht = false;
    private static boolean dead = false;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        energy = Integer.parseInt(scanner.nextLine());

        int n = Integer.parseInt(scanner.nextLine());


        char[][] arr = new char[n][n];


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            for (int j = 0; j < input.length(); j++) {
                char current = input.charAt(j);
                arr[i][j] = current;


                if (current == 'P') {
                    currentIndexRowP = i;
                    currentIndexColP = j;
                    arr[currentIndexRowP][currentIndexColP] = '-';
                }
            }
        }


        while (energy > 0 && !zielErreicht) {
            String[] line = scanner.nextLine().split("\\s+");
            int spawnsCurrentRow = Integer.parseInt(line[1]);
            int spawnsCurrentCol = Integer.parseInt(line[2]);
            arr[spawnsCurrentRow][spawnsCurrentCol] = 'S';
            energy--;

            switch (line[0]) {
                case "up":
                    move(arr, currentIndexRowP - 1, currentIndexColP);
                    break;
                case "down":
                    move(arr, currentIndexRowP + 1, currentIndexColP);
                    break;
                case "left":
                    move(arr, currentIndexRowP, currentIndexColP - 1);
                    break;
                case "right":
                    move(arr, currentIndexRowP, currentIndexColP + 1);
                    break;

            }

            //  line = scanner.nextLine().split(" ");
        }

        if (zielErreicht) {
            System.out.println("Paris has successfully abducted Helen! Energy left: " + energy);
        }
        if (dead) {
            System.out.println("Paris died at " + currentIndexRowP + ";" + currentIndexColP + ".");
        }
        print2DArray(arr);
    }

    private static void move(char[][] arr, int row, int col) {
        if (row < 0 || row >= arr.length || col < 0 || col >= arr.length) {

            return;
        }
        if (arr[row][col] == 'H') {
            arr[row][col] = '-';
            zielErreicht = true;
            return;
        }
        if (arr[row][col] == 'S') {
            energy -= 2;


        } else {
            arr[row][col] = '-';
        }
        currentIndexRowP = row;
        currentIndexColP = col;


        if (energy <= 0) {
            arr[row][col] = 'X';
            dead = true;


        }
    }

    private static void print2DArray(char[][] arr) {
        for (char[] current : arr) {
            for (char c : current) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


}
