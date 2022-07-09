package A06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Car ferarri = new Ferrari(name);
        System.out.println(ferarri);
    }
}
