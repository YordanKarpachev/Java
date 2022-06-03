package FunctionalProgramingLab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class A04AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      UnaryOperator<Double> vat = v -> v * 1.20;
        System.out.println("Prices with VAT:");

        Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble).map(vat).forEach(a ->
                System.out.printf("%.2f%n", a));
    }
}
