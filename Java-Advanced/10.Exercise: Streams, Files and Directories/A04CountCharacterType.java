package StreamsFilesAndDirectoriesExercise;

import java.io.*;

public class A04CountCharacterType {
    public static void main(String[] args) {
        String pathInput = "src/StreamsFilesAndDirectoriesExercise/Resources/Exercises Resources/input.txt";
        String pathOutput = "src/StreamsFilesAndDirectoriesExercise/output.txt";
        try {
            FileReader fileReader = new FileReader(pathInput);
            PrintWriter writer = new PrintWriter(new FileWriter(pathOutput));
            int symbol = fileReader.read();

            int volwels = 0;
            int consonants = 0;
            int punctation = 0;

            while (symbol >= 0) {
                char symbolChar = (char) symbol;

                if (isVolwels(symbolChar)) {
                    volwels++;
                } else if (isPunktuation(symbolChar)) {
                    punctation++;
                } else if (!Character.isWhitespace(symbolChar) ) {
                    consonants++;
                }


                symbol = fileReader.read();
            }

            writer.println("Vowels: " + volwels);
            writer.println("Consonants: " + consonants);
            writer.println("Punctuation: " + punctation);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static boolean isPunktuation(char symbolChar) {
        return symbolChar == '!' || symbolChar == ',' || symbolChar == '.' || symbolChar == '?' ;
    }

    private static boolean isVolwels(char symbolChar) {
        return symbolChar == 'a' || symbolChar == 'e' || symbolChar == 'i' || symbolChar == 'o' || symbolChar == 'u';
    }


}
