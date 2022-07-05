package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String AnimalType = scanner.nextLine();


        while (!AnimalType.equals("Beast!")) {


            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            String gender = null;
            try {
                switch (AnimalType) {

                    case "Dog":

                        gender = data[2];
                        Dog dog = new Dog(name, age, gender);
                        System.out.println(dog.toString());


                        break;
                    case "Cat":

                        gender = data[2];
                        Cat cat = new Cat(name, age, gender);
                        System.out.println(cat.toString());


                        break;
                    case "Frog":


                        gender = data[2];
                        Frog frog = new Frog(name, age, gender);
                        System.out.println(frog.toString());

                        break;
                    case "Kittens":

                        Kitten kitten = new Kitten(name, age);
                        System.out.println(kitten.toString());


                        break;
                    case "Tomcat":

                        Tomcat tomcats = new Tomcat(name, age);
                        System.out.println(tomcats.toString());

                        break;

                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


            AnimalType = scanner.nextLine();
        }


    }
}
