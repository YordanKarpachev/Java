package A02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                int n = Integer.parseInt(scanner.nextLine());

                while (n-- > 0 ){

                    Car car ;
                    String[] data = scanner.nextLine().split(" ");
                    if(data.length == 1){
                        car = new Car(data[0]);
                    } else {

                        String brand = data[0];
                        String model = data[1];
                        int power = Integer.parseInt(data[2]);
                    car = new Car(brand,model,power);
                    }


                    System.out.println(car.carInfo());
                }
    }
}
