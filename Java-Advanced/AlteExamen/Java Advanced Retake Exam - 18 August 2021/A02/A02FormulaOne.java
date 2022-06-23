package JavaAdvancedRetakeExamAugust2021;

import java.util.Scanner;

public class A02FormulaOne {
    private static int currentPlayerRow = -1;
    private static int currentPlayerCol = -1;
    private static boolean finished = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int countCommand = Integer.parseInt(scanner.nextLine());

        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            for (int j = 0; j < input.length(); j++) {

                char current = input.charAt(j);
                arr[i][j] = current;
                if (current == 'P') {
                    currentPlayerRow = i;
                    currentPlayerCol = j;

                }
            }
        }


        for (int i = 0; i < countCommand; i++) {
            if(finished)
                break;

            String command = scanner.nextLine();

            arr[currentPlayerRow][currentPlayerCol] = '.';
            switch (command) {
                case "up":
                    if (indexValidation(arr, -1, 0)) {
                        currentPlayerRow = arr.length - 1;

                        if (arr[currentPlayerRow][currentPlayerCol] == 'T') {
                            continue;
                        } else if (arr[currentPlayerRow][currentPlayerCol] == 'F') {
                            finished = true;
                            arr[currentPlayerRow][currentPlayerCol] = 'P';
                            break;
                        } else if (arr[currentPlayerRow][currentPlayerCol] == 'B') {
                            if (indexValidation(arr, currentPlayerRow - 2, 0)) ;
                            {
                                currentPlayerRow -= 2;
                            }
                            arr[currentPlayerRow][currentPlayerCol] = 'P';
                        } else {

                            arr[currentPlayerRow][currentPlayerCol] = 'P';
                        }


                    } else if (arr[currentPlayerRow - 1][currentPlayerCol] == 'T') {
                        continue;
                    } else if (arr[currentPlayerRow - 1][currentPlayerCol] == 'F') {
                        finished = true;
                        arr[currentPlayerRow - 1][currentPlayerCol] = 'P';
                        break;
                    } else if (arr[currentPlayerRow - 1][currentPlayerCol] == 'B') {
                        if (indexValidation(arr, currentPlayerRow - 2, 0))
                        {
                            currentPlayerRow -= 2;
                        }
                        arr[currentPlayerRow][currentPlayerCol] = 'P';
                    } else {
                        currentPlayerRow--;
                        arr[currentPlayerRow][currentPlayerCol] = 'P';
                    }
                    break;





                case "down":
                    if (indexValidation(arr, +1, 0)) {
                        currentPlayerRow = arr.length + 1;

                        if (arr[currentPlayerRow][currentPlayerCol] == 'T') {
                            continue;
                        } else if (arr[currentPlayerRow][currentPlayerCol] == 'F') {
                            finished = true;
                            arr[currentPlayerRow][currentPlayerCol] = 'P';
                            break;
                        } else if (arr[currentPlayerRow][currentPlayerCol] == 'B') {
                            if (indexValidation(arr, currentPlayerRow + 2, 0))
                            {
                                currentPlayerRow += 2;
                            }
                            arr[currentPlayerRow][currentPlayerCol] = 'P';
                        } else {

                            arr[currentPlayerRow][currentPlayerCol] = 'P';
                        }


                    } else if (arr[currentPlayerRow + 1][currentPlayerCol] == 'T') {
                        continue;
                    } else if (arr[currentPlayerRow + 1][currentPlayerCol] == 'F') {
                        finished = true;
                        arr[currentPlayerRow + 1][currentPlayerCol] = 'P';
                        break;
                    } else if (arr[currentPlayerRow + 1][currentPlayerCol] == 'B') {
                        if (indexValidation(arr, currentPlayerRow + 2, 0)) {
                            currentPlayerRow += 2;
                        }
                        arr[currentPlayerRow][currentPlayerCol] = 'P';
                    } else {
                        currentPlayerRow++;
                        arr[currentPlayerRow][currentPlayerCol] = 'P';
                    }
                    break;





                case "left":
                    if (indexValidation(arr, 0, - 1)) {
                        currentPlayerCol = arr[currentPlayerRow].length - 1;

                        if (arr[currentPlayerRow][currentPlayerCol] == 'T') {
                            continue;
                        } else if (arr[currentPlayerRow][currentPlayerCol] == 'F') {
                            finished = true;
                            arr[currentPlayerRow][currentPlayerCol] = 'P';
                            break;
                        } else if (arr[currentPlayerRow][currentPlayerCol] == 'B') {
                            if (indexValidation(arr, currentPlayerRow , - 2))
                            {
                                currentPlayerCol -= 2;
                            }
                            arr[currentPlayerRow][currentPlayerCol] = 'P';
                        } else {

                            arr[currentPlayerRow][currentPlayerCol] = 'P';
                        }


                    } else if (arr[currentPlayerRow ][currentPlayerCol - 1] == 'T') {
                        continue;
                    } else if (arr[currentPlayerRow ][currentPlayerCol - 1] == 'F') {
                        finished = true;
                        arr[currentPlayerRow ][currentPlayerCol - 1] = 'P';
                        break;

                    } else if (arr[currentPlayerRow ][currentPlayerCol - 1] == 'B') {
                        if (indexValidation(arr, currentPlayerRow , - 1))
                        {
                            currentPlayerCol -= 2;
                        }
                        arr[currentPlayerRow][currentPlayerCol] = 'P';
                    } else {
                        currentPlayerCol--;
                        arr[currentPlayerRow][currentPlayerCol] = 'P';
                    }
                    break;






                case "right":
                    if (indexValidation(arr, 0, + 1)) {
                        currentPlayerCol = 0;

                        if (arr[currentPlayerRow][currentPlayerCol] == 'T') {
                            continue;
                        } else if (arr[currentPlayerRow][currentPlayerCol] == 'F') {
                            finished = true;
                            arr[currentPlayerRow][currentPlayerCol] = 'P';
                            break;
                        } else if (arr[currentPlayerRow][currentPlayerCol] == 'B') {
                            if (indexValidation(arr, currentPlayerRow , + 2))
                            {
                                currentPlayerCol += 2;
                            }
                            arr[currentPlayerRow][currentPlayerCol] = 'P';
                        } else {

                            arr[currentPlayerRow][currentPlayerCol] = 'P';
                        }


                    } else if (arr[currentPlayerRow ][currentPlayerCol + 1] == 'T') {
                        continue;
                    } else if (arr[currentPlayerRow ][currentPlayerCol + 1] == 'F') {
                        finished = true;
                        arr[currentPlayerRow ][currentPlayerCol + 1] = 'P';
                        break;
                    } else if (arr[currentPlayerRow ][currentPlayerCol + 1] == 'B') {
                        if (indexValidation(arr, currentPlayerRow , + 1)) ;
                        {
                            currentPlayerCol += 2;
                        }
                        arr[currentPlayerRow][currentPlayerCol] = 'P';
                    } else {
                        currentPlayerCol++;
                        arr[currentPlayerRow][currentPlayerCol] = 'P';
                    }
                    break;

            }


        }


        if (finished) {
            System.out.println("Well done, the player won first place!");
        } else {
            System.out.println("Oh no, the player got lost on the track!");
        }
        print2DArray(arr);
    }

    private static boolean indexValidation(char[][] arr, int nextRow, int nextCol) {
        nextRow = currentPlayerRow + nextRow;
        nextCol = currentPlayerCol + nextCol;
        return nextRow >= arr.length || nextRow < 0 || nextCol >= arr[nextRow].length || nextCol < 0;

    }

    private static boolean isFinished(char[][] arr, int currentPlayerRow, int currentPlayerCol) {


        if (arr[currentPlayerRow][currentPlayerCol] == 'F') {
            arr[currentPlayerRow][currentPlayerCol] = 'P';
            finished = true;
            return true;
        }
        return false;

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
