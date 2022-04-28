package SetsAndMapsAdvancedLAB;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class A01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        Set<String> data = new LinkedHashSet<>();
        while (!input[0].equals("END")) {
            if (input[0].equals("IN")) {
                data.add(input[1]);
            } else {
                data.remove(input[1]);
            }

            input = scanner.nextLine().split(", ");
        }

        String output = data.isEmpty() ? "Parking Lot is Empty" : data.stream().collect(Collectors.joining(System.lineSeparator()));
        System.out.println(output);
    }
}
