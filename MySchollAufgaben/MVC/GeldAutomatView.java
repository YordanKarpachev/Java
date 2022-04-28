package MVC.A_Tdd;

import java.awt.*;

public class GeldAutomatView extends Frame {


    private TextField eingabeFeld;
    private Button    okButton;
    private Label      display;
    private FensterSchliesser schliesser;

    public GeldAutomatView(){

        schliesser = new FensterSchliesser();
        this.addWindowListener(schliesser);
        this.setSize(300, 300);
        this.setLocation(400, 200);
        this.setTitle("Deutsche Bank");
        this.setVisible(true);
        this.setLayout(null);

        eingabeFeld = new TextField();
        eingabeFeld.setSize(50, 20);
        eingabeFeld.setLocation(50, 180);
        this.add(eingabeFeld);

        okButton = new Button("OK");
        okButton.setSize(50, 20);
        okButton.setLocation(200, 180);
        this.add(okButton);

        display = new Label("Bitte PIN eingeben");
        display.setSize(200, 20 );
        display.setLocation(50, 80);
        display.setBackground(Color.BLUE);
        display.setForeground(Color.WHITE);
        display.setAlignment(Label.CENTER);
        display.setFont(new Font("Arial", Font.BOLD, 16));
        this.add(display);
    }
    public String gibEingabe() {
        return eingabeFeld.getText();
    }

    public void gibAus(String pruefErgebnis) {
      display.setText(pruefErgebnis);
    }

    public void meldeAn(GeldAutomatControl control) {

        okButton.addActionListener(control);
    }
}
