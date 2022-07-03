package A04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean fertig = true;
        Scanner scanner = new Scanner(System.in);
        Pizza pizza = null;
        String[] inputPizza = scanner.nextLine().split(" ");
        try {

          pizza = new Pizza(inputPizza[1], Integer.parseInt(inputPizza[2]));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        String[] inputDough = scanner.nextLine().split(" ");
        try {

            Dough dough = new Dough(inputDough[1], inputDough[2], Double.parseDouble(inputDough[3]));
            if(pizza != null)
            pizza.setDough(dough);
        } catch (IllegalArgumentException e) {
            fertig = false;
            System.out.println(e.getMessage());

        }


        String[] inputTopping = scanner.nextLine().split(" ");

        while (!inputTopping[0].equals("END") && fertig) {

            try {
                Topping topping = new Topping(inputTopping[1], Double.parseDouble(inputTopping[2]));
                if(pizza != null)
                pizza.addTopping(topping);
            } catch (IllegalArgumentException io){
                System.out.println(io.getMessage());
                fertig = false;
            }


            inputTopping = scanner.nextLine().split(" ");
        }

        if(fertig){
            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        }

        System.out.println();
    }
}
