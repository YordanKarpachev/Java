package easterBasket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {

    String material;
    int capacity;

    List<Egg> data;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public void addEgg(Egg egg) {
        if (data.size() < capacity) {
            data.add(egg);
        }
    }

    public boolean removeEgg(String color) {
        boolean removed = false;
        if (data.size() > 0) {
            for (Egg egg : data) {
                if (egg.getColor().equals(color)) {
                    data.remove(egg);
                    return true;
                }
            }
        }

        return removed;
    }

    public Egg getStrongestEgg() {
        List<Egg> collect = data.stream().sorted(Comparator.comparing(Egg::getStrength)).collect(Collectors.toList());
        if (collect.size() > 0) {
            return collect.get(collect.size() - 1);
        }
        return null;
    }

    public Egg getEgg(String color) {

        List<Egg> collect = data.stream().filter(a -> a.getColor().equals(color)).collect(Collectors.toList());
        if (collect.isEmpty()) {
            return null;
        }
        return collect.get(0);

    }

    public int getCount() {
        if (data.isEmpty()) {
            return 0;
        }

        return data.size();
    }

    public String report() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s basket contains:\n", this.material));
        for (int i = 0; i < data.size(); i++) {
            if (i == data.size() - 1) {
                Egg egg = data.get(i);
                sb.append(String.format(egg.toString()));
            } else {
                Egg egg = data.get(i);
                sb.append(String.format(egg.toString() + System.lineSeparator()));
            }
        }
        return sb.toString();
    }
}
