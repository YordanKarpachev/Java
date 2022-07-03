package A05;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings<E> extends ArrayList<E> {

    private List<String> data;


    public void push(String string) {
        data.add(string);
    }

    public String pop() {
        return data.get(data.size() - 1);
    }

    public String peek() {
        return data.remove(data.size() - 1);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }


}
