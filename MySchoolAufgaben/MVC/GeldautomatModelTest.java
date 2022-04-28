package MVC.A_Tdd;

public class GeldautomatModelTest {
    public static void main(String[] args) {
        GeldautomatModel model = new GeldautomatModel();

        boolean test1 = false;
        boolean test2 = false;
        boolean test3 = false;
        boolean test4 = false;

       String ergebnis =  model.pruefe("4711");
        String ergebnis2 =  model.pruefe("0815");
        String ergebnis3 =  model.pruefe("");
        String ergebnis4 =  model.pruefe(null);

        test1 =  "Eingabe ok".equals(ergebnis);
        test2 =  "Falsche PIN".equals(ergebnis2);
        test3 =  "Falsche PIN".equals(ergebnis3);
        test4 =  "Falsche PIN".equals(ergebnis4);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }
}
