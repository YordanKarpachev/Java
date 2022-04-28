// b15_grafische_komponente
// d_button_und_label

import java.awt.*;
import java.awt.event.*;

public class ButtonHorcher implements ActionListener
{
   private Label flaeche;
   
   public ButtonHorcher(Label flaeche)
   {
      this.flaeche = flaeche;
   }
   
   public void actionPerformed(ActionEvent nachricht)
   {
      flaeche.setBackground(Color.RED);
      flaeche.setText("Alles rot");
   }
}