package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class A07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        if (arr.length - 1 > 0) {
            int cikala = arr.length - 1;
            for (int i = 0; i < cikala; i++) {
                int[] arr2 = new int[arr.length - 1];

                for (int j = 0; j < arr.length - 1; j++) {


                    arr2[j] = arr[j] + arr[j + 1];

                }
                arr = arr2;
            }   System.out.println(arr[0]);
        }
      else{
            System.out.println(arr[0]);

        }
    }
}
