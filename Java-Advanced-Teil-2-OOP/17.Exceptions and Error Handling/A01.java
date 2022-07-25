package T17ExceptionsAndErrorHandling;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int startNumber = numbers[0];
        int endNumber = numbers[1];
        System.out.printf("Range: [%d...%d]%n", startNumber, endNumber);

        boolean isInRange = false;

        String input = scanner.nextLine();

        while (!isInRange) {


            Optional<Integer> num = Optional.empty();

            try {
                num = Optional.of(Integer.parseInt(input));
            } catch (NumberFormatException ignored) {
            }

            if (num.isEmpty() || num.get() < startNumber || num.get() > endNumber) {
                System.out.println("Invalid number: " + input);
                input = scanner.nextLine();
            } else {
                System.out.println("Valid number: " + input);
                isInRange = true;
            }
        }
    }
}
