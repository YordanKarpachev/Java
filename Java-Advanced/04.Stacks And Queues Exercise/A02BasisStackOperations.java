package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A02BasisStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int push = scanner.nextInt();
            stack.push(push);
        }


        for (int i = 0; i < s; i++) {

            stack.pop();
        }

        if(!stack.isEmpty()){
            if(stack.contains(x)){
                System.out.println("true");
            } else {
                System.out.println(Collections.min(stack));
            }

        }else {
            System.out.println(0);
        }
    }
}
