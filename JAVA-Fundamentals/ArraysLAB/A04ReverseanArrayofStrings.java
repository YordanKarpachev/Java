package ArraysLab;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class A04ReverseanArrayofStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String inputline = scanner.nextLine();

       String[] masiva = inputline.split(" ");

        for (int i = 0; i < masiva.length / 2; i++) {
            String purvapoziciq = masiva[i];
            masiva[i] = masiva[masiva.length-1 - i];
            masiva[masiva.length-1 - i] = purvapoziciq;


        }
        for (String s :masiva) {
            System.out.print(s + " ");

        }

    }
}
