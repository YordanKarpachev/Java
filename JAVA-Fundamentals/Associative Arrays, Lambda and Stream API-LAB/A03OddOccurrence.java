package AssociaciveArr;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class A03OddOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Map<String, Integer> data = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String word = input[i].toLowerCase();
            data.putIfAbsent(word, 0);
            data.put(word, data.get(word) + 1);
        }

        List<String> odd = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : data.entrySet()) {


                if (entry.getValue() % 2 == 1) {
                   odd.add(entry.getKey());
                }

        }

        for (int i = 0; i < odd.size(); i++) {
            System.out.print(odd.get(i));
            if (i < odd.size() - 1){
                System.out.print(", ");
            }

        }

    }
}

