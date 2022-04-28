package A24;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] konteinerGewicht = {23, 22, 11, 10, 9, 9, 8, 8, 8, 7, 7, 6};

        int[][] daten = new int[4][3];

        int sumBay1 = 0;
        int sumBay2 = 0;
        int sumBay3 = 0;
        int sumBay1Index = 0;
        int sumBay2Index = 0;
        int sumBay3Index = 0;


        for (int i = 0; i < konteinerGewicht.length; i++) {


            if (sumBay3 > sumBay2) {
                if (sumBay2 > sumBay1) {

                    daten[sumBay1Index][0] += konteinerGewicht[i];
                    sumBay1Index++;
                    sumBay1 +=konteinerGewicht[i];
                } else {
                    daten[sumBay2Index][1] +=konteinerGewicht[i];
                    sumBay2Index++;
                    sumBay2 += konteinerGewicht[i];
                }
            } else {
                daten[sumBay3Index][2] += konteinerGewicht[i];
                sumBay3Index++;
                sumBay3 += konteinerGewicht[i];
            }

        }
        System.out.println();
    }

}