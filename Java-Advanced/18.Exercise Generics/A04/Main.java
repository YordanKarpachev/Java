package A04;



import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
                int n = Integer.parseInt(scanner.nextLine());

              Box<Integer> box = new Box<>();
        for (int i = 0; i < n; i++) {
          int input = Integer.parseInt(scanner.nextLine());
            box.add(input);
        }
        int[] indecies = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstIndex = indecies[0];
        int secondIndex = indecies[1];

        box.swap(firstIndex, secondIndex);

        System.out.println(box);
    }
}
