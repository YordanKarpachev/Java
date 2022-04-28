// b16_mvc
// b_neuer_view

public class GeldautomatViewTest
{
   public static void main(String[] args) throws Exception
   {
      GeldautomatView view = new GeldautomatView();
      
      boolean test1 = false;
      
      String ergebnis1 = view.gibEingabe();
      test1 = "".equals(ergebnis1);
      
      System.out.println(test1);
      
      view.gibAus("Testausgabe");
   }
}