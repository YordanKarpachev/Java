package T3WorkingwithAbstraction;

import java.util.Scanner;

public class A01Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                int n = Integer.parseInt(scanner.nextLine());
                printFugur(n);
    }

    private static void unten(int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i ; j++) {

                System.out.print(" ");
            }

            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }

    private static void oben(int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                System.out.print(" ");
            }


            for (int k = 0 ; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    private static void mitte(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");

        }
        System.out.println();
    }

   public static void printFugur(int n){
        oben(n);
        mitte(n);
        unten(n);

   }

}
