// b16_mvc
// b_neuer_view

import java.io.*;

public class GeldautomatView
{
   private GeldautomatControl control;
   private InputStreamReader  isr;
   private BufferedReader     buf;
   private String             ein;
   
   public GeldautomatView() throws Exception
   {
      isr = new InputStreamReader(System.in);
      buf = new BufferedReader(isr);
   }
   
   public String gibEingabe()
   {
      return this.ein;
   }
   
   public void gibAus(String pruefErgebnis)
   {
      System.out.println(pruefErgebnis);
   }
   
   public void meldeAn(GeldautomatControl control) throws Exception
   {
      this.control = control;
      
      do
      {
         System.out.println("Bitte PIN eingeben");
         ein = buf.readLine();
         control.actionPerformed(null);
      }
      while(!ein.equals(""));
   }
}