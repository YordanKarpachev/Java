package T04ExercisesWorkingwithAbstraction.A02CardRanks;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        CardRanks[] values = CardRanks.values();

        for (CardRanks card : values){
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card);
        }
    }
}
