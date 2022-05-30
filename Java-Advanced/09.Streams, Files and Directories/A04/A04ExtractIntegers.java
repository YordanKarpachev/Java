package StreamsFilesAndDirectoriesLAB;

import java.io.*;
import java.util.Scanner;

public class A04ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new FileInputStream("input.txt"));
        PrintWriter printWriter = new PrintWriter(new FileOutputStream("output.txt"));

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                printWriter.println(scanner.nextInt());

            }
            scanner.next();
        }

        printWriter.close();
    }
}
