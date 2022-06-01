package StreamsFilesAndDirectoriesExercise;

import java.io.*;
import java.util.*;

public class A06WordCount {
    public static void main(String[] args) throws IOException {
        String pathWords = "src/StreamsFilesAndDirectoriesExercise/Resources/Exercises Resources/words.txt";
        String pathText = "src/StreamsFilesAndDirectoriesExercise/Resources/Exercises Resources/text.txt";
        String pathOutput = "src/StreamsFilesAndDirectoriesExercise/result.txt";
        Scanner scanner = new Scanner(new FileReader(pathWords));

        Map<String, Integer> words = new LinkedHashMap<>();
        for (String s : scanner.nextLine().split(" ")) {
            words.putIfAbsent(s, 0);
            //   words.put(s, words.get(s) + 1);
        }

        BufferedReader bf = new BufferedReader(new FileReader(pathText));
        String line = bf.readLine();

        while (line != null) {
            String[] s = line.split(" ");
            for (String s1 : s) {
                if (words.containsKey(s1)) {
                    words.put(s1, words.get(s1) + 1);
                }
            }
            line = bf.readLine();

        }


        PrintWriter writer = new PrintWriter(new FileWriter(pathOutput));

        words
                .forEach((key, value) -> writer.printf("%s - %d%n", key, value));
        writer.close();
    }

}

