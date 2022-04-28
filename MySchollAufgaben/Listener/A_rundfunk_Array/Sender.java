// b14_listener
// a_rundfunk_array

public class Sender
{
   private Hoerer[] hoererKartei = new Hoerer[100];
   private int      hoererAnzahl = 0;
   
  /**
   * Ein neuer Hoerer, der sich anmeldet, wird in der
   * Hoererkartei gespeichert.
   */
   public void anmelden(Hoerer neuerHoerer)
   {
      hoererKartei[hoererAnzahl] = neuerHoerer;
      hoererAnzahl++;
   }
   
  /**
   * Die als Parameter uebergebene Nachricht wird an
   * ALLE angemeldeten hoerer geschickt.
   */
   public void sendeNachricht(String text)
   {
      for(int i = 0; i < hoererAnzahl; i++)
      {
         // Ein Hoerer muss in der Lage sein, eine
         // Nachricht zu empfangen:
         
         hoererKartei[i].empfangeNachricht(text);
      }
   }
}