package MVC.A_Tdd;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FensterSchliesser extends WindowAdapter {
    public void windowClosing(WindowEvent xKlick)
    {
        System.exit(0); // Beendet das Programm.
    }

}
