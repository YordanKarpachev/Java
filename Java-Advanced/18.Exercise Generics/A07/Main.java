package A07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        CustomList<String> customList = new CustomList<>();
        while (!input.equals("END")){
            String command = input.split(" ")[0];
            String element;
            int index;
            int index2;


            switch (command){
                case "Add":
                     element = input.split(" ")[1];

                    customList.add(element);
                    break;
                case "Remove":
                 index = Integer.parseInt(input.split(" ")[1]);
                    customList.remove(index);

                    break;
                case "Contains":
                    element = input.split(" ")[1];
                    System.out.println(customList.contains(element));
                    break;
                case "Swap":
                    index = Integer.parseInt(input.split(" ")[1]);
                    index2 = Integer.parseInt(input.split(" ")[2]);
                    customList.swap(index, index2);
                    break;
                case "Greater":
                    element = input.split(" ")[1];
                    System.out.println(customList.countGreaterThan(element));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    System.out.println(customList.toString());
                    break;

            }



            input = scanner.nextLine();
        }

        System.out.println();
    }
}
