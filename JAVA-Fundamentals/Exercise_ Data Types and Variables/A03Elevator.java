package DataTypeUndVarianlenExercise09;

import java.util.Scanner;

public class A03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople  = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        if (numberOfPeople % capacity == 0 )
        {
            System.out.println(numberOfPeople / capacity);
        } else {
            System.out.println(numberOfPeople / capacity + 1 );
        }
    }
}
