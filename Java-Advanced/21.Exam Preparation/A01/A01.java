package ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class A01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(ingredients::push);



        Map<String, Integer> cockteilsMap = new TreeMap<>();
        cockteilsMap.putIfAbsent("Bread", 0);
        cockteilsMap.putIfAbsent("Cake", 0);
        cockteilsMap.putIfAbsent("Pastry", 0);
        cockteilsMap.putIfAbsent("Fruit Pie", 0);


        while (!ingredients.isEmpty() && !liquids.isEmpty()) {


            // int currentIngredients = ingredientsSTACK.poll();
            //   int currentLiquid = liquidQUEUE.pop();
            int lastIngredient = ingredients.pop();
            int sum = liquids.poll() + lastIngredient;



            String cockteil;

            switch (sum) {
                case 25:
                    cockteil = "Bread";
                    break;
                case 50:
                    cockteil = "Cake";
                    break;
                case 75:
                    cockteil = "Pastry";
                    break;
                case 100:
                    cockteil = "Fruit Pie";
                    break;
                default:
                    cockteil = null;
                break;



            }
            if (cockteil != null) {
                int integer = cockteilsMap.get(cockteil) + 1;
                cockteilsMap.put(cockteil , integer);
            } else {
                ingredients.push(lastIngredient + 3);
            }


        }

        String output =
                cockteilsMap.entrySet().stream().allMatch(a -> a.getValue() > 0) ?
                        "Wohoo! You succeeded in cooking all the food!" :
                        "Ugh, what a pity! You didn't have enough materials to cook everything.";
        System.out.println(output);


        String restLiquid = liquids.isEmpty() ? "none" :


                liquids.stream().map(String::valueOf).collect(Collectors.joining(", "));

        System.out.println("Liquids left: " + restLiquid);

        String restIngredients = ingredients.isEmpty() ? "none" :
                ingredients.stream().map(String::valueOf)
                        .collect(Collectors.joining(", "));

        System.out.println("Ingredients left: " + restIngredients);

        cockteilsMap.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
