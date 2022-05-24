package MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] rotateInput = scanner.nextLine().split("[()]");
        int rotate = Integer.parseInt(rotateInput[1]);

        String input = scanner.nextLine();

        List<String> data = new ArrayList<>();
        int maxIndex = -1;

        while (!input.equals("END")){
            if(input.length()   > maxIndex){
                maxIndex = input.length()  ;
            }
        data.add(input);
        input = scanner.nextLine();
        }

        char[][] matrix = new char[data.size()][maxIndex];

        for (int i = 0; i < data.size(); i++) {
            char[] chars = data.get(i).toCharArray();

            for (int j = 0; j < maxIndex; j++) {

                if(j >= chars.length )
                {
                    matrix[i][j] = ' ';
                } else {
                    matrix[i][j] = chars[j];
                }
            }
        }

        rotate %= 360;

        switch (rotate){
            case 0:
                for (char[] chars : matrix) {
                    for (char aChar : chars) {
                        System.out.print(aChar);
                    }
                    System.out.println();
                }

                break;


            case 90:
                for (int i = 0; i <maxIndex ; i++) {

                    for (int j = data.size() - 1; j >= 0 ; j--) {
                        System.out.print(matrix[j][i]);
                    }
                    System.out.println();
                }

                break;
            case 180:


                for (int i = data.size()-1; i >= 0 ; i--) {
                    for (int j = maxIndex - 1; j >= 0 ; j--) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }


                break;
            case 270:

                for (int i = maxIndex - 1; i >= 0 ; i--) {
                    for (int j = 0; j < data.size()  ; j++) {
                        System.out.print(matrix[j][i]);
                    }
                    System.out.println();
                }

                break;
        }


        System.out.println();
    }
}
