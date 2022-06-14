package A04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T> {
    T text;
    List<T> list;

    public Box() {
        list = new ArrayList<>();
    }

    public void add(T text) {
        list.add(text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        list.forEach(a -> sb.append(String.format("%s: %s\n", a.getClass().getName(), a)));
        return sb.toString();
    }

public void swap (int firstindex, int secondindex){
    Collections.swap(list, firstindex, secondindex);
}
}
