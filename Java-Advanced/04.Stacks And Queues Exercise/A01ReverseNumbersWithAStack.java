package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class A01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for(String s : data) {
            stack.push(s);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }

    }
}
