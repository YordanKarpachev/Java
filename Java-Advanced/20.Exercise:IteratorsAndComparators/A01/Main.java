package A01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ListyIterator listyIterator = new ListyIterator();
        while (!input[0].equals("END")) {

            switch (input[0]) {
                case "Create":
                    if (input.length > 1) {
                        listyIterator = new ListyIterator(Arrays.copyOfRange(input, 1, input.length ));
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());

                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":

                    try {
                        listyIterator.print();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid Operation!");
                    }
                    break;

            }


            input = scanner.nextLine().split(" ");
        }
    }
}
