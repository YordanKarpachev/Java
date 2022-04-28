package verErbungUberlagernmitSuper;// b11_verebung
// b_vererbung_mit_superkonstruktor

public class Schaf extends Tier
{
   private double wollmenge;
   
   public Schaf(String name)
   {
      super(name);

   }
   
   public void setWollmenge(double wolle)
   {
       this.wollmenge = wolle;
   }
   
   public double getWollmenge()
   {
       return this.wollmenge;
   }
}