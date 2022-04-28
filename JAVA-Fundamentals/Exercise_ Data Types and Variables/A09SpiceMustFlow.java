package DataTypeUndVarianlenExercise09;

import java.util.Scanner;

public class A09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());  //ertrag dobiv

        int day = 0;
        int lager = 0;

        while (yield >= 100) {


            lager += yield - 26;
            if (lager < 0) {
                lager = 0;
            }
            day++;
            yield -= 10;


        }
        lager -= 26;
        if (lager < 0) {
            lager = 0;
        }

        System.out.println(day);
        System.out.println(lager);
    }
}
