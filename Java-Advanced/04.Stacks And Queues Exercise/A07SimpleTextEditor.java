package StacksandQueuesExercise;

import java.util.ArrayDeque;

import java.util.Scanner;

public class A07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            switch (input[0]) {
                case "1":
                    sb.append(input[1]);
                    String current = sb.toString();
                    stack.push(current);
                    break;

                case "2":
                    int count = Integer.parseInt(input[1]);
                    int start = sb.length() - count;

                    sb.delete(start, sb.length());
                    current = sb.toString();
                    stack.push(current);
                    break;

                case "3":
                    int index = Integer.parseInt(input[1]);
                    System.out.println(sb.charAt(index - 1));
                    break;

                case "4":

                    if (stack.size() > 1) {
                        stack.pop();
                        sb = new StringBuilder(stack.peek());
                    } else {
                        sb = new StringBuilder();
                    }

                    break;
            }
        }
        System.out.println();
    }
}
