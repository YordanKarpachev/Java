package IteratiorsAndComparators.A04;

import java.util.Comparator;

public class BookComparator <Book> implements Comparator<IteratiorsAndComparators.A04.Book> {

    @Override
    public int compare(IteratiorsAndComparators.A04.Book o1, IteratiorsAndComparators.A04.Book o2) {
        int result = 0;
        result = o1.getTitle().compareTo(o2.getTitle());
        if (result == 0)
        {
            result = Integer.compare(o1.getYear(), o2.getYear());
        }
        return result;
    }
}
