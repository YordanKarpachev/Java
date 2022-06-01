package StreamsFilesAndDirectoriesExercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A02SumBytes {
    public static void main(String[] args) {
        String path = "src/StreamsFilesAndDirectoriesExercise/Resources/Exercises Resources/input.txt";

        try {
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String line = bf.readLine();
            long sum = 0;

            while (line != null){
                for (char c : line.toCharArray()) {
                    sum += c;
                }



                line = bf.readLine();
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
