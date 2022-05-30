package StreamsFilesAndDirectoriesLAB;

import java.io.File;
import java.util.Arrays;

public class A07ListFiles {
    public static void main(String[] args) {
        File root = new File("C:\\Users\\yorda\\Desktop\\Softuni\\Java Advanced Moq Kurs May 2022\\" +
                "10.Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        File[] files = root.listFiles();

        Arrays.stream(files)
                .filter(File::isFile)
                .forEach(a -> System.out.println(a.getName()+": ["+a.length() + "]"));
    }
}
