// b15_grafische_komponente
// d_button_und_label

import java.awt.*;

public class Fenster extends Frame
{
   private Button            jimKnopf   = new Button("Test");
   private Label             flaeche    = new Label();
   private ButtonHorcher     horcher    = new ButtonHorcher(flaeche);
   private FensterSchliesser schliesser = new FensterSchliesser();
   
   public Fenster()
   {
      this.setSize(300, 200);
      this.setLocation(100, 200);
      this.setTitle("Mein Fenster");
      this.setLayout(null);
      this.addWindowListener(schliesser);
      this.setVisible(true);
      
      jimKnopf.addActionListener(horcher);
      jimKnopf.setSize(60, 20);
      jimKnopf.setLocation(50, 50);
      this.add(jimKnopf);
      
      flaeche.setSize(90, 20);
      flaeche.setLocation(160, 50);
      flaeche.setBackground(Color.GREEN);
      flaeche.setText("Ein Label");
      flaeche.setAlignment(Label.CENTER);
      this.add(flaeche);
   }
}