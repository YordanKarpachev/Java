package A02PointOfRectangle;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] bottomCordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // {bottomLeftX} {bottomLeftY} {topRightX} {topRightY}
        Rectangle rectangle = new Rectangle(
                new Point(bottomCordinates[0], bottomCordinates[1]), new Point(bottomCordinates[2], bottomCordinates[3]));

                int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int[] pointCordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Point point = new Point(pointCordinates[0],pointCordinates[1] );
            System.out.println(rectangle.contains(point));
        }
    }
}
