// b15_grafische_komponente
// b_button_mit_source

import java.awt.*;
import java.awt.event.*;

public class ButtonHorcher implements ActionListener
{
   public void actionPerformed(ActionEvent nachricht)
   {
      // Die Nachricht wird gefragt, wer sie geschickt hat:
      Button quelle = (Button) nachricht.getSource();
      
      // Der Button wird gefragt, auf welcher grafischen
      // Komponente er "klebt":
      Fenster fenster = (Fenster) quelle.getParent();
      
      // Der Zustand des Fensters wird veraendert:
      fenster.setBackground(Color.YELLOW);
   }
}