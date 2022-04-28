// 16_mvc
// b_neuer_view

public class Start
{
   public static void main(String[] args) throws Exception
   {
      GeldautomatView  view  = new GeldautomatView();
      GeldautomatModel model = new GeldautomatModel();
      
      new GeldautomatControl(view, model);
   }
}