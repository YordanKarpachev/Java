package A01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                int n = Integer.parseInt(scanner.nextLine());

                while (n-- > 0 ){
                    String[] data = scanner.nextLine().split(" ");
                    String brand = data[0];
                    String model = data[1];
                   int power = Integer.parseInt(data[2]);
                   Car car1 = new Car();
                   car1.setBrand(brand);
                   car1.setModel(model);
                   car1.setHorsepower(power);
                    System.out.println(car1.carInfo());
                }
    }
}
