package A04TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] colors = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        List<Lights> lights = new ArrayList<>();
        for(String ampel : colors){
            Lights lights1 = new Lights(Color.valueOf(ampel));

            lights.add(lights1);
        }


        for (int i = 0; i < n; i++) {

            lights.forEach(a -> {
                a.changeColor();
                System.out.print(a.getColor()+ " ");
            });
            System.out.println();
        }
    }
}
