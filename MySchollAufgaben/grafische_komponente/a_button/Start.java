// b15_grafische_komponente
// a_button

public class Start
{
   public static void main(String[] args)
   {
      Fenster fenster1 = new Fenster();
      
      fenster1.setLocation(100, 200); // Die Position des Fensters
                                      // auf dem Bildschirm wird
                                      // gesetzt. Genauer:
                                      // Die Position der linken
                                      // oberen Ecke des Fensters
                                      // wird gesetzt.
      
      // 1. Parameter: "x-Position" (Abstand von der linken Kante)
      // 2. Parameter: "y-Position" (Abstand von der oberen Kante)
      
      fenster1.setVisible(true);
   }
}