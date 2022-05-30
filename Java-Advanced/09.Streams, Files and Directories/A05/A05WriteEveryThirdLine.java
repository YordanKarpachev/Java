package StreamsFilesAndDirectoriesLAB;

import java.io.*;

public class A05WriteEveryThirdLine {
    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new FileReader("input.txt")) ;
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"))) {
            int counter = 1;
            String line = in.readLine();
            while (line != null) {
                if (counter % 3 == 0) {
                    out.println(line);
                } counter ++;
                line = in.readLine();
            }


        }  catch (IOException e ){
            e.printStackTrace();
        }


    }
}
