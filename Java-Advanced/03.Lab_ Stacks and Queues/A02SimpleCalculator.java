package StecksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class A02SimpleCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");

        Deque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack, data);
        System.out.println();

        while (stack.size() > 1){
            int first = Integer.valueOf(stack.pop());
            String op = stack.pop();
            int second = Integer.valueOf(stack.pop());

            switch (op) {
                case "+":
                    stack.push(String.valueOf(first + second));
                    break;
                case "-":
                    stack.push(String.valueOf(first - second));
                    break;
            }
        }
        System.out.println(stack.pop());

    }
}