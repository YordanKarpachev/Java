package DataTypeUndVarianlenExercise09;

import java.util.Scanner;

public class A07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //Insufficient capacity!
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int nm = Integer.parseInt(scanner.nextLine());


            if (nm + sum > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            sum += nm;

        }
        System.out.println(sum);
    }

}

