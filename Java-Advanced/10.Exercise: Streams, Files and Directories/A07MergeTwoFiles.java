package StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class A07MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        Path pathInputOne = Paths.get("src/StreamsFilesAndDirectoriesExercise/Resources/inputOne.txt");
        Path pathInputTwo = Paths.get("src/StreamsFilesAndDirectoriesExercise/Resources/inputTwo.txt");
       Path  pathOutput =Paths.get("src/StreamsFilesAndDirectoriesExercise/output.txt");
        List<String> firstFile = Files.readAllLines(pathInputOne);
        List<String > secondFile = Files.readAllLines(pathInputTwo);
        Files.write(pathOutput, firstFile);
        Files.write(pathOutput, secondFile, StandardOpenOption.APPEND);

    }
}
