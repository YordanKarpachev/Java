package DefiningClassesExercise.A01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> listOfPersons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            Person person = new Person();
            person.name = data[0];
            person.age = Integer.parseInt(data[1]);
            listOfPersons.add(person);
        }


        listOfPersons.stream().filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(a -> System.out.println(a.getName()+" - "+a.getAge()));
    }
}
