package SetsandMapsAdvancedExercises;

import java.util.*;

public class A02SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstAndSecond = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int first = firstAndSecond[0];
        int second = firstAndSecond[1];

        Set<Integer> firstSet = new LinkedHashSet<>();

        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < first; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));

        }

        for (int i = 0; i < second; i++) {
          secondSet.add(Integer.parseInt(scanner.nextLine()));

        }

        for (Integer integer : firstSet) {
            if (secondSet.contains(integer)){
                System.out.print(integer + " ");}
        }
    }
}
