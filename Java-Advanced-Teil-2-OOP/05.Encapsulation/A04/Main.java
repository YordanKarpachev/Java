package A04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Team team = new Team("Black Eagles");
        for (int i = 0; i < n; i++) {
            String[] daten = scanner.nextLine().split(" ");
            Person person = new Person(daten[0], daten[1], Integer.parseInt(daten[2]), Double.parseDouble(daten[3]));
            team.addPlayer(person);
        }

        System.out.println("First team have "+ team.getFirstTeam().size() + " players");
        System.out.println("First team have "+ team.getReserveTeam().size() + " players");
    }
}
