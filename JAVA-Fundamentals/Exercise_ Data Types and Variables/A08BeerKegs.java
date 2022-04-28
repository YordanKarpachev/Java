package DataTypeUndVarianlenExercise09;

import java.util.Scanner;

public class A08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double maxKeg = 0;
        String maxKegname = "";



        for (int i = 0; i <n ; i++) {

            String model = scanner.nextLine();
           double radius  = Double.parseDouble(scanner.nextLine());
          double height = Double.parseDouble(scanner.nextLine());

            double groesse = Math.PI * Math.pow(radius, 2) * height;

            if (groesse > maxKeg)
            {
                maxKeg = groesse;
                maxKegname = model;
            }
        }
        System.out.println(maxKegname);
    }
}
