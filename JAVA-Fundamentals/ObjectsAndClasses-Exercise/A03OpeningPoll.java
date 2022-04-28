package ObjekteUndKLassenExercisse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A03OpeningPoll {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String data[] = scanner.nextLine().split(" ");
            Person person = new Person(data[0], Integer.parseInt(data[1]));
            persons.add(person);


        }


persons.stream().sorted((p1, p2 ) -> p1.getName().compareTo(p2.getName())).filter(p1 -> p1.getAge() > 30)
        .forEach(p1 -> System.out.println(p1.toString()));
    }





    static class  Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        private int getAge() {
            return  this.age;
        }
        private String getName(){
            return this.name;
        }

        @Override
        public String toString() {
            return String.format("%s - %d",getName(),getAge());
        }
    }
}
