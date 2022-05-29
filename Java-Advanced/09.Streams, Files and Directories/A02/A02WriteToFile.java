package StreamsFilesAndDirectoriesLAB;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A02WriteToFile {
    public static void main(String[] args) {
        List<Character> symbol = new ArrayList<>();
        Collections.addAll(symbol, ',', '!', '?', '.');
        String path = "input.txt";
        try (FileInputStream in = new FileInputStream(path); FileOutputStream out = new FileOutputStream("output.txt")) {

            int oneByte = 0;
            while (oneByte >= 0){
                oneByte = in.read();

                if(!symbol.contains((char)oneByte)){
                    out.write(oneByte);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
