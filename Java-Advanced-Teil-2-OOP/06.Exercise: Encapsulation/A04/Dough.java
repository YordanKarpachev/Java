package A04;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;



    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")
                || flourType.equals("Crispy") ||
                flourType.equals("Chewy") || flourType.equals("Homemade")) {
            this.flourType = flourType;

        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String BakingTechnique) {
        if (BakingTechnique.equals("White") || BakingTechnique.equals("Wholegrain") || BakingTechnique.equals("Crispy") ||
                BakingTechnique.equals("Chewy") || BakingTechnique.equals("Homemade")) {
            this.bakingTechnique = BakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public double calculateCalories() {
        double techniqueWert = wertBerechnen(getBakingTechnique());
        double werType = wertBerechnen(getFlourType());

        return (getWeight() *2 ) * techniqueWert * werType;
    }

    public double getWeight() {
        return weight;
    }



    public String getFlourType() {
        return flourType;
    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    private double wertBerechnen(String BakingTechnique) {
        switch (BakingTechnique) {
            case "White":

                return 1.5;

            case "Wholegrain":

                return 1.0;

            case "Crispy":

                return 0.9;

            case "Chewy":

                return 1.1;

            case "Homemade":

                return 1.0;

        } return 0;
    }
}


