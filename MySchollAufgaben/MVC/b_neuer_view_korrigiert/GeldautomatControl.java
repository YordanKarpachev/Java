// 16_mvc
// b_neuer_view

import java.awt.event.*;

public class GeldautomatControl implements ActionListener
{
   GeldautomatView  view;
   GeldautomatModel model;
   
   public GeldautomatControl(GeldautomatView  view,
                             GeldautomatModel model) throws Exception
   {
      this.view  = view;
      this.model = model;
      System.out.println("Im control: " + this);
      view.meldeAn(this);
   }
   
   public void actionPerformed(ActionEvent klick)
   {
      String eingabe  = view.gibEingabe();
      String ergebnis = model.pruefe(eingabe);
      view.gibAus(ergebnis);
   }
}