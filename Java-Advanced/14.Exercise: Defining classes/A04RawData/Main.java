package DefiningClassesExercise.A04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int n = Integer.parseInt(scanner.nextLine());


                List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String [] tokens = scanner.nextLine().split(" ");

            String model = tokens[0];
            Model model1 = new Model(model);


            int engineSPeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            Engine engine = new Engine(engineSPeed,enginePower);

            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Cargo cargo = new Cargo(cargoType, cargoWeight);

            List<Tire> tires = new ArrayList<>();
            for (int j = 5; j < tokens.length; j+=2) {
                double tirePressure = Double.parseDouble(tokens[j]);
                int tireAge = Integer.parseInt(tokens[j+1]);
                Tire tire = new Tire(tirePressure, tireAge);
                tires.add(tire);

            }

            Car car = new Car(model1, engine, cargo, tires);
            cars.add(car);



        }

        String command = scanner.nextLine();
        if(command.equals("fragile")){
            cars.stream().filter(a -> a.getCargo().getType().equals("fragile"))
                    .filter(a -> a.getTires().stream().anyMatch(tire -> tire.getPressure() < 1))
                    .forEach(a -> System.out.println(a.getModel().getModel()));
        } else  {

            cars.stream().filter(a -> a.getCargo().getType().equals("flamable"))
                    .filter(a -> a.getEngine().getPower() > 250)
                    .forEach(a -> System.out.println(a.getModel().getModel()));

        }

        //"{Model} {EngineSpeed} {EnginePower} {CargoWeight} {CargoType} {Tire1Pressure}
        // {Tire1Age} {Tire2Pressure} {Tire2Age} {Tire3Pressure} {Tire]’3Age} {Tire4Pressure} {Tire4Age}"
    }
}
