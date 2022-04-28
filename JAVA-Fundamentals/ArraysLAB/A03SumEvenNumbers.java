package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class A03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] number = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum = 0;

        for (int n: number) {
            if (n % 2 == 0 )
            {
                sum += n;
            }

        }
        System.out.println(sum);
    }
}
