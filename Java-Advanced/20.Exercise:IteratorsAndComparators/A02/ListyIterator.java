package A02;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable{
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

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < list.size();
            }

            @Override
            public Object next() {
                return list.get(index++);
            }
        };
    }
   public void PrintAll () {
       for (String s : list) {
           System.out.print(s + " ");
       }
       System.out.println();

   }
}
