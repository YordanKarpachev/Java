package MVC.A_Tdd;

public class GeldautomatModel {
    private String pin = "4711";
    public String pruefe(String eingabe) {
        String ergebnis =  pin.equals(eingabe) ?  "Eingabe ok" : "Falsche PIN";
        return ergebnis;
    }
}
