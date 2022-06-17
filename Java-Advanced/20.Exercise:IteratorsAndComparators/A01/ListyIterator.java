package A01;

import java.util.ArrayList;
import java.util.List;

public class ListyIterator {
    private List<String> list;
    private int index;

    public ListyIterator(String... list) {
        index = 0;
        this.list = List.of(list);
    }

    public boolean hasNext() {
        return index + 1 < list.size();
    }

    public boolean move() {
        if (hasNext()) {
            index++;
            return true;
        }
        return false;
    }

    public void print (){
        if(list.size() == 0){
            throw new IllegalArgumentException("Invalid Operation!");
        }
        System.out.println(list.get(index));
    }
}
