package StreamsFilesAndDirectoriesExercise;

import java.io.*;

public class A03ALLCAPITALS {
    public static void main(String[] args) throws IOException {
        String pathInput = "src/StreamsFilesAndDirectoriesExercise/Resources/Exercises Resources/input.txt";
        String outputPath = "src/StreamsFilesAndDirectoriesExercise/output.txt";
        BufferedReader input  = new BufferedReader(new FileReader(pathInput));
        PrintWriter output = new PrintWriter(new FileWriter(outputPath));
        input.lines().forEach(line -> output.println(line.toUpperCase()));

        output.close();
    }
}
