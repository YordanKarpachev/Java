package MVC.A_Tdd;

public class Start {
    public static void main(String[] args) {
        GeldAutomatView view = new GeldAutomatView();
        GeldautomatModel model = new GeldautomatModel();

        new GeldAutomatControl(view, model);
    }
}
