package IteratiorsAndComparators.A04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;

    public Book(String title, int years, String... authors) {
        this.setTitle(title);
        this.setYear(years);
        this.setAuthors(authors);
    }

    private List<String> authors;

    protected String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    private  void setYear(int years) {
        this.year = years;
    }

    public List<String> getAuthors() {
        return authors;
    }

    private void setAuthors(String... authors) {
        if(authors.length == 0){
          this.authors = new ArrayList<String>();

        } else {
        this.authors = new ArrayList<>(Arrays.asList(authors));}
    }

    @Override
    public int compareTo(Book other) {
        int result = 0;
        result = this.title.compareTo(other.title);
        if(result == 0){
            result = Integer.compare(this.year, other.year);
        }
        return result;
    }
}
