package A02Library;

import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new Iterator<Book>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return books.length > index;
            }

            @Override
            public Book next() {

                return books[index++];
            }
        };
    }

}
