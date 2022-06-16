package A03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
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

    public int getYears() {
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
        int ressult = title.compareTo(other.title);
        if(ressult == 0){
            ressult = Integer.compare(this.year, other.year);
        }
        return ressult;
    }
}
