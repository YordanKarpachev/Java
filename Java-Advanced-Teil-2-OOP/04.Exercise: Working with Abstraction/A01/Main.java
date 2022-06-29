package T04ExercisesWorkingwithAbstraction.A01CardSuits;

public class Main {
    public static void main(String[] args) {
        CardSuit[] values = CardSuit.values();
        System.out.println("Card Suits:");

        for(CardSuit card : values){
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card);
        }
    }
}
