package com.softuni.WorkingwithAbstraction;

import java.util.Scanner;

public class A01RhombusofStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        printTopHalf(n);

        printBottomHalf(n);
    }

    private static void printBottomHalf(int n) {
        for (int starCount = n - 1; starCount > 0 ; starCount--) {
            printRow(n, starCount);

        }
    }

    private static void printTopHalf(int n) {
        for (int start = 1; start <= n; start++) {
            printRow(n, start);
        }
    }

    private static void printRow(int n, int start) {
        for (int j = 0; j < n - start; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < start - 1; j++) {
            System.out.print("* ");
        }


        System.out.println("*");
    }
}
