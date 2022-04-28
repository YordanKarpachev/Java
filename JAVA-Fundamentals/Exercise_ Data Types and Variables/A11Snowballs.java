package DataTypeUndVarianlenExercise09;

import java.util.Scanner;

public class A11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double maximalQUaliti = 0;
        int maxlSnow = 0;
        int maxTime = 0;
        int Qualiti = 0;


        for (int i = 0; i < n; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow * 1.0 / snowballTime, snowballQuality);
            if (snowballValue > maximalQUaliti) {
                maximalQUaliti = snowballValue;
                maxTime = snowballTime;
                maxlSnow = snowballSnow;
                Qualiti = snowballQuality;

            }



        }

        System.out.printf("%d : %d = %.0f (%d)", maxlSnow, maxTime, maximalQUaliti, Qualiti);
    }
}
