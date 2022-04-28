package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String inputCommands = scanner.nextLine();

        while (!inputCommands.equals("3:1")) {

            String[] command = inputCommands.split(" ");
            String mergeOrDivide = command[0];

            //merge {startIndex} {endIndex}
            //divide {index} {partitions}

            switch (mergeOrDivide) {
                case "merge":


                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);

                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > inputList.size() - 1) {
                        endIndex = inputList.size() - 1;
                    }

                    int counter = startIndex;

                    for (int i = startIndex; i < endIndex; i++) {
                        String concat = inputList.get(counter) + inputList.get(counter + 1);
                        inputList.set(counter, concat);
                        inputList.remove(counter + 1);
                    }


                    break;


                case "divide":
                    int index = Integer.parseInt(command[1]);
                    int partitions = Integer.parseInt(command[2]);

                    if (index >= 0 && index < inputList.size() && partitions >= 0 && partitions <= 100) {
                        String element = inputList.get(index);
                        List<String> newList = new ArrayList<>();

                        if (element.length() % partitions == 0) {
                            int portionLength = element.length() / partitions;
                            int count = 0;
                            for (int i = 0; i < partitions; i++) {
                                String concat = "";
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }
                                newList.add(concat);
                            }
                        } else {
                            int portionLength = element.length() / partitions;
                            int count = 0;
                            for (int i = 0; i < partitions; i++) {
                                String concat = "";

                                if (i == partitions - 1) {
                                    for (int j = count; j < element.length(); j++) {
                                        char symbol = element.charAt(count);
                                        concat += symbol;
                                        count++;
                                    }
                                } else {
                                    for (int j = 0; j < portionLength; j++) {
                                        char symbol = element.charAt(count);
                                        concat += symbol;
                                        count++;
                                    }
                                }
                                newList.add(concat);
                            }
                        }
                        inputList.remove(index);
                        inputList.addAll(index, newList);
                    }
                    break;
            }


            inputCommands = scanner.nextLine();
        }

        inputList.forEach(e -> System.out.print(e + " "));
    }
}