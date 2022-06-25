package ispit;

import java.util.*;
import java.util.stream.Collectors;

public class A01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> milch = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        List<Double> choko = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        Map<String , Integer> getraenke = new TreeMap<>();
        getraenke.putIfAbsent("Milk Chocolate", 0);
        getraenke.putIfAbsent("Dark Chocolate", 0);
        getraenke.putIfAbsent("Baking Chocolate", 0);


        while (!milch.isEmpty() && !choko.isEmpty()){
            double currentMilch = milch.get(0);
            milch.remove(0);

            double currentChoko = choko.get(choko.size()-1);

            choko.remove(choko.size() -1);

            double sum = currentChoko + currentMilch;
            currentChoko /= sum;
            currentChoko *=100;

            int ende = (int)currentChoko;
            String name = null;
            switch (ende){
                case 30:
                    name = "Milk Chocolate";
                    break;
                case 50:
                    name = "Dark Chocolate";
                    break;
                case 100:
                    name = "Baking Chocolate";
                    break;
            }

            if(name != null){
                int integer = getraenke.get(name);
                getraenke.put(name, integer + 1);
            } else {
                currentMilch += 10;
                milch.add(currentMilch);
            }


        }



        boolean chokolateTime = getraenke.entrySet().stream().allMatch(a -> a.getValue() > 0);

        if(chokolateTime){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        for (var entry : getraenke.entrySet()){
            if(entry.getValue() >0){
                System.out.println("# " + entry.getKey() + " --> " + entry.getValue());
            }
        }



    }
}
