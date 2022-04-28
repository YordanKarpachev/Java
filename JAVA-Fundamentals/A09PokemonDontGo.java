package ListExercise18;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distancePokemons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
           int sum = 0 ;
        while (distancePokemons.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index <= distancePokemons.size() - 1) {
                int removeElement = distancePokemons.get(index);
                sum += removeElement;
                distancePokemons.remove(index);

                for (int i = 0; i <= distancePokemons.size() - 1; i++) {
                    int currentNumber = distancePokemons.get(i);

                    if (currentNumber <= removeElement) {
                        currentNumber += removeElement;

                    } else {
                        currentNumber -= removeElement;

                    }
                    distancePokemons.set(i, currentNumber);
                }
            } else if (index < 0) {
                       int removedElementFirst = distancePokemons.get(0);
                       sum += removedElementFirst;
                       int lastElement = distancePokemons.get(distancePokemons.size() - 1);
                       distancePokemons.set(0, lastElement);

                for (int i = 0; i <= distancePokemons.size() - 1; i++) {
                    int currentNumber = distancePokemons.get(i);

                    if (currentNumber <= removedElementFirst) {
                        currentNumber += removedElementFirst;

                    } else {
                        currentNumber -= removedElementFirst;

                    }
                    distancePokemons.set(i, currentNumber);
                }

            }


            else if (index > distancePokemons.size() - 1) {
int removedElementLast = distancePokemons.get(distancePokemons.size() - 1);
sum += removedElementLast;
int firtElement = distancePokemons.get(0);
distancePokemons.set(distancePokemons.size()  - 1, firtElement);
                for (int i = 0; i <= distancePokemons.size() - 1; i++) {
                    int currentNumber = distancePokemons.get(i);

                    if (currentNumber <= removedElementLast) {
                        currentNumber += removedElementLast;

                    } else {
                        currentNumber -= removedElementLast;

                    }
                    distancePokemons.set(i, currentNumber);
                }

            }

        }
    System.out.println(sum);
    }
    }

