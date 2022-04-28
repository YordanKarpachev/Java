package StecksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class A01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String line = scanner.nextLine();
        ArrayDeque<String> browser = new ArrayDeque<>();
        String current = "";

        while (!line.equals("Home")) {
            if (line.equals("back")) {
                if (!browser.isEmpty()) { current = browser.pop();
                } else {
                    System.out.println("no previous URLs");
                    line = scanner.nextLine();
                    continue;}

            } else {

                if (!current.equals("")) {browser.push(current);}
                current = line;}

            System.out.println(current);

            line = scanner.nextLine();
        }
    }
}

