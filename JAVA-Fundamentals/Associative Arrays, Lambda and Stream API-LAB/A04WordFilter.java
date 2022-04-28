package AssociaciveArr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class A04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<String> output = new ArrayList<>();

        for (int i = 0; i <input.length ; i++) {
            String word = input[i];
            if (word.length() %2 == 0)
            {
                output.add(word);
            }


        }

        output.forEach(a -> System.out.println(a));
    }
}
