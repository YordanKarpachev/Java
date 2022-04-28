package ObjekteUndKlassenLAB;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int i = 0; i < input.length - 1; i++) {


            int x = random.nextInt(input.length - 1);
            int y = random.nextInt(input.length - 1);

            String position = input[x];
            input[x] = input[y];
            input[y] = position;


        }
        System.out.println(String.join(System.lineSeparator(), input));

    }
}
