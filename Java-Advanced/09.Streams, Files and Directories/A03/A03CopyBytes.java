package StreamsFilesAndDirectoriesLAB;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A03CopyBytes {
    public static void main(String[] args) {
        String pathInput = "input.txt";
        String pathOutput = "output.txt";
        try (FileInputStream in = new FileInputStream(pathInput); FileOutputStream outputStream = new FileOutputStream(pathOutput))
        {
            int oneByte = 0;

            while ((oneByte = in.read()) >= 0 ) {
                if(oneByte == 10 || oneByte == 32 ){
                    outputStream.write(oneByte);
                } else {
                    String stringDigits = String.valueOf(oneByte);
                    for (int i = 0; i < stringDigits.length(); i++) {
                        outputStream.write(stringDigits.charAt(i));
                }
            }


            }
        } catch (IOException e ){
            e.printStackTrace();
        }
    }
}
