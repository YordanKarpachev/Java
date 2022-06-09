package DefiningClassesExercise.A07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    String name;
    Car car;
    Company company;
    List<Parents> parents = new ArrayList<>();
    List<Children> children = new ArrayList<>();
    List<Pokemon> pokemons = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCar() {
        if (car != null){
        return car.toString();}
        else return "";
    }

    public void addCar(Car car) {
        this.car = car;
    }

    public String getCompany() {
        if (this.company != null) {
            return company.toString();
        }
        return "";
    }
    public void printPokemon(){
    if (!pokemons.isEmpty()){
        pokemons.forEach(System.out::println);
    }


    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void getParents() {
        if(parents != null){
            parents.forEach(a -> System.out.println(a));
        }
    }

    public void addParents(Parents parents) {
        this.parents.add(parents);
    }

    public String getChildren() {
        if (children.size() == 0) {
            return "";
        } else {

            return children.toString();
        }

    }

    public void addChildren(Children children) {
        this.children.add(children);
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }


    public void addPokemon(Pokemon pokemon) {
        getPokemons().add(pokemon);
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name + System.lineSeparator() +
                "Company:" + System.lineSeparator() +
                (company == null ? "" : company + System.lineSeparator()) +
                "Car:" + System.lineSeparator() +
                (car == null ? "" : car + System.lineSeparator()) +
                "Pokemon:" + System.lineSeparator() +
                ((pokemons.isEmpty()) ? "" : pokemons.stream().map(Pokemon::toString).collect(Collectors.joining(System.lineSeparator())) + System.lineSeparator()) +
                "Parents:" + System.lineSeparator() +
                ((parents.isEmpty()) ? "" : parents.stream().map(Parents::toString).collect(Collectors.joining(System.lineSeparator())) + System.lineSeparator()) +
                "Children:" + System.lineSeparator() +
                ((children.isEmpty()) ? "" : children.stream().map(Children::toString).collect(Collectors.joining(System.lineSeparator())) + System.lineSeparator());
    }

    public void printChildern() {
        if(!children.isEmpty()){
            children.forEach(System.out::println);
        }
    }

    public void printCompany() {
        if(company != null){
            System.out.println(company);
        }
    }

    public void printCar() {
        if(car != null){
            System.out.println(car);
        }
    }
}
