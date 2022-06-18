package JavaAdvancedRetakeExam13April2022;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class A01Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> steel = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> carbon = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        Map<String, Integer> weapons = new TreeMap<>();
        while (steel.size() > 0 && carbon.size() > 0) {
            int currentSteel = steel.get(0);
            int currentCarbon = carbon.get(carbon.size() - 1);
            int sum = currentCarbon + currentSteel;


            switch (sum) {
                case 70: //Gladius
                    weapons.putIfAbsent("Gladius", 0);
                    weapons.put("Gladius", weapons.get("Gladius") + 1);
                    steel.remove(0);
                    carbon.remove(carbon.size() - 1);

                    break;
                case 80:
                    weapons.putIfAbsent("Shamshir", 0);
                    weapons.put("Shamshir", weapons.get("Shamshir") + 1);
                    steel.remove(0);
                    carbon.remove(carbon.size() - 1);

                    break;
                case 90:
                    weapons.putIfAbsent("Katana", 0);
                    weapons.put("Katana", weapons.get("Katana") + 1);
                    steel.remove(0);
                    carbon.remove(carbon.size() - 1);

                    break;
                case 110:
                    weapons.putIfAbsent("Sabre", 0);
                    weapons.put("Sabre", weapons.get("Sabre") + 1);
                    steel.remove(0);
                    carbon.remove(carbon.size() - 1);

                    break;
                default:
                    steel.remove(0);
                    carbon.set(carbon.size() - 1, carbon.get(carbon.size() - 1) + 5);

                    break;
            }

        }
        if (!weapons.isEmpty()) {
            int sum = 0;
            for (var w : weapons.entrySet())
            {
               sum += w.getValue();
            }
            System.out.printf("You have forged %d swords.%n", sum);
        } else {
            System.out.println("You did not have enough resources to forge a sword.");
        }


        if(steel.size() == 0){
            System.out.println("Steel left: none");
        } else {
            StringBuilder sb = new StringBuilder();
            steel.forEach(a -> sb.append(String.format("%s , ", a)));

            System.out.println("Steel left: " + sb.toString().trim());

        }

        if(carbon.size() == 0){
            System.out.println("Carbon left: none");
        } else {

            System.out.print("Carbon left: ");

            Collections.reverse(carbon);
            for (int i = 0; i < carbon.size(); i++) {
                if(i == carbon.size() - 1){
                    System.out.print(carbon.get(i));
                    System.out.println();
                } else {
                    System.out.print(carbon.get(i) + ", ");

                }
            }


            weapons.entrySet().stream().sorted(Map.Entry.comparingByKey());
            weapons.entrySet().forEach(a -> System.out.printf("%s: %d%n", a.getKey(), a.getValue()));
        }




    }


}
