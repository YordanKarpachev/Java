package JavaAdvancedRetakeExam13April2022;


import java.util.Scanner;

public class A02Armory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Character[][] arr = new Character[n][n];
        int gold = 0;
        int currentIndexRow = -1;
        int currentIndexCol = -1;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            for (int j = 0; j < n; j++) {

                char current = input.charAt(j);
                arr[i][j] = current;
                if (current == 'A') {
                    currentIndexRow = i;
                    currentIndexCol = j;
                    arr[i][j] = '-';
                }
            }
        }
        boolean validation = false;
        while (gold <= 65 && !validation) {
            String input = scanner.nextLine();
            arr[currentIndexRow][currentIndexCol] = '-';
            switch (input) {
                case "up":
                    if (currentIndexRow - 1 >= 0) {
                        currentIndexRow--;
                        char current = arr[currentIndexRow][currentIndexCol];
                        gold = isDigit(arr, gold, currentIndexRow, currentIndexCol, current);
                        if (current == 'M') {
                            arr[currentIndexRow][currentIndexCol] = '-';
                            for (int i = 0; i < n; i++) {
                                for (int j = 0; j < n; j++) {
                                    if (arr[i][j] == 'M' && currentIndexRow != i && currentIndexCol != j) {
                                        currentIndexRow = i;
                                        currentIndexCol = j;
                                        arr[currentIndexRow][currentIndexCol] = 'A';
                                    }
                                }

                            }
                        }

                    } else {
                        System.out.println("I do not need more swords!");
                        validation = true;
                    }
                    break;
                case "down":
                    if (currentIndexRow + 1 < n) {
                        currentIndexRow++;
                        char current = arr[currentIndexRow][currentIndexCol];
                        gold = isDigit(arr, gold, currentIndexRow, currentIndexCol, current);
                        if (current == 'M') {
                            arr[currentIndexRow][currentIndexCol] = '-';
                            for (int i = 0; i < n; i++) {
                                for (int j = 0; j < n; j++) {
                                    if (arr[i][j] == 'M' && currentIndexRow != i && currentIndexCol != j) {
                                        currentIndexRow = i;
                                        currentIndexCol = j;
                                        arr[currentIndexRow][currentIndexCol] = 'A';
                                    }
                                }

                            }
                        }
                    } else {
                        System.out.println("I do not need more swords!");
                        validation = true;
                    }
                    break;
                case "left":
                    if (currentIndexCol - 1 >= 0) {
                        currentIndexCol--;
                        char current = arr[currentIndexRow][currentIndexCol];
                        gold = isDigit(arr, gold, currentIndexRow, currentIndexCol, current);
                        if (current == 'M') {
                            arr[currentIndexRow][currentIndexCol] = '-';
                            for (int i = 0; i < n; i++) {
                                for (int j = 0; j < n; j++) {
                                    if (arr[i][j] == 'M' && currentIndexRow != i && currentIndexCol != j) {
                                        currentIndexRow = i;
                                        currentIndexCol = j;
                                        arr[currentIndexRow][currentIndexCol] = 'A';
                                    }
                                }

                            }
                        }
                        break;
                    } else {
                        System.out.println("I do not need more swords!");
                        validation = true;
                        continue;
                    }
                    case "right": {
                    if (currentIndexCol + 1 < arr[currentIndexRow].length) {
                        currentIndexCol++;

                        char current = arr[currentIndexRow][currentIndexCol];

                        gold = isDigit(arr, gold, currentIndexRow, currentIndexCol, current);

                        if (current == 'M') {
                            arr[currentIndexRow][currentIndexCol] = '-';
                            for (int i = 0; i < n; i++) {
                                for (int j = 0; j < n; j++) {
                                    if (arr[i][j] == 'M' && currentIndexRow != i && currentIndexCol != j) {
                                        currentIndexRow = i;
                                        currentIndexCol = j;
                                        arr[currentIndexRow][currentIndexCol] = 'A';
                                    }
                                }

                            }
                        }
                        break;
                    } else {
                        System.out.println("I do not need more swords!");
                        validation = true;

                        break;
                    }
                }
            }
        }
        if (gold >= 65) {
            System.out.println("Very nice swords, I will come back for more!");
        }
        System.out.printf("The king paid %d gold coins.%n", gold);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                }
            System.out.println();
        }
    }

    private static int isDigit(Character[][] arr, int gold, int currentIndexRow, int currentIndexCol, char current) {
        if (Character.isDigit(current)) {
            int buy = Character.getNumericValue(current);
            gold += buy;
            arr[currentIndexRow][currentIndexCol] = 'A';


        }
        return gold;
    }


}

