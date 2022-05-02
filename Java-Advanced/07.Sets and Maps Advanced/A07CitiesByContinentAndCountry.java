package SetsAndMapsAdvancedLAB;

import java.util.*;

public class A07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> data = new LinkedHashMap();

        while (n-- >0) {
            String[] input = scanner.nextLine().split(" ");
            String countinent = input[0];
            String land = input[1];
            String stadt = input[2];

            data.putIfAbsent(countinent, new LinkedHashMap<>());

            Map<String, List<String>> landMap = data.get(countinent);

         landMap.putIfAbsent(land, new ArrayList<>());

         landMap.get(land).add(stadt);

        }
      /*  data.entrySet().stream().forEach(a -> {
            System.out.println(a.getKey() +":");
            a.getValue().entrySet().stream().forEach(ie ->{
                System.out.println("  "+ ie.getKey()+ " -> "+ String.join(", ", ie.getValue()));
            });
        });*/

data.entrySet().stream().forEach(a -> {
    System.out.println(a.getKey() +":");
    a.getValue().entrySet().stream().forEach(ie -> {
        System.out.println("  " + ie.getKey()+ " -> " + String.join(", ", ie.getValue()));
    });
});
    }
}
