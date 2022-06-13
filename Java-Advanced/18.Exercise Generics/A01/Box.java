package GenericsExercise.A01;

import java.util.ArrayList;
import java.util.List;

public class Box {
    String text;
    List<String> list;

    public Box() {
        list = new ArrayList<>();
    }

    public void add(String text){
        list.add(text);
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       list.forEach(a -> sb.append(String.format("%s: %s\n", a.getClass().getName(), a)));
        return sb.toString();
    }
}
