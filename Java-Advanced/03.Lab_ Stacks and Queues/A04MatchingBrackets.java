package StecksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class A04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch =='('){
                stack.push(i);
            } else if (ch == ')' ){
                int startIdex = stack.pop();
                String contents = expression.substring(startIdex, i+1);
                System.out.println(contents);
            }
        }

    }
}
