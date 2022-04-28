// b16_mvc
// b_neuer_view

public class GeldautomatModel
{
   private String pin = "4711";
   
   public String pruefe(String eingabe)
   {
       String pruefErgebnis = "???";
       
       if(pin.equals(eingabe))
       {
          pruefErgebnis = "Eingabe ok";
       }
       else
       {
          pruefErgebnis = "Falsche PIN";
       }
       
       return pruefErgebnis;
   }
}