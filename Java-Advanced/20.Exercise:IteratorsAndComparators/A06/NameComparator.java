package A06;

import java.util.Comparator;
import java.util.Locale;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if(p1.getName().length() == p2.getName().length()){

            char firstPerson = p1.getName().toLowerCase().charAt(0);
            char secondPerson = p2.getName().toLowerCase().charAt(0);
            return Character.compare(firstPerson, secondPerson);

        }
        return Integer.compare(p1.getName().length(), p2.getName().length());
    }
}
