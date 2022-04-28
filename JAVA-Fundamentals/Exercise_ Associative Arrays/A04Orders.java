package AssociaciveArrExerice;

import java.util.*;

public class A04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Map<String, List<Double>> data = new LinkedHashMap<>();


        while (!input[0].equals("buy")) {
            List<Double> priceUndMenge = new ArrayList<>();
            priceUndMenge.add(0, 0.0);
            priceUndMenge.add(1, 0.0);

            String produkt = input[0];
            double price = Double.parseDouble(input[1]);
            int menge = Integer.parseInt(input[2]);


            data.putIfAbsent(produkt, priceUndMenge);
            priceUndMenge.add(0, price);
            priceUndMenge.add(1, menge + data.get(produkt).get(1));

            data.put(produkt, priceUndMenge);


            input = scanner.nextLine().split(" ");
        }


        data.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v.get(0) * v.get(1)));
    }
}
