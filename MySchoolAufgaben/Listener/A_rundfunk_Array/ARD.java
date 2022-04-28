// b14_listener
// a_rundfunk_array

public class ARD
{
   public static void main(String[] args)
   {
      Sender ndr     = new Sender();
      Sender rb      = new Sender();
      Hoerer hoerer1 = new Hoerer("Paul");
      Hoerer hoerer2 = new Hoerer("Lydia");
      
      // Den ersten Hoerer beim NDR anmelden:
      ndr.anmelden(hoerer1);
      rb.anmelden(hoerer1);
      
      // Den zweiten Hoerer bei Radio Bremen anmelden:
      rb.anmelden(hoerer2);
      
      ndr.sendeNachricht("Elvis lebt!");
      rb.sendeNachricht("Werder Bremen wird Meister.");
      
      ndr.sendeNachricht("Die Erde ist eine Scheibe.");
      rb.sendeNachricht("Die Rente ist sicher.");
   }
}