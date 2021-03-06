package StacksandQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class A09PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int n = Integer.parseInt(scanner.nextLine());
                int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                int[] days = new int[n];

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        for (int i = 1; i < numbers.length ; i++) {
            int day = 0;

            while (!stack.isEmpty() && numbers[stack.peek()] >= numbers[i]){
                day = Math.max(day, days[stack.pop()]);

            }

            if (!stack.isEmpty()){
                days[i] = day +1;
            }

            stack.push(i);

        }
        System.out.println(Arrays.stream(days).max().getAsInt());
    }
}
