// b14_listener
// a_rundfunk_array

public class Hoerer
{
   String name;
   
   public Hoerer(String name)
   {
      this.name = name;
   }
   
   public void empfangeNachricht(String nachricht)
   {
      System.out.println(this.name + " weiss jetzt: " + nachricht);
   }
}