package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class A05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String aktuelleCommand = command.split(" ")[0];

            String evenOddOrCondition = command.split(" ")[1];

            switch (aktuelleCommand) {
                case "Contains":
                    int containsNumber = Integer.parseInt(command.split(" ")[1]);
                    if (inputList.contains(containsNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }

                    break;

                case "Print":
                    if (evenOddOrCondition.equals("even")) { //chetni
                        for (int i = 0; i < inputList.size(); i++) {
                            if (inputList.get(i) % 2 == 0)
                                System.out.print(inputList.get(i) + " ");

                        }
                        System.out.println();
                    } else if (evenOddOrCondition.equals("odd")) {  //nechetni
                        for (int i = 0; i < inputList.size(); i++) {
                            if (inputList.get(i) % 2 == 1)
                                System.out.print(inputList.get(i) + " ");

                        }
                        System.out.println();
                    }
                    break;

                case "Get":
                    int sum = 0;

                    for (int i = 0; i < inputList.size(); i++) {
                        sum += inputList.get(i);
                    }
                    System.out.println(sum);

                    break;

                case "Filter":

                    int filterNumber = Integer.parseInt(command.split(" ")[2]);
                    switch (evenOddOrCondition) {
                        case "<":
                            for (int i = 0; i < inputList.size(); i++) {
                                if(inputList.get(i) < filterNumber){
                                    System.out.print(inputList.get(i) + " ");
                                }
                            }
                            System.out.println();

                            break;
                        case ">":
                            for (int i = 0; i < inputList.size(); i++) {
                                if(inputList.get(i) > filterNumber){
                                    System.out.print(inputList.get(i) + " ");
                                }

                            }    System.out.println();

                            break;
                        case "<=":
                            for (int i = 0; i < inputList.size(); i++) {
                                if(inputList.get(i) <= filterNumber){
                                    System.out.print(inputList.get(i) + " ");
                                }

                            }  System.out.println();

                            break;
                        case ">=":
                            for (int i = 0; i < inputList.size(); i++) {
                                if(inputList.get(i) >= filterNumber){
                                    System.out.print(inputList.get(i) + " ");
                                }

                            }  System.out.println();

                            break;

                    }

            }


            command = scanner.nextLine();
        }


        // System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
    }
}
