// b15_grafische_komponente
// a_button

import java.awt.*;

public class Fenster extends Frame
{
   private Button        jimKnopf;   // Das ist der Sender.
   private ButtonHorcher horcher;    // Das ist der Empfaenger.
   
   public Fenster()
   {
      this.setSize(300, 200);
      this.setTitle("Mein Fenster");
      this.setLayout(null);          // ... damit wird der
                                     // Standard-LayoutManager
                                     // abgeschaltet.
      
      jimKnopf = new Button("Test");
      jimKnopf.setSize(60, 20);
      jimKnopf.setLocation(50, 50);
      this.add(jimKnopf);            // Den Button auf dieses
                                     // Fenster "kleben".
      
      horcher = new ButtonHorcher(); // Den Empfaenger erzeugen.
      
      jimKnopf.addActionListener(horcher); // Den Empfaenger beim
                                           // Sender anmelden.
   }
}