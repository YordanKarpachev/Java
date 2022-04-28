package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")){
           String[] inputArr = input.split(" ");
            String  command = inputArr[0];
           int element = Integer.parseInt(inputArr[1]);

            switch (command) {
                case "Insert":
                    int position = Integer.parseInt(inputArr[2]);
                    inputList.add(position,element);

                    break;


                case "Delete":

                    while (inputList.contains(element)){
                    inputList.remove(Integer.valueOf(element));}
                    break;
            }




            input = scanner.nextLine();
        }

        inputList.forEach(e -> System.out.print(e + " "));
    }
}
