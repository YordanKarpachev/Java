package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class A03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("1")) {
                stack.push(Integer.parseInt(input[1]));

            } else if (input[0].equals("2")) {

                stack.pop();
            } else if (input[0].equals("3")) {

                System.out.println(Collections.max(stack));
            }
        }
    }
}
