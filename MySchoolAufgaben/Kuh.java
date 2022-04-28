package verErbungUberlagernmitSuper;// b11_verebung
// b_vererbung_mit_superkonstruktor

public class Kuh extends Tier {
    private int milchleistung;


    public Kuh(String name) {
        super(name);


    }


    public String getName() {
        return "Die Milchkuh "+ super.getName();
    }


    public void setMilchleistung(int milch) {
        this.milchleistung = milch;
    }

    public int getMilchleistung() {
        return this.milchleistung;
    }
}