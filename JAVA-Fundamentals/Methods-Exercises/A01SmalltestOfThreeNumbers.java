package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class A01SmalltestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        System.out.println(printsmallnumber(number, number2, number3));
    }


    public static int printsmallnumber (int n1, int n2, int n3) {
        int[] smallnumber = new int[] {n1, n2 , n3};
        Arrays.sort(smallnumber);
            return smallnumber[0];
    }


}
