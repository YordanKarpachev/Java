package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> vagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxPersons = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");

            if (command[0].equals("Add")) {
                int persons = Integer.parseInt(command[1]);

                vagons.add(persons);

            }  else {

                int persons = Integer.parseInt(command[0]);

                for (int i = 0; i < vagons.size(); i++) {

                    if (vagons.get(i) + persons <= maxPersons) {
                        vagons.set(i, vagons.get(i) + persons);
                        break;
                    }

                }

            }


            input = scanner.nextLine();

        }
        vagons.forEach(i -> System.out.print(i + " ") );

    }
}
