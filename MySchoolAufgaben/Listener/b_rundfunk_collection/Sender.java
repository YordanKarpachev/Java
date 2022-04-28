// b14_listener
// a_rundfunk_array

import java.util.HashSet;

public class Sender
{
   private HashSet<Hoerer> hoererKartei = new HashSet<Hoerer>();
   
   public void anmelden(Hoerer neuerHoerer)
   {
      hoererKartei.add(neuerHoerer);
   }
   
   public void abmelden(Hoerer unzufriedenerHoerer)
   {
      hoererKartei.remove(unzufriedenerHoerer);
   }
   
   public void sendeNachricht(String text)
   {
      for(Hoerer hoerer : hoererKartei)
      {
         hoerer.empfangeNachricht(text);
      }
   }
}