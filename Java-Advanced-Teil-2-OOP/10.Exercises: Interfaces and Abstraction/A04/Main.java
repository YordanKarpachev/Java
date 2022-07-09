package A04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyerMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            if (tokens.length == 4) {

                buyerMap.putIfAbsent(tokens[0], new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]));
                //{name} {age} {id} {birthdate} citirizen
            } else if (tokens.length == 3) {
                //"{name} {age}{group}" for a Rebel
                buyerMap.putIfAbsent(tokens[0], new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
            }
        }


        String line = scanner.nextLine();

        while (!line.equals("End")) {

            if (buyerMap.containsKey(line))
                buyerMap.get(line).buyFood();


            line = scanner.nextLine();
        }


            System.out.println(buyerMap.entrySet()
                    .stream()
                    .map(Map.Entry::getValue)
                    .map(Buyer::getFood)
                    .mapToInt(Integer::intValue)
                    .sum());



    }
}
