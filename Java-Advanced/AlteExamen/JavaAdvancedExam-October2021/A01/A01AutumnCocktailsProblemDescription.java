package JavaAdvancedExam23October2021;

import java.util.*;
import java.util.stream.Collectors;

public class A01AutumnCocktailsProblemDescription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> bucket = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> freshness = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Map<String, Integer> mixed = new TreeMap<>();
        mixed.put("Pear Sour", 0);  //150
        mixed.put("The Harvest", 0);  //250
        mixed.put("Apple Hinny", 0);   //300
        mixed.put("High Fashion", 0);   //400


        while (!bucket.isEmpty() && !freshness.isEmpty()) {


            bucket = bucket.stream().mapToInt(Integer::intValue).filter(value -> value > 0).boxed().collect(Collectors.toList());
            if(bucket.isEmpty()){
                continue;
            }

            int currentBucket = bucket.get(0);
            int crosscurrents = freshness.get(freshness.size() - 1);

            int result = currentBucket * crosscurrents;
            if (result == 150) {
                mixed.put("Pear Sour", mixed.get("Pear Sour") + 1);
                bucket.remove(0);
                freshness.remove(freshness.size() - 1);

            } else if (result == 250) {
                bucket.remove(0);
                freshness.remove(freshness.size() - 1);
                mixed.put("The Harvest", mixed.get("The Harvest") + 1);
            } else if (result == 300) {
                bucket.remove(0);
                freshness.remove(freshness.size() - 1);
                mixed.put("Apple Hinny", mixed.get("Apple Hinny") + 1);
            } else if (result == 400) {
                bucket.remove(0);
                freshness.remove(freshness.size() - 1);
                mixed.put("High Fashion", mixed.get("High Fashion") + 1);
            } else {
                freshness.remove(freshness.size() - 1);
                int integer = bucket.get(0);
                integer += 5;
                bucket.add(integer);
                bucket.remove(0);
            }


        }

        String output = mixed.get("Pear Sour") > 0 &&
                mixed.get("The Harvest") > 0 &&
                mixed.get("Apple Hinny") > 0 &&
                mixed.get("High Fashion") > 0 ? "It's party time! The cocktails are ready!" :
                "What a pity! You didn't manage to prepare all cocktails.";
        System.out.println(output);

        if (!bucket.isEmpty() && freshness.isEmpty()) {
            System.out.println("Ingredients left: " + bucket.stream().mapToInt(Integer::intValue).sum());
        }


        for (var entry : mixed.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.printf("# %s --> %d%n", entry.getKey(), entry.getValue());
            }
        }


    }
}
