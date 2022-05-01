package com.softuni.WorkingwithAbstraction.A02Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cordinatesOfRectangle = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int xBottomLeft = cordinatesOfRectangle[0];
        int yBottomLeft = cordinatesOfRectangle[1];

        Point bottomLeft = new Point(xBottomLeft, yBottomLeft);

        int xTopRight = cordinatesOfRectangle[2];

        int yTopRight = cordinatesOfRectangle[3];

        Point topRight = new Point(xTopRight, yTopRight);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

         int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {

            int[] pointCordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            Point current = new Point(pointCordinates[0], pointCordinates[1] );
            System.out.println(rectangle.contains(current));


        }
    }
}
