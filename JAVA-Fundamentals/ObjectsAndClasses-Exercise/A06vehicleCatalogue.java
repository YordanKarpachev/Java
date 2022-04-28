package ObjekteUndKLassenExercisse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A06vehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        List<Wagen> caras = new ArrayList<>();


        while (!command.equals("End")) {
            String[] data = command.split(" ");


            Wagen car = new Wagen(data[0], data[1], data[2], Integer.parseInt(data[3]));
            caras.add(car);


            command = scanner.nextLine();
        }

        String data = scanner.nextLine();
        while (!data.equals("Close the Catalogue")) {
            String model = data;

            caras.stream().filter(a -> a.getModel().equals(model)).forEach(a -> System.out.println(a.toString()));
            data = scanner.nextLine();
        }

        List<Wagen> cars = caras.stream().filter(a -> a.getType().equals("car")).collect(Collectors.toList());
        List<Wagen> trucks = caras.stream().filter(a -> a.getType().equals("truck")).collect(Collectors.toList());

        double carsPower = avgHp(cars);
        double truckspower = avgHp(trucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n", carsPower);
        System.out.printf("Trucks have average horsepower of: %2.2f.", truckspower);


    }

    static double avgHp(List<Wagen> wagens) {
        if (wagens.size() == 0) {
            return 0;
        }

        return wagens.stream().mapToDouble(Wagen::getPower).sum() / wagens.size();
    }

    static class Wagen {

        String type;
        String model;
        String color;
        int power;

        public String getType() {
            return type;
        }


        public String getModel() {
            return model;
        }


        public int getPower() {
            return power;
        }


        public Wagen(String type, String model, String color, int power) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.power = power;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" +
                            "Model: %s%n" +
                            "Color: %s%n" +
                            "Horsepower: %d",
                    getType().toUpperCase().charAt(0) + getType().substring(1), this.model, this.color, this.power);
        }
    }
}
