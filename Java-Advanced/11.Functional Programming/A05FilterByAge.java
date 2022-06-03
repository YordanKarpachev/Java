package FunctionalProgramingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.logging.Filter;

public class A05FilterByAge {

    public static class Person {
      private final   String name;
       private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            personList.add(new Person(name, age));


        }
        String conditionParm = scanner.nextLine();
        int agelimit = Integer.parseInt(scanner.nextLine());
        String[] format = scanner.nextLine().split(" ");

        Predicate<Person> filter = getFilter(conditionParm, agelimit);
        Consumer<Person> printer = getPrinter(format);

        personList.stream().filter(filter).forEach(printer);
    }

    public static Predicate<Person> getFilter (String condition, int age ){
        return  condition.equals("older") ?
                p -> p.age >= age :
                p -> p.age <= age;



    }

    public static Consumer<Person> getPrinter (String[] format){
        if (format.length == 2 ){
            return p -> System.out.println(p.name + " - " + p.age);
        } else if (format[0]. equals("name")){
            return p -> System.out.println(p.name);
        }
        return p -> System.out.println(p.age);
    }
}
