package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private int capacity;
    private List<Person> roster;


    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        roster = new ArrayList<>();
    }

    public void add(Person person) {
        if (capacity > roster.size() ) {
            roster.add(person);
        }
    }

    public boolean remove(String name) {

        for (Person person : roster) {
            if (person.getName().equals(name)) {
                roster.remove(person);
                return true;
            }
        }
        return false;

    }

    public Person getPerson(String name, String hometown) {
        for (Person person : roster) {
            if (person.getName().equals(name) && person.getHometown().equals(hometown)) {
                return person;
            }
        }
        return null;
    }


    public int getCount(){

        if(roster.isEmpty()){
            return 0;
        }
        return roster.size() ;
    }


    public String getStatistics() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The people in the hotel %s are:\n", this.name));

        if (!roster.isEmpty()){
            for (int i = 0; i < roster.size(); i++) {
                if(i == roster.size() - 1){
                    sb.append(roster.get(i));
                } else {
                sb.append(roster.get(i).toString() + System.lineSeparator());}
            }
        }
        return sb.toString();
    }
}



