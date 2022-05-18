package StacksAndQueuesLAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class A08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String current = "";


        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (stack.size() < 2) {
                    System.out.println("no previous URLs");
                    //  input = scanner.nextLine();
                    //   continue;
                } else {
                    // current = stack.pop();
                    // queue.offer(current);
                    queue.addFirst(stack.peek());
                    stack.pop();
                    System.out.println(stack.peek());
                }
            } else if (input.equals("forward")) {
                if (queue.isEmpty()) {
                    System.out.println("no next URLs");
                    //   input = scanner.nextLine();
                    //  continue;
                } else {
                    System.out.println(queue.peek());
                    stack.push(queue.pop());
                }
                //  input = scanner.nextLine();
                // continue;}
            } else {
            /*    if (!current.equals("")) {
                    stack.push(current);
                    queue = new ArrayDeque<>();
                }
                current = input;
            }
*/
            System.out.println(input);
            stack.push(input);
            queue = new ArrayDeque<>();}

            input = scanner.nextLine();
        }
    }
}
