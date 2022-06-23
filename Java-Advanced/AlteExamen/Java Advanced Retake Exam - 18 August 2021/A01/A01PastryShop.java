package JavaAdvancedRetakeExamAugust2021;

import java.util.*;
import java.util.stream.Collectors;

public class A01PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(ingredients::push);


        //  System.out.println(queueLiquid.poll());
        //  System.out.println(stackIngrediens.pop());

        Map<String, Integer> cookiesMap = new LinkedHashMap<>();
        cookiesMap.put("Biscuit", 0);
        cookiesMap.put("Cake", 0);
        cookiesMap.put("Pie", 0);
        cookiesMap.put("Pastry", 0);

        while (!ingredients.isEmpty() && !liquids.isEmpty()) {
            int lastIngredient = ingredients.pop();
           // int currentQueue = queueLiquid.poll();
            int sum = liquids.poll() + lastIngredient ;

            String current;
            switch (sum) {
                case 25:
                    current = "Biscuit";
                    break;
                case 50:
                    current = "Cake";
                    break;
                case 75:
                    current = "Pastry";
                    break;
                case 100:
                    current = "Pie";
                    break;
                default:
                    current = null;
                break;
            }

            if (current != null) {

                Integer integer = cookiesMap.get(current) + 1;
                cookiesMap.put(current, integer);

            } else {

                ingredients.push(lastIngredient + 3);
            }


        }


        System.out.println(cookiesMap.entrySet().stream().allMatch(a -> a.getValue() > 0)
                ? "Great! You succeeded in cooking all the food!"
                : "What a pity! You didn't have enough materials to cook everything.");

        String currentLiquid = liquids.isEmpty() ? "none" :
                liquids.stream().map(String::valueOf).collect(Collectors.joining(", "));

        System.out.println("Liquids left: " + currentLiquid);

        String currentIngredients = ingredients.isEmpty() ? "none" :
                ingredients.stream().map(String::valueOf).collect(Collectors.joining(", "));

        System.out.println("Ingredients left: " + currentIngredients);



     cookiesMap.forEach((key, vlaue ) -> System.out.printf("%s: %d%n", key, vlaue));


    }
}
