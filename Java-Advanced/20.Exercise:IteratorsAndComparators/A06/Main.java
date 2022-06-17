package A06;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int n = Integer.parseInt(scanner.nextLine());

        TreeSet<Person> ageComparator = new TreeSet<>(new AgeComparator());
        TreeSet<Person> nameComparator = new TreeSet<>(new NameComparator());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            Person person = new Person(name, age);
            ageComparator.add(person);
            nameComparator.add(person);
        }

        for (Person person : nameComparator) {
            System.out.println(person);


        }

        for (Person person : ageComparator) {
            System.out.println(person);
        }
    }
}
