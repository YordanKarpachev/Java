package StreamsFilesAndDirectoriesLAB;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class A01ReadFile {
    public static void main(String[] args) {
        String path = "input.txt";


        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            int by = fileInputStream.read();

            while (by >= 0 ){
                System.out.printf("%s ", Integer.toBinaryString(by));
                by = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
