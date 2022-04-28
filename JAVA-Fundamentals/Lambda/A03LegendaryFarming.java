package AssociaciveArrExerice;

import java.util.*;

public class A03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //    • "Shadowmourne" - requires 250 Shards
        //    • "Valanyr" - requires 250 Fragments
        //    • "Dragonwrath" - requires 250 Motes

        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards" , 0);
        items.put("fragments" , 0);
        items.put("motes" , 0);
        String winner = "";


        boolean ueberpriuefen = false;


        while (!ueberpriuefen) {
            String[] data = scanner.nextLine().split(" ");
            for (int i = 0; i < data.length; i += 2) {

                String material = data[i + 1].toLowerCase();
                int quantity = Integer.parseInt(data[i]);

                items.putIfAbsent(material, 0);
                items.put(material, items.get(material) + quantity);
                if (material.equals("motes") || material.equals("shards") || material.equals("fragments")) {

                    if (items.get(material) >= 250) {
                        ueberpriuefen = true;
                        winner = material;
                        items.put(material, items.get(material) - 250);
                        break;
                    }

                }

            }
        }
        switch (winner) {
            case "motes":
                System.out.println("Dragonwrath obtained!");


                break;
            case "shards":
                System.out.println("Shadowmourne obtained!");


                break;
            case "fragments":
                System.out.println("Valanyr obtained!");

                break;
        }
        items.forEach((k, v) -> System.out.printf("%s: %d%n", k, items.get(k)));
    }
}