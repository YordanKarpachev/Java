package MVC.A_Tdd;

public class GeldAutomatViewTest {
    public static void main(String[] args) {
        GeldAutomatView view = new GeldAutomatView();


        Boolean test1 = false;

        String ergebnis1 = view.gibEingabe();
       test1 = "Test".equals(ergebnis1);

        System.out.println(test1);

        view.gibAus("Testausgabe");
    }
}
