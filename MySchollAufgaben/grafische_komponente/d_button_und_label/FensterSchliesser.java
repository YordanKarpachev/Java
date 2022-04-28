// b15_grafische_komponente
// d_button_und_label

import java.awt.event.*;

public class FensterSchliesser extends WindowAdapter
{
   public void windowClosing(WindowEvent xKlick)
   {
      System.exit(0); // Beendet das Programm.
   }
}