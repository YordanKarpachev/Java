package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class A05EvenandOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int evenSUm = 0;
        int oddSum = 0;
        for (int i: number) {
            if (i % 2 == 0 )
            {
                evenSUm += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println(evenSUm - oddSum);
    }
}
