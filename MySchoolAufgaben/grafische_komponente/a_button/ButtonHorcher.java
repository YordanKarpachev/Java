// b15_grafische_komponente
// a_button

import java.awt.event.*;

public class ButtonHorcher implements ActionListener
{
  /**
   * Operation zum Empfang von Nachrichten
   * 
   * Die Operation actionPerformed() wird vom Sender
   * aufgerufen, wenn dieser Empfaenger sich beim
   * Sender angemeldet hat.
   * 
   * Die Nachricht ist ein Objekt vom Typ ActionEvent.
   * Die Nachricht informiert denEmpfaenger darueber,
   * dass der Button angeklickt wurde.
   */
   public void actionPerformed(ActionEvent nachricht)
   {
      System.out.println("Nachricht vom Button empfangen");
      System.out.println(nachricht);
      System.out.println();
   }
}