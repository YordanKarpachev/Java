package MVC.A_Tdd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeldAutomatControl implements ActionListener {

    GeldAutomatView view;
    GeldautomatModel model;

    public GeldAutomatControl(GeldAutomatView view, GeldautomatModel model) {
        this.view = view;
        this.model = model;

        view.meldeAn(this);
    }

    @Override
    public void actionPerformed(ActionEvent klick) {

        String eingabe = view.gibEingabe();
       String ergebnis=  model.pruefe(eingabe);
       view.gibAus(ergebnis);

    }
}
