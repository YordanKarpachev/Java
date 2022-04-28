// b15_grafische_komponente
// c_button_ohne_source

import java.awt.*;

public class Fenster extends Frame
{
   private Button        jimKnopf = new Button("Test");
   private ButtonHorcher horcher;
   
   public Fenster()
   {
      this.setLocation(100, 200);
      this.setSize(300, 200);
      this.setTitle("Mein Fenster");
      this.setLayout(null);
      this.add(jimKnopf);
      this.setVisible(true);
      
      // Dieses Fenster erzeugt ein ButtonHorcher-Objekt
      // und gibt sich ihm sofort bekannt, indem es sich
      // selbst ("this") als Parameter des Konstruktors
      // uebergibt:
      horcher = new ButtonHorcher(this);
      
      jimKnopf.addActionListener(horcher);
      jimKnopf.setSize(60, 20);
      jimKnopf.setLocation(50, 50);
   }
}