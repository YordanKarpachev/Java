package StecksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A03DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = Integer.valueOf(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        boolean isNull = false;

        if (decimal == 0) {
            System.out.println(0);
            isNull = true;

        } else {
            while (decimal != 0) {
                int current = decimal % 2;
                stack.push(current);
                decimal /= 2;

            }
        }
        if (!isNull) {
            System.out.println(stack.stream().map(String::valueOf).collect(Collectors.joining("")));
        }
    }
}
