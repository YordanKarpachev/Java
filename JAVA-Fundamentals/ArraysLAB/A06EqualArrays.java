package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class A06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] arrw = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum = 0 ;
        //"Arrays are identical. Sum: {sum}", otherwise find the first index where the arrays differ and print
        // on the console following message: "Arrays are not identical. Found difference at {index} index."

        boolean isdefikal = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arrw[i]) {
                sum += arr1[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isdefikal = true;
                break;
            }
        }
        if (!isdefikal){
        System.out.printf("Arrays are identical. Sum: %d",sum);}
    }
}
