package DefiningClassesExercise.A07;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        Map<String, Person> personMap = new HashMap<>();
        while (!tokens[0].equals("End")){
            String personName = tokens[0];
            String elementToAdd = tokens[1];
            personMap.putIfAbsent(personName, new Person(personName));

            switch (elementToAdd){
                case "company":
                    //    • "{Name} company {companyName} {department} {salary}"
                    String companyName = tokens[2];
                    String departmen = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    personMap.get(personName).setCompany(new Company(companyName, departmen, salary));


                    break;
                case "pokemon":
                    //    • "{Name} pokemon {pokemonName} {pokemonType}"
                    String pokemonName = tokens[2];
                    String type = tokens[3];
                    personMap.get(personName).addPokemon(new Pokemon(pokemonName, type));

                    break;
                case "parents":
                    //    • "{Name} parents {parentName} {parentBirthday}"
                    String parentsName = tokens[2];
                    String birthday = tokens[3];


                    personMap.get(personName).addParents(new Parents(parentsName, birthday));


                    break;
                case "children":
                    //    • "{Name} children {childName} {childBirthday}"
                    String childernName = tokens[2];
                    String childernbirthday = tokens[3];
                    personMap.get(personName).addChildren(new Children(childernName, childernbirthday));

                    break;
                case "car":
                    String carName = tokens[2];
                    int speed = Integer.parseInt(tokens[3]);
                    personMap.get(personName).addCar(new Car(carName, speed));

                    //    • "{Name} car {carModel} {carSpeed}"
                    break;
            }



            tokens = scanner.nextLine().split("\\s+");
        }

        String line = scanner.nextLine();
      /*  Person person = personMap.get(line);
        System.out.println(person.toString());
        System.out.println("Company:");
        person.printCompany();
        System.out.println("Car:");
        person.printCar();
        System.out.println("Pokemon:");
        person.printPokemon();
        System.out.println("Parents:");
        person.getParents();
        System.out.println("Children:");
        person.printChildern(); */
        System.out.println(personMap.get(line));
    }
}
