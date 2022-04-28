package StecksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<String> data = new ArrayDeque<>();


        while (!input.equals("print")){
            if (input.equals("cancel")){
                if (data.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                   String current =  data.poll();
                    System.out.println("Canceled " + current);
                }

            } else {
                data.offer(input);
            }

            input = scanner.nextLine();
        }
        System.out.println(data.stream().map(String::valueOf).collect(Collectors.joining(System.lineSeparator())));
    }
}
