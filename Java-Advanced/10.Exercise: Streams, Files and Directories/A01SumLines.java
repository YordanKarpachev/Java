package StreamsFilesAndDirectoriesExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class A01SumLines {
    public static void main(String[] args) {
        String path = "src/StreamsFilesAndDirectoriesExercise/Resources/Exercises Resources/input.txt";
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(path));
            String line = reader.readLine();

            while (line != null) {
                long sum = 0;
                char[] chars = line.toCharArray();
                for (char aChar : chars) {
                    sum += aChar;
                }


                System.out.println(sum);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
