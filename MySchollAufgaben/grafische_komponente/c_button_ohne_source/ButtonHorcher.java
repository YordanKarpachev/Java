// b15_grafische_komponente
// b_button_ohne_source

import java.awt.*;
import java.awt.event.*;

public class ButtonHorcher implements ActionListener
{
   private Fenster fenster;
   
   // Bei dieser Loesung wird das Fenster-Objekt dem
   // ButtonHorcher ueber den Parameter des Konstruktors
   // uebergeben. Die Nachricht muss dann nicht jedesmal
   // "befragt" werden, woher sie kommt.
   
   public ButtonHorcher(Fenster fenster)
   {
      this.fenster = fenster;
   }
   
   public void actionPerformed(ActionEvent nachricht)
   {
      fenster.setBackground(Color.YELLOW);
   }
}