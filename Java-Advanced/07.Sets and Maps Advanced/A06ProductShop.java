package SetsAndMapsAdvancedLAB;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Map<String, Double>> productAndPrice = new TreeMap<>();
        while (!input.equals("Revision")){
            String[] data = input.split(", ");
            String shop = data[0];
            String product = data[1];
            Double price = Double.parseDouble(data[2]);

            productAndPrice.putIfAbsent(shop, new LinkedHashMap<>());
            productAndPrice.get(shop).put(product, price);

            input = scanner.nextLine();
        }


        for (String shop : productAndPrice.keySet()) {
            System.out.println(shop +"->");
            for (var entry: productAndPrice.get(shop).entrySet()){
                System.out.printf("Product: %s, Price: %.1f%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
