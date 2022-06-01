package StreamsFilesAndDirectoriesExercise;

import java.io.*;
import java.util.Scanner;

public class A05LineNumbers {
    public static void main(String[] args) {
        String pathInput = "src/StreamsFilesAndDirectoriesExercise/Resources/inputLineNumbers.txt";
        String pathOutput = "src/StreamsFilesAndDirectoriesExercise/output.txt";

        try
                (BufferedReader bf = new BufferedReader(new FileReader(pathInput));
                 PrintWriter printWriter = new PrintWriter(new FileWriter(pathOutput));) {

            String line = bf.readLine();
            int counter = 0;
            while (line != null){
                printWriter.println(++counter + ". "+line);


                line = bf.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}