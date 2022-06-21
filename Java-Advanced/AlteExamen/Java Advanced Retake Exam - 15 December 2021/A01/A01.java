package JavaAdvancedRetakeExam15December2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A01 {

    private static int currentFamale;
    private static int currentMale;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> malesStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(malesStack::push);

        Deque<Integer> queueFamales = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));


        int maches = 0;

        while (!malesStack.isEmpty() && !queueFamales.isEmpty()) {
            currentFamale = queueFamales.poll();
            currentMale = malesStack.pop();


            divideMale(malesStack);
            divideFamale(queueFamales);
            checkObNullFamales(queueFamales);
            checkObNullMale(malesStack);


            if (currentFamale != currentMale) {
                currentMale -= 2;
                if (currentMale > 0) {
                    malesStack.push(currentMale);
                }

            } else {
                maches++;
            }



        }


        System.out.println("Matches: " + maches);

        if (malesStack.isEmpty()) {
            System.out.println("Males left: none");
        } else {
            System.out.print("Males left: ");
            System.out.println(malesStack.toString().replaceAll("\\[", "").replaceAll("]", ""));
        }


        if (queueFamales.isEmpty()) {
            System.out.println("Females left: none");
        } else {
            System.out.print("Females left: ");
            System.out.print(queueFamales.toString().replaceAll("\\[", "").replaceAll("]", ""));

        }

    }


    private static void divideFamale(Deque<Integer> queueFamales) {
        if (currentFamale % 25 == 0  && currentMale != 0) {
            if (!queueFamales.isEmpty())
                currentFamale = queueFamales.poll();
            if (!queueFamales.isEmpty()) {
                currentFamale = queueFamales.poll();
            }

        }
        //checkObNullFamales(queueFamales);
    }

    private static void divideMale(Deque<Integer> malesStack) {
        if (currentMale % 25 == 0 && currentMale != 0) {
            if (!malesStack.isEmpty())
                currentMale = malesStack.pop();
            if (!malesStack.isEmpty()) {
                currentMale = malesStack.pop();
            }
        }
        // checkObNullMale(malesStack);
    }

    private static void checkObNullMale(Deque<Integer> malesStack) {
        if (currentMale <= 0 && !malesStack.isEmpty()) {
            currentMale = malesStack.pop();
        }
        if (currentMale <= 0 && !malesStack.isEmpty()) {
            checkObNullMale(malesStack);
        }
    }

    private static void checkObNullFamales(Deque<Integer> queueFamales) {
        if (currentFamale <= 0 && !queueFamales.isEmpty()) {
            currentFamale = queueFamales.poll();
        }
        if (currentFamale <= 0 && !queueFamales.isEmpty()) {
            checkObNullFamales(queueFamales);
        }
    }


}