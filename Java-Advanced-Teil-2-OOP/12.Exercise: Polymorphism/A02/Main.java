package A02;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        double fuelQuantity = Double.parseDouble(tokens[1]);
        double consumption = Double.parseDouble(tokens[2]);
        Car car = new Car(fuelQuantity, consumption, Double.parseDouble(tokens[3]));

        tokens = scanner.nextLine().split("\\s+");
        fuelQuantity = Double.parseDouble(tokens[1]);
        consumption = Double.parseDouble(tokens[2]);
        Truck truck = new Truck(fuelQuantity, consumption, Double.parseDouble(tokens[3]));

        tokens = scanner.nextLine().split("\\s+");
        fuelQuantity = Double.parseDouble(tokens[1]);
        consumption = Double.parseDouble(tokens[2]);
        Bus bus = new Bus(fuelQuantity, consumption, Double.parseDouble(tokens[3]));

        Map<String, vehicles> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            tokens = scanner.nextLine().split("\\s+");
            String vehicle = tokens[1];
            switch (tokens[0]) {
                case "Drive":
                    System.out.println(vehicles.get(vehicle).driving(Double.parseDouble(tokens[2])));
                    break;
                case "Refuel":
                    try {

                        vehicles.get(vehicle).refueling(Double.parseDouble(tokens[2]));
                    } catch (IllegalArgumentException e ){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "DriveEmpty":
                    System.out.println(bus.drivingEmpty(Double.parseDouble(tokens[2])));
                    break;
            }
        }

        vehicles.entrySet().stream().map(Map.Entry::getValue).forEach(System.out::println);

    }
}
