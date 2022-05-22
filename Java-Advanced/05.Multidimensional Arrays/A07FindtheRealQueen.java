package MultidimensionalArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class A07FindtheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = false;

        char[][] chessboard = new char[8][];

        for (int i = 0; i < 8; i++) {

            char[] input = scanner.nextLine().replaceAll(" ", "").toCharArray();
            chessboard[i] = input;
        }


        for (int b = 0; b < 8; b++) {

            int qCols = 0;
            for (int o = 0; o < 8; o++) {

                if (chessboard[b][o] == 'q') {

                    qCols++;

                    for (int k = o + 1; k < 8; k++) {
                        if (chessboard[b][k] == 'q') {
                            qCols++;
                        }
                    }


                    for (int w = b + 1; w < 8; w++) {
                        if (chessboard[w][o] == 'q') {
                            qCols++;
                        }

                    }


                    if (qCols > 1) {
                        break;
                    } else {


                        for (int i = 0; i < 8; i++) {
                            if ( isValid){
                                break;
                            }
                            int quen = 0;

                            for (int j = 0; j < 8; j++) {

                                if (chessboard[i][j] == 'q') {
                                    quen++;


                                    int currentI = i - 1;
                                    int currentJ = j - 1;

                                    while (currentI >= 0 && currentJ >= 0) {

                                        if (chessboard[currentI][currentJ] == 'q') {
                                            quen++;
                                        }

                                        currentI--;
                                        currentJ--;
                                    }


                                    currentI = i + 1;
                                    currentJ = j + 1;

                                    while (currentI < 8 && currentJ < 8) {
                                        if (chessboard[currentI][currentJ] == 'q') {
                                            quen++;
                                        }
                                        currentI++;
                                        currentJ++;
                                    }

                                    currentI = i - 1;
                                    currentJ = j + 1;

                                    while (currentI >= 0 && currentJ < 8) {
                                        if (chessboard[currentI][currentJ] == 'q') {
                                            quen++;
                                        }
                                        currentI--;
                                        currentJ++;
                                    }

                                    currentI = i + 1;
                                    currentJ = j - 1;

                                    while (currentI < 8 && currentJ >= 0) {
                                        if (chessboard[currentI][currentJ] == 'q') {
                                            quen++;
                                        }
                                        currentI++;
                                        currentJ--;
                                    }


                                    if (quen == 1) {


                                        isValid = true;
                                        System.out.println(i + " " + j);
                                        break;
                                    }


                                }
                            }
                        }


                    }
                }
            }
        }
    }
}