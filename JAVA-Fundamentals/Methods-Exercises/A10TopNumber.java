package MethodsExercise;

import java.util.Scanner;

public class A10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        topNumber(n);
    }


    public static void topNumber(int end) {
        for (int i = 1; i <= end; i++) {
            int index = i ;
            int sum = 0;
            boolean odd = false;

            while (index > 0){
                if (index % 2 ==1) {
                    odd = true;
                }
                sum += index % 10 ;
                index /= 10;
            }

            if (sum % 8 == 0 && odd) {
                System.out.println(i);
            }


        }
    }
}
