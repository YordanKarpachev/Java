package AssociaciveArr;

import java.util.*;

public class A02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonims = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String syn = scanner.nextLine();

            synonims.putIfAbsent(word,new ArrayList<>() );
            synonims.get(word).add(syn);

        }



        for (Map.Entry<String, List<String>> entry : synonims.entrySet())
        {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }

        }
    }

