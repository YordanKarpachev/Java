package ObjekteUndKLassenExercisse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A07OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] data = input.split(" ");
            Person person = new Person(data[0],data[1],Integer.parseInt(data[2]) );
            personList.add(person);
            input = scanner.nextLine();
        }


        personList.stream().sorted((p1 , p2 ) -> Integer.compare(p1.getAge(), p2.getAge())).forEach(a -> System.out.println(a.toString()));
    }


    static class Person {
        String name;
        String id;
        int age;


        public int getAge() {
            return age;
        }

        public Person(String name, String id, int age) {

            this.name = name;
            this.id = id;
            this.age = age;
        }

        public void getName() {
            this.name = name;
        }

        public void getId() {
            this.id = id;

        }
        @Override public String toString(){
        return String.format("%s with ID: %s is %s years old.", name, id,age);
        }
    }
}
