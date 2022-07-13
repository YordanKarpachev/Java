package A03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        List<Animal> animals = new ArrayList<>();


        while (!tokens[0].equals("End")){
            Animal animal = createAnimal(tokens);
            animals.add(animal);
            animal.makeSound();
            tokens = scanner.nextLine().split("\\s+");
            Food food = getFood(tokens);
          try {

              animal.eat(food);
          } catch (IllegalArgumentException e){
              System.out.println(e.getMessage());
          }





            tokens = scanner.nextLine().split("\\s+");
        }

        animals.forEach(System.out::println);






    }

    private static Food getFood(String[] tokens) {
        if(tokens[0].equals("Vegetable")){
            return new Vegetable(Integer.parseInt(tokens[1]));
        }
        return new Meat(Integer.parseInt(tokens[1]));
    }


    public static Animal createAnimal (String[] tokens) {
        String name = tokens[1];
        String type = tokens[0];
        double weight = Double.parseDouble(tokens[2]);
        String livingReagion = tokens[3];


        switch (type){
            case "Zebra":
                return new Zebra(name, type, weight,livingReagion );

            case "Cat":
                String bread = tokens[4];
                return new Cat(name, type, weight,livingReagion, bread);

            case "Tiger":
                return new Tiger(name, type, weight,livingReagion );

            case "Mouse":
                return new Mouse(name, type, weight,livingReagion );
            default:
                throw  new IllegalArgumentException("no such animal");
        }

    }
}
