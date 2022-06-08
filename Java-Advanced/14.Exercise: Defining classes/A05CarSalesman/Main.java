package DefiningClassesExercise.A05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engineMap = new HashMap<>();
        Set<Car> cars = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int power = Integer.parseInt(tokens[1]);
            Engine engine = null;

            switch (tokens.length) {
                case 2:
                    engine = new Engine(model, power);
                    engineMap.put(model, engine);
                    break;
                case 3:
                    if (tokens[2].matches("\\d+")) {
                        int displacement = Integer.parseInt(tokens[2]);
                        engine = new Engine(model, power, displacement);

                    } else {
                        String efficiency = tokens[2];
                        engine = new Engine(model, power, efficiency);
                    }
                    engineMap.put(model, engine);

                    break;
                case 4:
                    int displacement = Integer.parseInt(tokens[2]);
                    String efficiency = tokens[3];
                    engine = new Engine(model, power, displacement, efficiency);
                    engineMap.put(model, engine);
                    break;
            }


        }



        int m = Integer.parseInt(scanner.nextLine());




        for (int i = 0; i < m; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            String engineModel = input[1];
            Engine engine = engineMap.get(engineModel);
            int weight;
            String color;

            switch (input.length) {
                case 2:

                    Car car = new Car(model, engine);
                    cars.add(car);

                    break;
                case 3:

                    if (input[2].matches("\\d+")) {
                        weight = Integer.parseInt(input[2]);
                        Car car1 = new Car(model, engine, weight);
                        cars.add(car1);
                    } else {
                        color = input[2];
                        car = new Car(model, engine, color);
                        cars.add(car);
                    }

                    break;
                case 4:
                    weight = Integer.parseInt(input[2]);
                    color = input[3];
                    Car car1 = new Car(model, engine, weight, color);
                    cars.add(car1);
                    break;
            }

            // {Weight} {Color} nee zadaljitelno

        }
        if (!cars.isEmpty()) {
            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }
}
