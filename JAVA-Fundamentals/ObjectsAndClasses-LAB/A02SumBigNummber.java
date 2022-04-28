package ObjekteUndKlassenLAB;

import java.math.BigInteger;
import java.util.Scanner;

public class A02SumBigNummber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number = new BigInteger(scanner.nextLine());
        BigInteger number2 = new BigInteger(scanner.nextLine());

        BigInteger result = number.add(number2);

        System.out.println(result);
    }
}
