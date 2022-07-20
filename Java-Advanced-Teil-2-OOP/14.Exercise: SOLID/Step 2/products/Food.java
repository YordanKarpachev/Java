package solid.products;

public abstract class Food {
    private double gram;

    public Food(double gram){
        this.gram = gram;
    }

    public double getGram(){
        return this.gram;
    }

    public double getAmountFoodInKg(){
        return this.getGram() / 1000;
    }
}
