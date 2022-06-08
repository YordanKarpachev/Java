package DefiningClassesExercise.A06;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    int  budge = 0;
  private   List<Pokemon> pokemons = new ArrayList<>();

    public void setBudge( ) {
        budge++;
    }

    public void addPokemon(Pokemon pokemons) {
        this.pokemons.add(pokemons);
    }

    public Trainer(String name) {
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public int getBudge() {
        return budge;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    @Override
    public String toString() {
        return
                 name + " " + budge + " " +pokemons.size() ;

    }

    public boolean hasElement (String command){
        return this.pokemons.stream().anyMatch(a -> a.getElement().equals(command));
    }

    public void update (String element){
        if(hasElement(element)){
            budge += 1;
        } else {
            pokemons.forEach(Pokemon::loseHealth);
            pokemons.removeIf(Pokemon::isDeath);
        }
    }
}
