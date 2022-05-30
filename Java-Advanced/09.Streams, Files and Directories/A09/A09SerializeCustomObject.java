package StreamsFilesAndDirectoriesLAB;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A09SerializeCustomObject {
    public static class Cube implements Serializable {
        String color;
        double width;
        double lenght;
        double depth;

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cube cube = new Cube();
        cube.color = "green";
        cube.width = 15.3;
        cube.lenght = 12.4;
        cube.depth = 3;
        String path = "saveCube.txt";

//SERILIZATION
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("saveCube.txt"));
        objectOutputStream.writeObject(cube);


//DESETIALIZATION
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("saveCube.txt"));

        Cube o = (Cube) objectInputStream.readObject();
    }
}
