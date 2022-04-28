package StacksAndQueuesExercise;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayDeque;
import java.util.Scanner;

public class A05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<Character> openStack = new ArrayDeque<>();
        boolean isTrue = true;
        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);

            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                openStack.push(currentBracket);
            } else if (currentBracket == ')' || currentBracket == '}' || currentBracket == ']') {
                if (!openStack.isEmpty()) {
                    char stackCurrent = openStack.pop();
                    if ((stackCurrent == '(' && currentBracket == ')') ||
                            (stackCurrent == '[' && currentBracket == ']') ||
                            (stackCurrent == '{' && currentBracket == '}')) {
                        isTrue = true;
                    } else {
                        isTrue = false;
                        break;
                    }
                } else {
                    isTrue = false;
                    break;
                }
            }


        }
        if (isTrue) {
            System.out.println("YES");
        } else {            System.out.println("NO");}
    }

}
