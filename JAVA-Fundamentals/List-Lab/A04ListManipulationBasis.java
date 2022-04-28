package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A04ListManipulationBasis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end"))
        {
            String aktuelleCommand = command.split(" ")[0];
            int numberOrIndex = Integer.parseInt(command.split(" ") [1]);

            switch (aktuelleCommand) {
                case "Add": //number
                    input.add(numberOrIndex);
                    break;

                case "Remove":  //number
                    input.remove(Integer.valueOf(numberOrIndex));   //premaxva stoinost
                    break;

                case "RemoveAt":  //index
                    input.remove(numberOrIndex);
                    break;

                case "Insert":  //number  - index
                    int index = Integer.parseInt(command.split(" ") [2]);
                    input.add(index, numberOrIndex);
                    break;
            }





            command = scanner.nextLine();
        }
        System.out.println(input.toString().replaceAll("[\\[\\],]", ""));
    }
}
