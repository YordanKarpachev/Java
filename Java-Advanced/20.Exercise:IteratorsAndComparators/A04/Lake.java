package ExercisesIteratorsAndComparators.A04;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable {

    List<Integer> list;

    public Lake(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    public class Frog implements Iterator<Integer> {
        int index =  0;
        int i = index;
        public boolean ersteRunde = false;

        @Override
        public boolean hasNext() {
            if (i >= list.size() && !ersteRunde) {
                ersteRunde = true;
                index = 1;
                i = 1;
            }
            return i < list.size() ;
        }

        @Override
        public Integer next() {


            index = i;
            i += 2;

            return list.get(index);
        }
    }
}
