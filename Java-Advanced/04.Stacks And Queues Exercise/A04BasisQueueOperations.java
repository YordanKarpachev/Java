package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class A04BasisQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int push = scanner.nextInt();
            queue.offer(push);
        }


        for (int i = 0; i < s; i++) {

            queue.poll();
        }

        if (!queue.isEmpty()) {
            if (queue.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(queue));
            }

        } else {
            System.out.println(0);
        }
    }
}

