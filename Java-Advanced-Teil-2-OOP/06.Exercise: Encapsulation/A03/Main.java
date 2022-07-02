package T06ExerciseEncapsulation.A03ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] personen = scanner.nextLine().split(";");
        String[] productDaten = scanner.nextLine().split(";");


        Map<String, Person> people = new LinkedHashMap<>();

        for (int i = 0; i < personen.length; i++) {
            String[] currentPerson = personen[i].split("=");
            String name = currentPerson[0];
            double money = Double.parseDouble(currentPerson[1]);

            try {
                Person person = new Person(name, money);
                people.putIfAbsent(name, person);
                people.put(name, person);
            } catch (IllegalArgumentException iA) {
                System.out.println(iA.getMessage());
            }
        }


        Map<String, Product> products = new HashMap<>();

        for (int i = 0; i < productDaten.length; i++) {
            String[] currentProduct = productDaten[i].split("=");
            String currentProductName = currentProduct[0];
            double cost = Double.parseDouble(currentProduct[1]);

            try {
                Product product = new Product(currentProductName, cost);
                products.putIfAbsent(currentProductName, product);
                products.put(currentProductName, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }


        String[] command = scanner.nextLine().split(" ");


        while (!command[0].equals("END")) {

            String personName = command[0];
            String productName = command[1];

            Person person = people.get(personName);
            Product product1 = products.get(productName);

            if (person != null) {
                try {
                    person.buyProduct(product1);
                } catch (IllegalArgumentException ie) {
                    System.out.println(ie.getMessage());
                }
            }
            command = scanner.nextLine().split(" ");
        }


        people.entrySet().forEach(entry -> {
            System.out.println(entry.getValue());
        });
    }

}

