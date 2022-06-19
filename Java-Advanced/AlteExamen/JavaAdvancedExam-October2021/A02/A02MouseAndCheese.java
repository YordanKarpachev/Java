package JavaAdvancedExam23October2021;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Scanner;

public class A02MouseAndCheese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] arr = new char[n][n];
        int currentRow = -1;
        int currentCol = -1;
        int chesse = 5;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                arr[i][j] = input.charAt(j);
                if (arr[i][j] == 'M') {
                    currentRow = i;
                    currentCol = j;
                }
            }
        }
        String input = scanner.nextLine();
        boolean indexValidation = false;
        while (!input.equals("end") && !indexValidation){
            arr[currentRow][currentCol] = '-';
            switch (input){
                case "up":
                    currentRow--;
                    if(currentRow  < 0){
                        indexValidation = true;
                        continue;
                    }
                    if(arr[currentRow][currentCol] == 'B'){
                        arr[currentRow][currentCol] = '-';
                        currentRow--;
                    }
                    if(currentRow  < 0){
                        indexValidation = true;
                        continue;
                    } else {

                        if(arr[currentRow][currentCol] == 'c'){
                            chesse --;
                        }
                    }
                    break;
                case "down":
                    currentRow ++;
                    if(currentRow   >= n){
                        indexValidation = true;
                        continue;
                    }
                    if(arr[currentRow][currentCol] == 'B'){
                        arr[currentRow][currentCol] = '-';
                        currentRow++;
                    }
                    if(currentRow   >= n){
                        indexValidation = true;
                        continue;
                    } else {

                        if(arr[currentRow][currentCol] == 'c'){
                            chesse --;

                        }
                    }
                    break;
                case "left":
                    currentCol --;
                    if(currentCol  < 0){
                        indexValidation = true;
                        continue;
                    }
                    if(arr[currentRow][currentCol] == 'B'){
                        arr[currentRow][currentCol] = '-';
                        currentCol--;
                    }
                    if(currentCol  < 0){
                        indexValidation = true;
                        continue;
                    } else {

                        if(arr[currentRow][currentCol] == 'c'){
                            chesse --;
                        }
                    }
                    break;
                case "right":
                    currentCol ++;
                    if(currentCol   >= n){
                        indexValidation = true;
                        continue;
                    }

                    if(arr[currentRow][currentCol] == 'B'){
                        arr[currentRow][currentCol] = '-';
                        currentCol++;
                    }

                    if(currentCol   >= n){
                        indexValidation = true;
                        continue;
                    } else {

                        if(arr[currentRow][currentCol] == 'c'){
                            chesse --;
                        }
                    }
                    break;
            }
            arr[currentRow][currentCol] = 'M';
            input = scanner.nextLine();

        }
        if(indexValidation){
            System.out.println("Where is the mouse?");
        }

        if (chesse > 0){
            System.out.println("The mouse couldn't eat the cheeses, she needed "+ chesse +" cheeses more.");
        } else {
            chesse = 5 - chesse;
            System.out.println("Great job, the mouse is fed " + chesse + " cheeses!");
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
