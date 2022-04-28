// b15_grafische_komponente
// b_button_mit_source

import java.awt.*;

public class Fenster extends Frame
{
   private Button        jimKnopf = new Button("Test");
   private ButtonHorcher horcher  = new ButtonHorcher();
   
   public Fenster()
   {
      this.setLocation(100, 200);
      this.setSize(300, 200);
      this.setTitle("Mein Fenster");
      this.setLayout(null);
      this.add(jimKnopf);
      this.setVisible(true);
      
      jimKnopf.addActionListener(horcher);
      jimKnopf.setSize(60, 20);
      jimKnopf.setLocation(50, 50);
   }
}