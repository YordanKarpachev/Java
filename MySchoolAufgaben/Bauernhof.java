package verErbungUberlagernmitSuper;// b11_vererbung
// b_vererbung_mit_superkonstruktor

public class Bauernhof
{
    public static void main(String[] args)
    {
        Kuh   kuh1   = new Kuh("Lisa");
        Schaf schaf1 = new Schaf("Wolli");
        
        kuh1.setMilchleistung(20);
        schaf1.setWollmenge(5.7);
        
        System.out.println(kuh1.getName()          + " gibt " +
                           kuh1.getMilchleistung() + " Liter"  );
       System.out.println(schaf1.getName()        + " gibt " +
                          schaf1.getWollmenge()   + " kg"     );
    }
}