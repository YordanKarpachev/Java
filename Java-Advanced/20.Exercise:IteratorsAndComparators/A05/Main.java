package A05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Person> personList = new ArrayList<>();

        while (!input[0].equals("END")){

            Person person = new Person(input[0],Integer.parseInt(input[1]), input[2]);

            personList.add(person);

            input = scanner.nextLine().split(" ");
        }

                int n = Integer.parseInt(scanner.nextLine());

        Person person = personList.get(n - 1);
        int equal = 0;
        int notequal = 0;
        int totalnumber = personList.size() ;

        for (Person person1 : personList) {
            if (person.compareTo(person1) == 0){
                equal++;
            } else {
                notequal++;
            }
        }

        if( equal == 1){
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", equal, notequal, totalnumber);
        }
    }
}
