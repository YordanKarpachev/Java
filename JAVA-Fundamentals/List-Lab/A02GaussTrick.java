package ListLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input  = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int size = input.size();

        for (int i = 0; i < size / 2; i++) {



            int firstNumber = input.get(i);
            int secondNumber = input.get(input.size() - 1);
            input.set(i, firstNumber + secondNumber);
            input.remove(input.size() - 1);


        }


        System.out.println(input.toString().replaceAll("[\\[\\],]", ""));
    }

}
