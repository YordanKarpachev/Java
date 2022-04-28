package DataTypeUndVarianlenExercise09;

import java.util.Scanner;

public class A10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        double purvonachalnasuma = n ;

        int counter = 0;

        while (m <= n ) {

            n -= m;
            counter++;

            if (purvonachalnasuma * 0.50 == n && y > 0)
            {
                n = n / y;
            }

        }
        System.out.println(n);
        System.out.println(counter);

    }
}
