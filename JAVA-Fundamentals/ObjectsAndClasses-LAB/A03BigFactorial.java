package ObjekteUndKlassenLAB;

import java.math.BigInteger;
import java.util.Scanner;

public class A03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigInteger resul = new BigInteger(String.valueOf(1));

        for (int i = 1; i <=n ; i++) {

            resul = resul.multiply(BigInteger.valueOf(i));


        }
        System.out.println(resul);
    }
}
